package com.bhyte.midas.presentation.dashboard.screens.home

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bhyte.midas.presentation.constants.Dimens
import com.bhyte.midas.presentation.dashboard.components.common.Header
import com.bhyte.midas.presentation.dashboard.components.home.ActionsCard
import com.bhyte.midas.presentation.dashboard.components.home.DoMore
import com.bhyte.midas.presentation.dashboard.components.home.HomeTransactions
import com.bhyte.midas.presentation.dashboard.components.home.MidasCard
import com.bhyte.midas.ui.theme.MidasTheme

@Composable
fun HomeScreen() {
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = Dimens.SmallPadding)
                .padding(top = 0.dp)
        ) {
            Header()
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ActionsCard()
                Spacer(modifier = Modifier.height(30.dp))
                HomeTransactions()
                Spacer(modifier = Modifier.height(20.dp))
                MidasCard()
                DoMore()
            }
        }
    }
}


@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomeScreenPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            HomeScreen()
        }
    }
}