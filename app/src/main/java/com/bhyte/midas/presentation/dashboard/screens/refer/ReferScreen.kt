package com.bhyte.midas.presentation.dashboard.screens.refer

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhyte.midas.R
import com.bhyte.midas.presentation.components.common.BackButton
import com.bhyte.midas.presentation.constants.Dimens
import com.bhyte.midas.presentation.dashboard.components.common.PrimaryButtonSmall
import com.bhyte.midas.presentation.dashboard.components.refer.ReferralUrl
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.pleinFontFamily

@Composable
fun ReferScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        val backgroundColor = colorResource(id = R.color.background_light)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = Dimens.SmallPadding)
                .padding(top = 0.dp),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .fillMaxWidth()
            ) {
                BackButton {

                }
                PrimaryButtonSmall(text = "Track Invites") {
                }
            }
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.empty),
                        contentDescription = null,
                        modifier = Modifier.size(350.dp),
                        contentScale = ContentScale.Fit
                    )
                }

                Text(
                    text = "INVITE AND GET ¢50",
                    style = MaterialTheme.typography.displaySmall,
                    lineHeight = 40.sp,
                    fontSize = 42.sp,
                    fontFamily = pleinFontFamily,
                    fontWeight = FontWeight.Black,
                )
                Text(
                    text = "Share link with your friends and get rewarded",
                    modifier = Modifier
                        .padding(top = 2.dp),
                    style = MaterialTheme.typography.bodyLarge,
                )

                Spacer(modifier = Modifier.height(20.dp))

                ReferralUrl()

                Spacer(modifier = Modifier.height(20.dp))


                Row {
                    FilledIconButton(
                        onClick = {

                        },
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = backgroundColor,
                        ),
                        modifier = Modifier.size(50.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.copy),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            contentScale = ContentScale.Fit
                        )
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    FilledIconButton(
                        onClick = {

                        },
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = backgroundColor,
                        ),
                        modifier = Modifier.size(50.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.share),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            contentScale = ContentScale.Fit
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ReferScreenPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            ReferScreen()
        }
    }
}