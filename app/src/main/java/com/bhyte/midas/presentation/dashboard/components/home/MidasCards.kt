package com.bhyte.midas.presentation.dashboard.components.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhyte.midas.R
import com.bhyte.midas.presentation.constants.Dimens
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily
import com.bhyte.midas.ui.theme.pleinFontFamily

@Composable
fun MidasCard() {
    val backgroundColor = colorResource(id = R.color.home_card)
    Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier.fillMaxWidth()) {
        Column {
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Midas cards",
                modifier = Modifier,
                style = MaterialTheme.typography.headlineMedium,
                fontFamily = archivoFontFamily,
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier
                    .background(backgroundColor, RoundedCornerShape(15.dp))
                    .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 40.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier.padding(20.dp),
                    painter = painterResource(id = R.drawable.onboarding4),
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "SPEND ANY WHERE WITH YOUR MIDAS VIRTUAL CARD",
                    modifier = Modifier.padding(horizontal = Dimens.SmallPadding),
                    style = MaterialTheme.typography.displaySmall,
                    lineHeight = 32.sp,
                    color = Color.Black,
                    fontFamily = pleinFontFamily,
                    fontWeight = FontWeight.Black,
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MidasCardPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            MidasCard()
        }
    }
}