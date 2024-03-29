package com.example.jastipin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.page.AccountScreen
import com.example.jastipin.page.ForgotPassword
import com.example.jastipin.page.ForgotPassword2
import com.example.jastipin.page.ForgotPasswordDone
import com.example.jastipin.page.HalamanBottom
import com.example.jastipin.page.HalamanSignInScreen
import com.example.jastipin.page.HistoryScreen
import com.example.jastipin.page.HomeScreen
import com.example.jastipin.page.SearchScreen
import com.example.jastipin.page.SignInScreen
import com.example.jastipin.page.SignUpScreen
import com.example.jastipin.page.SplashScreen
import com.example.jastipin.page.WishlistScreen


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
        composable(NavigationScreen.HomeScreen.name) {
            HomeScreen(navController = navController)
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
    }
}