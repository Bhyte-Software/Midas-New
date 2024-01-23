package com.bhyte.midas.presentation.auth.signup

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bhyte.midas.R
import com.bhyte.midas.presentation.components.common.BackButton
import com.bhyte.midas.presentation.components.common.PrimaryButton
import com.bhyte.midas.presentation.components.common.TextButton
import com.bhyte.midas.presentation.constants.Dimens
import com.bhyte.midas.presentation.navgraph.Route
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun VerifyIdentitySignUpScreen(navController: NavController) {
    val cardColor = colorResource(id = R.color.background_light)
    val backgroundColor = colorResource(id = R.color.background)

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
            text = "Verify your identity",
            style = MaterialTheme.typography.headlineLarge,
            fontFamily = archivoFontFamily,
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(cardColor, RoundedCornerShape(15.dp))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp, vertical = 30.dp)
            )
            {
                Column(
                    modifier = Modifier
                        .size(50.dp)
                        .background(backgroundColor, RoundedCornerShape(1000.dp)),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier.size(34.dp),
                        painter = painterResource(id = R.drawable.document),
                        contentDescription = "Document"
                    )
                }

                Spacer(modifier = Modifier.width(15.dp))

                Column {
                    Text(
                        text = "Verify using documents",
                        style = MaterialTheme.typography.titleLarge,
                        fontFamily = archivoFontFamily,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium
                    )

                    Text(
                        text = "Enter your details and upload your documents to complete verification",
                        style = MaterialTheme.typography.bodyLarge,
                        fontFamily = archivoFontFamily,
                        lineHeight = 22.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(bottom = 20.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(30.dp))

            PrimaryButton(text = "Next") {
                navController.navigate(Route.VerifyIdentityMethodSignUpScreen.route)
            }
            Spacer(modifier = Modifier.height(10.dp))
            TextButton(text = "Verify Identity Later") {
                navController.navigate(Route.SignUpSuccessfulScreen.route)
            }
        }

    }

}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun VerifyIdentitySignUpScreenPreview() {
    val previewNavController = rememberNavController()
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            VerifyIdentitySignUpScreen(navController = previewNavController)
        }
    }
}