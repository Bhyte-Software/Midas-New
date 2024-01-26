package com.bhyte.midas.presentation.navgraph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.bhyte.midas.presentation.auth.login.AuthScreen
import com.bhyte.midas.presentation.auth.login.EmailLoginScreen
import com.bhyte.midas.presentation.auth.login.PhoneLoginScreen
import com.bhyte.midas.presentation.auth.login.reset.ForgotEmailPasswordScreen
import com.bhyte.midas.presentation.auth.login.reset.ForgotPhonePasswordScreen
import com.bhyte.midas.presentation.auth.signup.BirthdateSignUpScreen
import com.bhyte.midas.presentation.auth.signup.CountryOfResidenceSignUpScreen
import com.bhyte.midas.presentation.auth.signup.EmailSignUpScreen
import com.bhyte.midas.presentation.auth.signup.EnterNameSignUpScreen
import com.bhyte.midas.presentation.auth.signup.EnterPhoneSignUpScreen
import com.bhyte.midas.presentation.auth.signup.SignUpSuccessfulScreen
import com.bhyte.midas.presentation.auth.signup.VerifyIdentityMethodSignUpScreen
import com.bhyte.midas.presentation.auth.signup.VerifyIdentitySignUpScreen
import com.bhyte.midas.presentation.auth.signup.VerifyPhoneSignUpScreen
import com.bhyte.midas.presentation.components.navigation.DashboardNavigationScreen
import com.bhyte.midas.presentation.components.navigation.getBottomNavigationItems
import com.bhyte.midas.presentation.dashboard.screens.refer.ReferScreen
import com.bhyte.midas.presentation.dashboard.screens.refer.TrackInvitesScreen
import com.bhyte.midas.presentation.onboarding.OnBoardingScreen
import com.bhyte.midas.presentation.onboarding.OnBoardingViewModel

@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ) {
            composable(
                route = Route.OnBoardingScreen.route
            ) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent,
                )
            }
        }
        navigation(
            route = Route.DashboardNavigation.route,
            startDestination = Route.DashboardNavigationScreen.route
        ) {
            composable(
                route = Route.DashboardNavigationScreen.route
            ) {
                val items = getBottomNavigationItems()
                DashboardNavigationScreen(items = items)
            }
        }
        navigation(
            route = Route.ReferralNavigation.route,
            startDestination = Route.TrackInviteScreen.route
        ) {
            composable(
                route = Route.ReferScreen.route
            ) {
                ReferScreen()
            }
            composable(
                route = Route.TrackInviteScreen.route
            ) {
                TrackInvitesScreen()
            }
        }
        navigation(
            route = Route.AuthNavigationRegister.route,
            startDestination = Route.EnterEmailSignUpScreen.route
        ) {
            composable(
                route = Route.EnterEmailSignUpScreen.route
            ) {
                EmailSignUpScreen(navController = navController)
            }
            composable(
                route = Route.EnterPhoneSignUpScreen.route
            ) {
                EnterPhoneSignUpScreen(navController = navController)
            }
            composable(
                route = Route.VerifyPhoneSignUpScreen.route
            ) {
                VerifyPhoneSignUpScreen(navController = navController)
            }
            composable(
                route = Route.CountryOfResidenceSignUpScreen.route
            ) {
                CountryOfResidenceSignUpScreen(navController = navController)
            }
            composable(
                route = Route.EnterNameSignUpScreen.route
            ) {
                EnterNameSignUpScreen(navController = navController)
            }
            composable(
                route = Route.BirthdateSignUpScreen.route
            ) {
                BirthdateSignUpScreen(navController = navController)
            }
            composable(
                route = Route.VerifyIdentitySignUpScreen.route
            ) {
                VerifyIdentitySignUpScreen(navController = navController)
            }
            composable(
                route = Route.VerifyIdentityMethodSignUpScreen.route
            ) {
                VerifyIdentityMethodSignUpScreen(navController = navController)
            }
            composable(
                route = Route.SignUpSuccessfulScreen.route
            ) {
                SignUpSuccessfulScreen(navController = navController)
            }
            // Login
            composable(
                route = Route.EmailLoginScreen.route
            ) {
                EmailLoginScreen(navController = navController)
            }
            composable(
                route = Route.PhoneLoginScreen.route
            ) {
                PhoneLoginScreen(navController = navController)
            }
            composable(
                route = Route.ForgotPhonePasswordScreen.route
            ) {
                ForgotPhonePasswordScreen(navController = navController)
            }
            composable(
                route = Route.ForgotEmailPasswordScreen.route
            ) {
                ForgotEmailPasswordScreen(navController = navController)
            }
            composable(
                route = Route.AuthScreen.route
            ) {
                AuthScreen()
            }
        }
    }
}