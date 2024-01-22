package com.bhyte.midas.presentation.navgraph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.bhyte.midas.presentation.auth.login.EmailLoginScreen
import com.bhyte.midas.presentation.auth.login.PhoneLoginScreen
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
                    event = viewModel::onEvent
                )
            }
        }
        navigation(
            route = Route.AuthNavigation.route,
            startDestination = Route.EmailLoginScreen.route
        ) {
            composable(
                route = Route.EmailLoginScreen.route
            ) {
                EmailLoginScreen()
            }
            composable(
                route = Route.PhoneLoginScreen.route
            ) {
                PhoneLoginScreen()
            }
        }
    }
}