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
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jastipin.navigation.NavigationScreen
import com.example.jastipin.ui.theme.orange
import com.example.jastipin.ui.theme.oranges
import com.example.jastipin.widget.addressUMKM
import com.example.jastipin.widget.descriptUMKM
import com.example.jastipin.widget.homeRowAddressUMKM
import com.example.jastipin.widget.homeRowDescription
import com.example.jastipin.widget.homeRowPhotos
import com.example.jastipin.widget.homeRowRangeUMKM
import com.example.jastipin.widget.homeRowRatingUMKM
import com.example.jastipin.widget.homeRowTitleUMKM
import com.example.jastipin.widget.locationUMKM
import com.example.jastipin.widget.photos
import com.example.jastipin.widget.rangeUMKM
import com.example.jastipin.widget.ratingUMKM
import com.example.jastipin.widget.titleUMKM

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
                    HomeScreen(
                        navController = navController,
                        imageId = photos,
                        nameUMKM = titleUMKM,
                        descriptionUMKM = descriptUMKM,
                        range2UMKM = rangeUMKM,
                        rating2UMKM = ratingUMKM,
                        alamatUMKM = addressUMKM,

                        home2RowPhotos = homeRowPhotos,
                        home2RowTitleUMKM = homeRowTitleUMKM,
                        home2RowRangeUMKM = homeRowRangeUMKM,
                        home2RowRatingUMKM = homeRowRatingUMKM,
                        home2RowDescription = homeRowDescription,
                        home2RowAddressUMKM = homeRowAddressUMKM
                    )
                }
                composable(BottomNavigationScreen.HistoryScreen.title) {
                    HistoryScreen(navController = navController)
                }

                composable(
                    "${BottomNavigationScreen.WishlistScreen.title}/{index}",
                    arguments = listOf(navArgument(name = "index") {
                        type = NavType.IntType
                    }
                    )
                ) {index ->
                    WishlistScreen(
                        itemIndex = index.arguments?.getInt("index"),
                        imageId = photos,
                        title2UMKM = titleUMKM,
                        range2UMKM = rangeUMKM,
                        ratins2UMKM = ratingUMKM,
                        location2UMKM = locationUMKM,
                        navController = navController
                    )
                }

//                composable(
//                    "${BottomNavigationScreen.WishlistScreen.title}/{index}",
//                    arguments = listOf(navArgument(name = "index") {
//                        type = NavType.IntType
//                        }
//                    )
//                ) {index ->
//                    WishlistScreen(
//                        itemIndex = index.arguments?.getInt("index"),
//                        imageId = photos,
//                        title2UMKM = titleUMKM,
//                        range2UMKM = rangeUMKM,
//                        ratins2UMKM = ratingUMKM,
//                        location2UMKM = locationUMKM,
//                        navController = navController
//                    )
//                }

                composable(BottomNavigationScreen.AccountScreen.title) {
                    AccountScreen(navController = navController)
                }
                composable(NavigationScreen.SearchScreen.name) {
                    SearchScreen(navController = navController)
                }

                composable(
                    "${NavigationScreen.DetailScreen.name}/{index}",
                    arguments = listOf(navArgument(name = "index") {
                        type = NavType.IntType
                    }
                    )
                ) { index ->

                    DetailScreen(
                        // Column Rev
                        photos = photos,
                        namesUMKM = titleUMKM,
                        descriptionnsUMKM = descriptUMKM,
                        rangesUMKM = rangeUMKM,
                        ratingsUMKM = ratingUMKM,
                        addresssUMKM = addressUMKM,
                        itemIndex = index.arguments?.getInt("index"),
                        navController = navController,
                    )
                }

                composable(
                    "${NavigationScreen.DetailScreen2.name}/{index2}",
                    arguments = listOf(navArgument(name = "index2") {
                        type = NavType.IntType
                    }
                    )
                ) { index ->

                    DetailScreen2(
                        navController = navController,
                        // Row Rev
                        home3RowItemIndex = index.arguments?.getInt("index2"),
                        home3RowPhotos = homeRowPhotos,
                        home3RowDescription = homeRowDescription,
                        home3RowTitle = homeRowTitleUMKM,
                        home3RowRating = homeRowRatingUMKM,
                        home3RowAddress = homeRowAddressUMKM,
                    )
                }
            }
        }
    )
}

//@Preview(showSystemUi = true)
//@Composable
//fun PreviewBottomNavigation() {
//    HalamanBottom()
//}