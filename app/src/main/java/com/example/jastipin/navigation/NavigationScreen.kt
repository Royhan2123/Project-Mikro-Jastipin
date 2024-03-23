package com.example.jastipin.navigation

// daftar - daftar file yang ingin di gabungkan ke dalam navigation
enum class NavigationScreen {
    SplashScreen,
    SignInScreen,
    SignUpScreen,
    ForgotPassword;

    fun fromRoute(route:String): NavigationScreen =
        when(route.substringBefore("/")) {
            SplashScreen.name -> SplashScreen
            SignInScreen.name -> SignInScreen
            SignUpScreen.name -> SignUpScreen
            ForgotPassword.name -> ForgotPassword
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
}