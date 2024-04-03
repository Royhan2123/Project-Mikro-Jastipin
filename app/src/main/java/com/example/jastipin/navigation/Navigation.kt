package com.example.jastipin.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.page.AccountScreen
import com.example.jastipin.page.CartScreen
import com.example.jastipin.page.ChatScreen
import androidx.navigation.navArgument
import com.example.jastipin.page.DetailScreen
import com.example.jastipin.page.DetailScreen2
import com.example.jastipin.page.FindDriverScreen
import com.example.jastipin.page.ForgotPassword
import com.example.jastipin.page.ForgotPassword2
import com.example.jastipin.page.ForgotPasswordDone
import com.example.jastipin.page.HalamanBottom
import com.example.jastipin.page.HalamanChatScreen
import com.example.jastipin.page.HalamanSignInScreen
import com.example.jastipin.page.HistoryScreen
import com.example.jastipin.page.HomeScreen
import com.example.jastipin.page.SearchScreen
import com.example.jastipin.page.SignInScreen
import com.example.jastipin.page.SignUpScreen
import com.example.jastipin.page.SplashScreen
import com.example.jastipin.page.SplashScreenDriver
import com.example.jastipin.page.Succes
import com.example.jastipin.page.WishlistScreen
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
        startDestination = NavigationScreen.SplashScreen.name
    ) {
        composable(NavigationScreen.SplashScreen.name) {
            SplashScreen(navController = navController)
        }
        composable(NavigationScreen.SignInScreen.name) {
            SignInScreen(
                navController = navController,
                onDaftarClicked = {},
            )
        }
        composable(NavigationScreen.SignUpScreen.name) {
            SignUpScreen(
                navController,
                onLoginClicked = {}
            )
        }
        composable(NavigationScreen.ForgotPassword.name) {
            ForgotPassword(navController)
        }
        composable(NavigationScreen.ForgotPassword2.name) {
            ForgotPassword2(navController)
        }
        composable(NavigationScreen.ForgotPasswordDone.name) {
            ForgotPasswordDone(navController)
        }
        composable(NavigationScreen.HalamanBottom.name) {
            HalamanBottom()
        }
        composable(NavigationScreen.HalamanSignInScreen.name) {
            HalamanSignInScreen(navController)
        }
        composable(NavigationScreen.ForgotPassword.name) {
            ForgotPassword(navController)
        }
        composable(NavigationScreen.ForgotPassword2.name) {
            ForgotPassword2(navController)
        }
        composable(NavigationScreen.ForgotPasswordDone.name) {
            ForgotPasswordDone(navController)
        }
        composable(NavigationScreen.HalamanBottom.name) {
            HalamanBottom()
        }
        composable(NavigationScreen.HalamanSignInScreen.name) {
            HalamanSignInScreen(navController)
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

        composable(NavigationScreen.HistoryScreen.name) {
            HistoryScreen(navController = navController)
        }
        composable(NavigationScreen.HistoryScreen.name) {
            HistoryScreen(navController = navController)
        }
        composable(NavigationScreen.AccountScreen.name) {
            AccountScreen(navController = navController)
        }
        composable(NavigationScreen.SearchScreen.name) {
            SearchScreen(navController = navController)
        }
        composable(NavigationScreen.WishtlistScreen.name) {
            WishlistScreen(navController = navController)
        }

            composable(NavigationScreen.ChatScreen.name) {
                ChatScreen(navController = navController)
            }
            composable(NavigationScreen.HalamanChatScreen.name) {
                HalamanChatScreen(navController = navController)
            }

            composable(NavigationScreen.ChatScreen.name) {
                ChatScreen(navController = navController)
            }
            composable(NavigationScreen.FindDriverScreen.name) {
                FindDriverScreen(navController = navController)
            }
            composable(NavigationScreen.SplashScreenDriver.name) {
                SplashScreenDriver(navController = navController)
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

            composable(NavigationScreen.CartScreen.name) {
                CartScreen(navController = navController)
            }
        composable(NavigationScreen.Succes.name) {
            Succes(navController = navController)
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