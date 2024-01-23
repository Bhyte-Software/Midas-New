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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bhyte.midas.presentation.auth.components.PrimaryTextField
import com.bhyte.midas.presentation.components.common.BackButton
import com.bhyte.midas.presentation.components.common.PrimaryButton
import com.bhyte.midas.presentation.constants.Dimens
import com.bhyte.midas.presentation.navgraph.Route
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun EnterNameSignUpScreen(navController: NavController) {
    var firstNameValue by remember {
        mutableStateOf("")
    }
    var lastNameValue by remember {
        mutableStateOf("")
    }
    var middleNameValue by remember {
        mutableStateOf("")
    }
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
                text = "Name as on ID",
                style = MaterialTheme.typography.headlineLarge,
                fontFamily = archivoFontFamily,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Enter your name as it appears on documents",
                style = MaterialTheme.typography.bodyLarge,
                fontFamily = archivoFontFamily,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(30.dp))


            PrimaryTextField(
                label = "First Name",
                placeholder = "John",
                value = firstNameValue,
                onValueChange = { firstNameValue = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Done
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(10.dp))

            PrimaryTextField(
                label = "Last Name",
                placeholder = "Doe",
                value = lastNameValue,
                onValueChange = { lastNameValue = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Done
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(10.dp))

            PrimaryTextField(
                label = "Middle Name",
                placeholder = "(Optional)",
                value = middleNameValue,
                onValueChange = { middleNameValue = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Done
                ),
                modifier = Modifier.fillMaxWidth()
            )

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
                    navController.navigate(Route.BirthdateSignUpScreen.route)
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun EnterNameSignUpScreenPreview() {
    val previewNavController = rememberNavController()
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            EnterNameSignUpScreen(navController = previewNavController)
        }
    }
}