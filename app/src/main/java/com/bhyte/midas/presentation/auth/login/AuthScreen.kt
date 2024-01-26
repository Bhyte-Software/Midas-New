package com.bhyte.midas.presentation.auth.login

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhyte.midas.R
import com.bhyte.midas.presentation.auth.components.PinButton
import com.bhyte.midas.presentation.auth.components.PinIconButton
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun AuthScreen() {
    val backgroundColor = colorResource(id = R.color.primary)
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween) {

        Text(
            text = "Welcome back, John Doe",
            style = MaterialTheme.typography.bodyLarge,
            fontFamily = archivoFontFamily,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 50.dp),
            fontWeight = FontWeight.Medium
        )


        Column(modifier = Modifier.padding(horizontal = 35.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Row {
                repeat(6) { _ ->
                    Box(
                        modifier = Modifier
                            .width(30.dp)
                            .height(22.dp)
                            .padding(start = 4.dp, end = 4.dp)
                            .border(1.5.dp, backgroundColor, RoundedCornerShape(200.dp))
                            .background(color = Color.Transparent, RoundedCornerShape(200.dp))
                    )
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                text = "Enter your Unlock Code",
                style = MaterialTheme.typography.bodyLarge,
                fontFamily = archivoFontFamily,
                fontWeight = FontWeight.Normal,
            )
            Spacer(modifier = Modifier.height(50.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                PinButton(onClick = { /*TODO*/ }, text = "1")

                PinButton(onClick = { /*TODO*/ }, text = "2")

                PinButton(onClick = { /*TODO*/ }, text = "3")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                PinButton(onClick = { /*TODO*/ }, text = "4")

                PinButton(onClick = { /*TODO*/ }, text = "5")

                PinButton(onClick = { /*TODO*/ }, text = "6")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                PinButton(onClick = { /*TODO*/ }, text = "7")

                PinButton(onClick = { /*TODO*/ }, text = "8")

                PinButton(onClick = { /*TODO*/ }, text = "9")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                PinIconButton(onClick = { /*TODO*/ }, vectorResourceId = R.drawable.fingerprint)

                PinButton(onClick = { /*TODO*/ }, text = "0")

                PinIconButton(onClick = { /*TODO*/ }, vectorResourceId = R.drawable.delete)
            }
        }

        Row(modifier = Modifier.padding(bottom = 25.dp)) {
            Text(
                text = "Not John Doe?",
                style = MaterialTheme.typography.bodyLarge,
                fontFamily = archivoFontFamily,
                fontWeight = FontWeight.Normal
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "Switch account",
                style = MaterialTheme.typography.bodyLarge,
                fontFamily = archivoFontFamily,
                color = MaterialTheme.colorScheme.secondaryContainer,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun AuthScreenPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            AuthScreen()
        }
    }
}