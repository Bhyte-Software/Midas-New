package com.bhyte.midas.presentation.dashboard.components.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhyte.midas.R
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun DoMore() {
    Surface(color = MaterialTheme.colorScheme.background) {
        val cardOne = colorResource(id = R.color.card_one)
        val cardTwo = colorResource(id = R.color.card_two)
        val cardThree = colorResource(id = R.color.card_three)
        Column {
            Text(
                text = "Do more with Midas",
                modifier = Modifier,
                style = MaterialTheme.typography.headlineMedium,
                fontFamily = archivoFontFamily,
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(20.dp))

            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .background(cardOne, RoundedCornerShape(15.dp)),
                ) {
                    Text(
                        text = "Send and request from your contacts",
                        modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 20.dp),
                        style = MaterialTheme.typography.bodyLarge,
                        fontFamily = archivoFontFamily,
                        lineHeight = 20.sp,
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Image(
                        painter = painterResource(id = R.drawable.onboarding1),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(25.dp))
                }

                Spacer(modifier = Modifier.width(15.dp))

                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .background(cardTwo, RoundedCornerShape(15.dp)),
                ) {
                    Text(
                        text = "Schedule your\ntransfer",
                        modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 20.dp),
                        style = MaterialTheme.typography.bodyLarge,
                        fontFamily = archivoFontFamily,
                        lineHeight = 20.sp,
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Image(
                        painter = painterResource(id = R.drawable.onboarding6),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(25.dp))
                }

                Spacer(modifier = Modifier.width(15.dp))

                Column(
                    modifier = Modifier
                        .width(200.dp)
                        .background(cardThree, RoundedCornerShape(15.dp)),
                ) {
                    Text(
                        text = "Keep your money safe for future",
                        modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 20.dp),
                        style = MaterialTheme.typography.bodyLarge,
                        lineHeight = 20.sp,
                        fontFamily = archivoFontFamily,
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Image(
                        painter = painterResource(id = R.drawable.onboarding5),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.height(25.dp))
                }
            }

            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}


@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DoMorePreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            DoMore()
        }
    }
}