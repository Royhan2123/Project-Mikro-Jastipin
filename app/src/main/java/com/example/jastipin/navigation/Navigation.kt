package com.example.jastipin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.page.ForgotPassword
import com.example.jastipin.page.ForgotPassword2
import com.example.jastipin.page.ForgotPasswordDone
import com.example.jastipin.page.HalamanSignInScreen
import com.example.jastipin.page.SignInScreen
import com.example.jastipin.page.SignUpScreen
import com.example.jastipin.page.SplashScreen


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
        composable(NavigationScreen.HalamanSignInScreen.name) {
            HalamanSignInScreen(navController)
        }
    }
}