package com.example.jastipin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jastipin.page.DetailScreen
import com.example.jastipin.page.DetailScreen2
import com.example.jastipin.page.HomeScreen
import com.example.jastipin.page.SearchScreen
import com.example.jastipin.page.SignInScreen
import com.example.jastipin.page.SignUpScreen
import com.example.jastipin.page.SplashScreen
import com.example.jastipin.widget.addressUMKM
import com.example.jastipin.widget.descriptUMKM
import com.example.jastipin.widget.homeRowAddressUMKM
import com.example.jastipin.widget.homeRowDescription
import com.example.jastipin.widget.homeRowPhotos
import com.example.jastipin.widget.homeRowRangeUMKM
import com.example.jastipin.widget.homeRowRatingUMKM
import com.example.jastipin.widget.homeRowTitleUMKM
import com.example.jastipin.widget.photos
import com.example.jastipin.widget.rangeUMKM
import com.example.jastipin.widget.ratingUMKM
import com.example.jastipin.widget.titleUMKM


// untuk mengatur navigation yang di inginkan.
@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavigationScreen.HomeScreen.name
    ) {
        composable(NavigationScreen.SplashScreen.name) {
            SplashScreen(navController = navController)
        }
        composable(NavigationScreen.SignInScreen.name) {
            SignInScreen(navController = navController)
        }
        composable(NavigationScreen.SignUpScreen.name) {
            SignUpScreen(navController = navController)
        }
        composable(NavigationScreen.HomeScreen.name) {
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

        composable(NavigationScreen.SearchScreen.name) {
            SearchScreen(navController = navController)
        }
        composable(
            "${NavigationScreen.DetailScreen.name}/{index}",
            arguments = listOf(navArgument(name = "index") {
                type = NavType.IntType
                }
            )
        ) {index ->

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
        ) {index ->

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

//        composable(
//            NavigationScreen.HomeScreen2.name
//        ) {
//            HomeScreen2(
//                imageId = photos,
//                nameUMKM = titleUMKM,
//                range2UMKM = rangeUMKM,
//                rating2UMKM = ratingUMKM,
//                navController = navController,
//            )
//        }

//        composable(
//            "${NavigationScreen.DetailScreen.name}/{index}",
//            arguments = listOf(navArgument(name = "index") {
//                type = NavType.IntType
//                }
//            )
//        ) {index ->
//            DetailScreen2(
//                photos = photos,
//                namesUMKM = titleUMKM,
//                descriptionnsUMKM = descriptUMKM,
//                rangesUMKM = rangeUMKM,
//                ratingsUMKM = ratingUMKM,
//                itemIndex = index.arguments?.getInt("index")
//            )
//        }
    }
}