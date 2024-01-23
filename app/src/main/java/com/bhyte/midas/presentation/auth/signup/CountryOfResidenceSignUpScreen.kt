package com.bhyte.midas.presentation.auth.signup

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bhyte.midas.presentation.auth.components.CountryDropdown
import com.bhyte.midas.presentation.components.common.BackButton
import com.bhyte.midas.presentation.components.common.PrimaryButton
import com.bhyte.midas.presentation.constants.Dimens
import com.bhyte.midas.presentation.navgraph.Route
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun CountryOfResidenceSignUpScreen(navController: NavController) {
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = Dimens.SmallPadding)
                .padding(top = Dimens.MediumPadding)
        ) {
            BackButton {
                navController.popBackStack()
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Country of residence",
                style = MaterialTheme.typography.headlineLarge,
                fontFamily = archivoFontFamily,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Midas is currently only available in Ghana",
                style = MaterialTheme.typography.bodyLarge,
                fontFamily = archivoFontFamily,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(30.dp))

            CountryDropdown()

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .navigationBarsPadding()
                    .padding(bottom = 20.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                PrimaryButton(text = "Next") {
                    navController.navigate(Route.EnterNameSignUpScreen.route)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun CountryOfResidenceSignUpScreenPreview() {
    MidasTheme {
        val previewNavController = rememberNavController()
        Surface(color = MaterialTheme.colorScheme.background) {
            CountryOfResidenceSignUpScreen(navController = previewNavController)
        }
    }
}