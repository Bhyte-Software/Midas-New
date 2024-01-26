package com.bhyte.midas.presentation.dashboard.screens.actions.add

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun AddMoneyMethodScreen() {
    Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier.fillMaxSize()) {
        val backgroundColor = colorResource(id = R.color.background_light)

        Column(
            modifier = Modifier
                .fillMaxSize()

        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = Dimens.SmallPadding)
                    .padding(top = Dimens.MediumPadding)
            ) {
                BackButton {

                }
                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Add Money",
                    style = MaterialTheme.typography.headlineLarge,
                    fontFamily = archivoFontFamily,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "Select how you would like to deposit money into your Midas wallet",
                    modifier = Modifier
                        .padding(top = 0.dp),
                    style = MaterialTheme.typography.bodyLarge,
                    lineHeight = 22.sp
                )
                Spacer(modifier = Modifier.height(30.dp))

            }
            Column(
                modifier = Modifier
                    .height(70.dp)
                    .clickable(onClick = {

                    })
                    .fillMaxWidth(), verticalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = Dimens.SmallPadding),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        FilledIconButton(
                            onClick = {

                            },
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = backgroundColor,
                            ),
                            modifier = Modifier.size(50.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.cash),
                                contentDescription = null,
                                modifier = Modifier.size(28.dp),
                                contentScale = ContentScale.Fit
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "Mobile Money",
                            modifier = Modifier
                                .padding(top = 0.dp),
                            style = MaterialTheme.typography.bodyLarge,
                            lineHeight = 22.sp
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.chevron_right),
                        contentDescription = null,
                        modifier = Modifier.size(28.dp),
                        contentScale = ContentScale.Fit
                    )
                }

            }
            Column(
                modifier = Modifier
                    .height(70.dp)
                    .clickable(onClick = {

                    })
                    .fillMaxWidth(), verticalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = Dimens.SmallPadding),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        FilledIconButton(
                            onClick = {

                            },
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = backgroundColor,
                            ),
                            modifier = Modifier.size(50.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.card),
                                contentDescription = null,
                                modifier = Modifier.size(28.dp),
                                contentScale = ContentScale.Fit
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "Credit / Debit Card",
                            modifier = Modifier
                                .padding(top = 0.dp),
                            style = MaterialTheme.typography.bodyLarge,
                            lineHeight = 22.sp
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.chevron_right),
                        contentDescription = null,
                        modifier = Modifier.size(28.dp),
                        contentScale = ContentScale.Fit
                    )
                }

            }
        }
    }
}


@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun AddMoneyMethodScreenPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            AddMoneyMethodScreen()
        }
    }
}