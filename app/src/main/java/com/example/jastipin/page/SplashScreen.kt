package com.example.jastipin.page

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun SplashScreen(navController: NavController) {

}

@Preview
@Composable
fun PreviewSplashScreen(){
    SplashScreen(navController = rememberNavController())
}