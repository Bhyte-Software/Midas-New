package com.bhyte.midas.presentation.auth.login

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bhyte.midas.R
import com.bhyte.midas.presentation.constants.Dimens.MediumPadding
import com.bhyte.midas.presentation.constants.Dimens.SmallPadding
import com.bhyte.midas.presentation.components.common.BackButton
import com.bhyte.midas.presentation.components.common.OutlineIconButton
import com.bhyte.midas.presentation.auth.components.PasswordToggleTextField
import com.bhyte.midas.presentation.components.common.PrimaryButton
import com.bhyte.midas.presentation.auth.components.PrimaryTextField
import com.bhyte.midas.presentation.components.common.UnderlineTextButton
import com.bhyte.midas.presentation.navgraph.Route
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun EmailLoginScreen(navController: NavHostController) {
    var emailValue by remember { mutableStateOf("") }
    var passwordValue by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }

    val lightText = colorResource(id = R.color.text_light)

    Surface(color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = SmallPadding)
                .padding(top = MediumPadding)
        ) {
            BackButton {
                navController.popBackStack()
            }
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Log in",
                style = MaterialTheme.typography.headlineLarge,
                fontFamily = archivoFontFamily,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(30.dp))

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

            Spacer(modifier = Modifier.height(10.dp))

            PasswordToggleTextField(
                label = "Password",
                placeholder = "Enter your password",
                value = passwordValue,
                onValueChange = { passwordValue = it },
                showPassword = showPassword,
                onTogglePassword = { showPassword = !showPassword },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(30.dp))

            PrimaryButton(text = "Log in") {

            }

            Spacer(modifier = Modifier.height(30.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                UnderlineTextButton(text = "Trouble logging in?") {
                    navController.navigate(Route.ForgotEmailPasswordScreen.route)
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(text = "or login with", color = lightText)

                Spacer(modifier = Modifier.height(30.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .navigationBarsPadding()
                        .padding(bottom = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(modifier = Modifier.weight(0.5f)) {
                        OutlineIconButton(onClick = {}, imageDrawableId = R.drawable.google)
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Box(modifier = Modifier.weight(0.5f)) {
                        OutlineIconButton(onClick = {
                            navController.navigate(Route.PhoneLoginScreen.route)
                        }, imageDrawableId = R.drawable.phone)
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Box(modifier = Modifier.weight(0.5f)) {
                        OutlineIconButton(onClick = {}, imageDrawableId = R.drawable.facebook)
                    }
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun EmailLoginScreenPreview() {
    val previewNavController = rememberNavController()
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            EmailLoginScreen(navController = previewNavController)
        }
    }
}