package com.example.jastipin.page

import android.annotation.SuppressLint
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

sealed class BottomNavigationScreen(val title: String) {
    object HomeScreen : BottomNavigationScreen("Home")
    object HistoryScreen : BottomNavigationScreen("History")
    object WishlistScreen : BottomNavigationScreen("Wishlist")
    object AccountScreen : BottomNavigationScreen("Account")
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanBottom() {
    val navController = rememberNavController()

    val items = listOf(
        BottomNavigationScreen.HomeScreen,
        BottomNavigationScreen.HistoryScreen,
        BottomNavigationScreen.WishlistScreen,
        BottomNavigationScreen.AccountScreen
    )
    NavHost(
        navController = navController,
        startDestination = BottomNavigationScreen.HomeScreen.title
    ) {
        composable(BottomNavigationScreen.HomeScreen.title) {
            HomeScreen(navController = navController)
        }
        composable(BottomNavigationScreen.HistoryScreen.title) {
            HistoryScreen(navController = navController)
        }
        composable(BottomNavigationScreen.WishlistScreen.title) {
            WishlistScreen(navController = navController)
        }
        composable(BottomNavigationScreen.AccountScreen.title) {
            AccountScreen(navController = navController)
        }
    }

    Scaffold(
        bottomBar = {
            BottomNavigation (
                backgroundColor = Color.White,
                elevation = 10.dp
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                items.forEach { screen ->
                    BottomNavigationItem(
                        selected = currentRoute == screen.title,
                        onClick = {
                            navController.navigate(screen.title) {
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                            }
                        },
                        icon = {
                            when (screen) {
                                BottomNavigationScreen.HomeScreen -> Icon(
                                    Icons.Default.Home,
                                    contentDescription = "Home"
                                )

                                BottomNavigationScreen.HistoryScreen -> Icon(
                                    Icons.Default.CalendarToday,
                                    contentDescription = "History"
                                )

                                BottomNavigationScreen.WishlistScreen -> Icon(
                                    Icons.Default.Favorite,
                                    contentDescription = "Favorite"
                                )
                                BottomNavigationScreen.AccountScreen -> Icon(
                                    Icons.Default.AccountCircle,
                                    contentDescription = "Account"
                                )
                            }
                        },
                        label = {
                            Text(text = screen.title,
                                color = if (currentRoute == screen.title)
                                    Cyan else Color.Gray)
                        },
                        selectedContentColor = Cyan,
                        unselectedContentColor = Color.Gray,)
                }
            }
        },
        content = {
            NavHost(
                navController = navController,
                startDestination = BottomNavigationScreen.HomeScreen.title
            ) {
                composable(BottomNavigationScreen.HomeScreen.title) {
                    HomeScreen(navController = navController)
                }
                composable(BottomNavigationScreen.HistoryScreen.title) {
                    HistoryScreen(navController = navController)
                }
                composable(BottomNavigationScreen.WishlistScreen.title) {
                    WishlistScreen(navController = navController)
                }
                composable(BottomNavigationScreen.AccountScreen.title) {
                    AccountScreen(navController = navController)
                }
            }
        }
    )
}
@Preview(showSystemUi = true)
@Composable
fun PreviewBottomNavigation() {
    HalamanBottom()
}