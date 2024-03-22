package com.example.jastipin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jastipin.page.SignInScreen
import com.example.jastipin.page.SignUpScreen
import com.example.jastipin.page.SplashScreen


// untuk mengatur navigation yang di inginkan.
@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavigationScreen.SplashScreen.name ) {
        composable(NavigationScreen.SplashScreen.name) {
            SplashScreen(navController = navController)
        }
        composable(NavigationScreen.SignInScreen.name) {
            SignInScreen(navController = navController)
        }
        composable(NavigationScreen.SignUpScreen.name) {
            SignUpScreen()
        }
    }
}