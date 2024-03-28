package com.example.jastipin.page

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HistoryScreen(navController: NavController) {
    Text(text = "History")
}

@Preview(showSystemUi = true)
@Composable
fun PreviewHistoryScreen(){
    HistoryScreen(navController = rememberNavController())
}