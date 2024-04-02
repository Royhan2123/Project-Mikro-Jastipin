package com.example.jastipin.navigation

// daftar - daftar file yang ingin di gabungkan ke dalam navigation
enum class NavigationScreen {
    SplashScreen,
    HalamanSignInScreen,
    SignInScreen,
    SignUpScreen,
    ForgotPassword,
    ForgotPassword2,
    ForgotPasswordDone,
    HalamanBottom,
    HomeScreen,
    SearchScreen,
    HistoryScreen,
    WishtlistScreen,
    DetailScreen,
    DetailScreen2,
    ChatScreen,
    CartScreen,
    HalamanChatScreen,
    FindDriverScreen,
    SplashScreenDriver,
    AccountScreen;

    fun fromRoute(route: String): NavigationScreen =
        when (route.substringBefore("/")) {
            SplashScreen.name -> SplashScreen
            SplashScreen.name -> SplashScreen
            HalamanSignInScreen.name -> HalamanSignInScreen
            SignUpScreen.name -> SignUpScreen
            ForgotPassword.name -> ForgotPassword
            ForgotPassword2.name -> ForgotPassword2
            ForgotPasswordDone.name -> ForgotPasswordDone
            HalamanBottom.name -> HalamanBottom
            HomeScreen.name -> HomeScreen
            SearchScreen.name -> SearchScreen
            HistoryScreen.name -> HistoryScreen
            WishtlistScreen.name -> WishtlistScreen
            AccountScreen.name -> AccountScreen
            ChatScreen.name -> ChatScreen
            AccountScreen.name -> AccountScreen
            ChatScreen.name -> ChatScreen
            DetailScreen.name -> DetailScreen
            DetailScreen2.name -> DetailScreen2
            HalamanChatScreen.name -> HalamanChatScreen
            FindDriverScreen.name -> FindDriverScreen
            SplashScreenDriver.name -> SplashScreenDriver
            CartScreen.name -> CartScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
}