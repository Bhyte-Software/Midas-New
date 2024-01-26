package com.bhyte.midas.presentation.dashboard.components.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhyte.midas.R
import com.bhyte.midas.presentation.dashboard.components.common.PrimaryCircularButton
import com.bhyte.midas.presentation.dashboard.components.common.ToggleVisibilityButton
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily

@Composable
fun ActionsCard() {
    val backgroundColor = colorResource(id = R.color.background_light)

    var isBalanceVisible by remember { mutableStateOf(true) }
    val actualBalance by remember { mutableStateOf("0.00") }

    Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(top = 10.dp)) {
            Column(
                modifier = Modifier
                    .background(backgroundColor, RoundedCornerShape(15.dp))
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp, top = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            val repeatCount = actualBalance.length
                            val displayedBalance =
                                if (isBalanceVisible) "¢ $actualBalance" else "¢ " + "*".repeat(
                                    repeatCount
                                )
                            Text(
                                text = displayedBalance,
                                style = MaterialTheme.typography.displaySmall,
                                fontSize = 38.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = archivoFontFamily
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            ToggleVisibilityButton(
                                onClick = {
                                    isBalanceVisible = !isBalanceVisible
                                },
                                isBalanceVisible = isBalanceVisible
                            )

                        }
                        Spacer(modifier = Modifier.height(0.dp))
                        Text(
                            text = "Ghana Cedi",
                            style = MaterialTheme.typography.bodyLarge,
                            fontFamily = archivoFontFamily,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Image(
                        modifier = Modifier.size(50.dp),
                        painter = painterResource(id = R.drawable.ghana),
                        contentDescription = "Ghana flag"
                    )
                }


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp, top = 25.dp, bottom = 30.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    PrimaryCircularButton(
                        onClick = { /*TODO*/ },
                        vectorResourceId = R.drawable.add,
                        text = "Add",
                    )
                    PrimaryCircularButton(
                        onClick = { /*TODO*/ },
                        vectorResourceId = R.drawable.send,
                        text = "Send",
                    )
                    PrimaryCircularButton(
                        onClick = { /*TODO*/ },
                        vectorResourceId = R.drawable.withdraw,
                        text = "Withdraw",
                    )
                    PrimaryCircularButton(
                        onClick = { /*TODO*/ },
                        vectorResourceId = R.drawable.more,
                        text = "More",
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ActionsCardPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            ActionsCard()
        }
    }
}