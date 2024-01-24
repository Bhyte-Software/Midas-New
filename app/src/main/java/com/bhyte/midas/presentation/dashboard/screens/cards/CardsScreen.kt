package com.bhyte.midas.presentation.dashboard.screens.cards

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhyte.midas.R
import com.bhyte.midas.presentation.constants.Dimens
import com.bhyte.midas.presentation.dashboard.components.common.Header
import com.bhyte.midas.presentation.dashboard.components.common.PrimaryButtonMedium
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.pleinFontFamily

@Composable
fun CardsScreen() {
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = Dimens.SmallPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Header()
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.empty),
                    contentDescription = null,
                    modifier = Modifier.size(350.dp),
                    contentScale = ContentScale.Fit
                )
                Text(
                    text = "NO CARDS YET",
                    style = MaterialTheme.typography.displaySmall,
                    lineHeight = 32.sp,
                    fontFamily = pleinFontFamily,
                    fontWeight = FontWeight.Black,
                )
                Text(
                    text = "Click to create your first card",
                    modifier = Modifier
                        .padding(top = 0.dp),
                    style = MaterialTheme.typography.bodyLarge,
                )
                Spacer(modifier = Modifier.height(20.dp))
                PrimaryButtonMedium(text = "Create card") {

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun CardsScreenPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            CardsScreen()
        }
    }
}