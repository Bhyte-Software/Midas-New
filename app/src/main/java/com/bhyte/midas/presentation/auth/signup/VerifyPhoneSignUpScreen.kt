package com.bhyte.midas.presentation.auth.signup

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bhyte.midas.presentation.Dimens
import com.bhyte.midas.presentation.common.BackButton
import com.bhyte.midas.presentation.common.UnderlineTextButton
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun VerifyPhoneSignUpScreen() {
    val text = remember { mutableStateOf("") }
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = Dimens.SmallPadding)
                .padding(top = Dimens.MediumPadding)
        ) {
            BackButton {

            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "We just sent an SMS",
                style = MaterialTheme.typography.headlineLarge,
                fontFamily = archivoFontFamily,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Enter the security code we just sent to",
                style = MaterialTheme.typography.bodyLarge,
                fontFamily = archivoFontFamily,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(50.dp))


            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                UnderlineTextButton(text = "I didn't receive a code") {

                }
            }

        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun VerifyPhoneSignUpScreenPreview() {
    MidasTheme {
        Surface {
            VerifyPhoneSignUpScreen()
        }
    }
}