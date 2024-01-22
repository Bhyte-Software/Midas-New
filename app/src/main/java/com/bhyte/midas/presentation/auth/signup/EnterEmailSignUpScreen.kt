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
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bhyte.midas.presentation.Dimens
import com.bhyte.midas.presentation.common.CloseButton
import com.bhyte.midas.presentation.common.PrimaryButton
import com.bhyte.midas.presentation.common.PrimaryTextField
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun EmailSignUpScreen() {
    var emailValue by remember { mutableStateOf("") }
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = Dimens.SmallPadding)
                .padding(top = Dimens.MediumPadding)
        ) {
            CloseButton {

            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Enter email address",
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

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .navigationBarsPadding()
                    .padding(bottom = 20.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                val annotatedString = buildAnnotatedString {
                    withStyle(
                        style = MaterialTheme.typography.bodyLarge.toSpanStyle().copy(
                            fontWeight = FontWeight.Normal,
                            fontFamily = archivoFontFamily
                        )
                    ) {
                        append("By signing up you agree to our ")
                    }
                    withStyle(
                        style = MaterialTheme.typography.bodyLarge.toSpanStyle().copy(
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.Underline,
                            fontFamily = archivoFontFamily
                        )
                    ) {
                        append("Terms of Use")
                    }
                    append(" and ")
                    withStyle(
                        style = MaterialTheme.typography.bodyLarge.toSpanStyle().copy(
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.Underline,
                            fontFamily = archivoFontFamily
                        )
                    ) {
                        append("Privacy Policy")
                    }
                }

                Text(
                    text = annotatedString,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 5.dp)
                )


                Spacer(modifier = Modifier.height(30.dp))

                PrimaryButton(text = "Next") {

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun EmailSignUpScreenPreview() {
    MidasTheme {
        Surface {
            EmailSignUpScreen()
        }
    }
}
