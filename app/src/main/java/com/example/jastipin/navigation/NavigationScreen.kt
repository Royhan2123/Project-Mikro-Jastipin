package com.example.jastipin.navigation

// daftar - daftar file yang ingin di gabungkan ke dalam navigation
enum class NavigationScreen {
    SplashScreen,
    SignInScreen,
    SignUpScreen,
    HomeScreen,
    DetailScreen,
    SearchScreen,

    // test data
    HomeScreen2,
    DetailScreen2;


    fun fromRoute(route:String): NavigationScreen =
        when(route.substringBefore("/")) {
            SplashScreen.name -> SplashScreen
            SignInScreen.name -> SignInScreen
            SignUpScreen.name -> SignUpScreen
            HomeScreen.name -> HomeScreen
            SearchScreen.name -> SearchScreen
            DetailScreen.name -> DetailScreen
            HomeScreen2.name -> HomeScreen2
            DetailScreen2.name -> DetailScreen2
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
}