package com.bhyte.midas.components.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PeopleAlt
import androidx.compose.material.icons.outlined.ArrowUpward
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.Dashboard
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.PeopleAlt
import com.bhyte.midas.navigation.Screens

fun getBottomNavigationItems(): List<BottomNavigationItem> {
    return listOf(
        BottomNavigationItem(
            title = "Home",
            selectedIcon = Icons.Filled.Home,
            unselectedIcon = Icons.Outlined.Home,
            hasNews = false,
            badgeCount = null,
            route = Screens.HomeScreen.name
        ),
        BottomNavigationItem(
            title = "Cards",
            selectedIcon = Icons.Filled.CreditCard,
            unselectedIcon = Icons.Outlined.CreditCard,
            hasNews = false,
            badgeCount = null,
            route = Screens.CardsScreen.name
        ),
        BottomNavigationItem(
            title = "Send",
            selectedIcon = Icons.Filled.ArrowUpward,
            unselectedIcon = Icons.Outlined.ArrowUpward,
            hasNews = false,
            badgeCount = null,
            route = Screens.SendScreen.name
        ),
        BottomNavigationItem(
            title = "Recipients",
            selectedIcon = Icons.Filled.PeopleAlt,
            unselectedIcon = Icons.Outlined.PeopleAlt,
            hasNews = false,
            badgeCount = null,
            route = Screens.RecipientsScreen.name
        ),
        BottomNavigationItem(
            title = "Hub",
            selectedIcon = Icons.Filled.Dashboard,
            unselectedIcon = Icons.Outlined.Dashboard,
            hasNews = false,
            badgeCount = null,
            route = Screens.HubScreen.name
        )
    )
}
