//package com.example.jastipin.widget
//
//import androidx.compose.foundation.layout.Row
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.AccountCircle
//import androidx.compose.material.icons.filled.Favorite
//import androidx.compose.material.icons.filled.History
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.Scaffold
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.platform.LocalContext
//import androidx.navigation.compose.rememberNavController
//import com.example.jastipin.ui.theme.orange
//
//sealed class Screens(val screens: String, val icon: ImageVector) {
//    object Home : Screens("home", Icons.Filled.Home)
//    object History : Screens("history", Icons.Filled.History)
//    object Wishlist : Screens("wishlist", Icons.Filled.Favorite)
//    object Account : Screens("account", Icons.Filled.AccountCircle)
//}
//
//@Composable
//fun BottomAppBar() {
//    val navigationController = rememberNavController()
//    val context = LocalContext.current.applicationContext
//    val selected = remember {
//        mutableStateOf(Icons.Default.Home)
//    }
//
//    Scaffold(
//        bottomBar = {
//            androidx.compose.material3.BottomAppBar(
//                containerColor = orange
//            ) {
//                IconButton(onClick = {
//                    selected.value = Icons.Default.Home
//                    navigationController.navigate(Screens.Home.screens) {
//                        popUpTo(0)
//                    }
//                }, modifier = Modifier.weight(1f)) {
//
//                }
//            }
//        }
//    ) {
//        Row {
//
//        }
//    }
//
//}