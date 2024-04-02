package com.example.jastipin.page

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun WishlistScreen(navController: NavController) {
    Text(text = "Wishlist")

}

@Preview(showSystemUi = true)
@Composable
fun PreviewWishlistScreen(){
    HistoryScreen(navController = rememberNavController())
}