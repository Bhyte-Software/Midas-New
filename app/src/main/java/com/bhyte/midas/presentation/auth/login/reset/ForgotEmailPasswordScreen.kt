package com.bhyte.midas.presentation.auth.login.reset

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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bhyte.midas.presentation.auth.components.PrimaryTextField
import com.bhyte.midas.presentation.components.common.BackButton
import com.bhyte.midas.presentation.components.common.PrimaryButton
import com.bhyte.midas.presentation.components.common.UnderlineTextButton
import com.bhyte.midas.presentation.constants.Dimens
import com.bhyte.midas.presentation.navgraph.Route
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun ForgotEmailPasswordScreen(navController: NavHostController) {
    var emailValue by remember { mutableStateOf("") }
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
                text = "Forgot Password",
                style = MaterialTheme.typography.headlineLarge,
                fontFamily = archivoFontFamily,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Enter email address associated with your Midas account to reset password",
                modifier = Modifier,
                style = MaterialTheme.typography.bodyLarge,
            )

            Spacer(modifier = Modifier.height(30.dp))

            Column(modifier = Modifier.weight(1f)) {
                PrimaryTextField(
                    label = "Email",
                    placeholder = "someone@gmail.com",
                    value = emailValue,
                    onValueChange = { emailValue = it },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Done
                    ),
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(30.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    UnderlineTextButton(text = "Remember password? Login") {
                        navController.navigate(Route.EmailLoginScreen.route)
                    }
                }
            }

            Column(modifier = Modifier
                .navigationBarsPadding()
                .padding(bottom = 20.dp)) {
                PrimaryButton(text = "Next") {

                }
            }

        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ForgotEmailPasswordScreenPreview() {
    val previewNavController = rememberNavController()
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            ForgotEmailPasswordScreen(navController = previewNavController)
        }
    }
}