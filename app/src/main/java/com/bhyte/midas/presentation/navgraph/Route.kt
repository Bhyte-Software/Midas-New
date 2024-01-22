package com.bhyte.midas.presentation.navgraph

sealed class Route(
    val route: String
) {
    data object OnBoardingScreen : Route(route = "onBoardingScreen")
    data object AuthNavigation : Route(route = "authNavigation")
    data object EmailLoginScreen : Route(route = "emailLoginScreen")
    data object PhoneLoginScreen : Route(route = "phoneLoginScreen")
    data object AppStartNavigation : Route(route = "appStartNavigation")
}
