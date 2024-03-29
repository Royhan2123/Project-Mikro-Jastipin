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
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.CalendarToday
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.navigation.NavigationScreen
import com.example.jastipin.ui.theme.orange
import com.example.jastipin.ui.theme.oranges

sealed class BottomNavigationScreen(
    val title: String,
    val filledIcon: ImageVector,
    val outlinedIcon: ImageVector
) {
    object HomeScreen : BottomNavigationScreen("Home", Icons.Filled.Home, Icons.Outlined.Home)
    object HistoryScreen :
        BottomNavigationScreen("History", Icons.Filled.CalendarToday, Icons.Outlined.CalendarToday)

    object WishlistScreen :
        BottomNavigationScreen("Wishlist", Icons.Filled.Favorite, Icons.Outlined.FavoriteBorder)

    object AccountScreen :
        BottomNavigationScreen("Account", Icons.Filled.AccountCircle, Icons.Outlined.AccountCircle)

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
        BottomNavigationScreen.AccountScreen,
    )

    Scaffold(
        bottomBar = {
            BottomNavigation(
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
                            val selectedIcon =
                                if (currentRoute == screen.title) screen.filledIcon else screen.outlinedIcon
                            Icon(
                                selectedIcon, contentDescription = screen.title,
                                tint = if (currentRoute == screen.title) orange else oranges
                            )
                        },
                        label = {
                            Text(
                                text = screen.title,
                                color = if (currentRoute == screen.title)
                                    orange else oranges
                            )
                        },
                        alwaysShowLabel = false
                    )
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
                composable(NavigationScreen.SearchScreen.name) {
                    SearchScreen(navController = navController)
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