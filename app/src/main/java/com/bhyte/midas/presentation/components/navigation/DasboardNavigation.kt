package com.bhyte.midas.presentation.components.navigation

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.bhyte.midas.presentation.dashboard.cards.CardsScreen
import com.bhyte.midas.presentation.dashboard.home.HomeScreen
import com.bhyte.midas.screens.main.HubScreen
import com.bhyte.midas.screens.main.RecipientsScreen
import com.bhyte.midas.screens.main.SendScreen
import com.bhyte.midas.ui.theme.MidasTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardNavigationScreen(items: List<BottomNavigationItem>) {
    val selectedItemIndex by rememberSaveable {
        mutableIntStateOf(0)
    }

    val navController: NavHostController = rememberNavController()

    Scaffold(bottomBar = {
        NavigationBar {

            val navBackStackEntry: NavBackStackEntry? by navController.currentBackStackEntryAsState()
            val currentDestination: NavDestination? = navBackStackEntry?.destination

            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = currentDestination?.hierarchy?.any { it.route == item.route } == true,
                    onClick = {
                            navController.navigate(item.route){
                                popUpTo(navController.graph.findStartDestination().id){
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                    },
                    label = {
                        Text(text = item.title)
                    }, icon = {
                        BadgedBox(badge = {
                            if (item.badgeCount != null) {
                                Badge {
                                    Text(text = item.badgeCount.toString())
                                }
                            } else if (item.hasNews) {
                                Badge()
                            }
                        }) {
                            Icon(
                                imageVector = if (index == selectedItemIndex) {
                                    item.selectedIcon
                                } else item.unselectedIcon, contentDescription = item.title
                            )
                        }
                    })
            }
        }
    }) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.HomeScreen.name,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(route = Screens.HomeScreen.name) {
                HomeScreen()
            }
            composable(route = Screens.CardsScreen.name) {
                CardsScreen()
            }
            composable(route = Screens.SendScreen.name) {
                SendScreen()
            }
            composable(route = Screens.RecipientScreen.name) {
                RecipientsScreen()
            }
            composable(route = Screens.HubScreen.name) {
                HubScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DashboardNavigationScreenPreview() {
    MidasTheme {
        val items = getBottomNavigationItems()
        DashboardNavigationScreen(items = items)
    }
}
