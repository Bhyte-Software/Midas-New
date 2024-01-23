package com.bhyte.midas.presentation.navgraph

sealed class Route(
    val route: String
) {
    data object OnBoardingScreen : Route(route = "onBoardingScreen")
    data object AuthNavigationLogin : Route(route = "authNavigation")
    data object AuthNavigationRegister : Route(route = "authNavigation")
    data object EmailLoginScreen : Route(route = "emailLoginScreen")
    data object PhoneLoginScreen : Route(route = "phoneLoginScreen")
    data object ForgotEmailPasswordScreen : Route(route = "forgotEmailPasswordScreen")
    data object ForgotPhonePasswordScreen : Route(route = "forgotPhonePasswordScreen")

    // Registration Routes
    data object EnterEmailSignUpScreen : Route(route = "enterEmailSignUpScreen")
    data object EnterPhoneSignUpScreen : Route(route = "enterPhoneSignUpScreen")
    data object VerifyPhoneSignUpScreen : Route(route = "verifyPhoneSignUpScreen")
    data object EnterNameSignUpScreen : Route(route = "enterNameSignUpScreen")
    data object CreatePasswordSignUpScreen : Route(route = "createPasswordSignUpScreen")
    data object CountryOfResidenceSignUpScreen : Route(route = "countryOfResidenceSignUpScreen")
    data object BirthdateSignUpScreen : Route(route = "birthdateSignUpScreen")
    data object VerifyIdentitySignUpScreen : Route(route = "verifyIdentitySignUpScreen")
    data object VerifyIdentityMethodSignUpScreen : Route(route = "verifyIdentityMethodSignUpScreen")
    data object SignUpSuccessfulScreen : Route(route = "signUpSuccessfulScreen")
    data object DashboardNavigation : Route(route = "dashboardNavigation")
    data object DashboardNavigationScreen : Route(route = "dashboardNavigationScreen")

    data object AppStartNavigation : Route(route = "appStartNavigation")
}
