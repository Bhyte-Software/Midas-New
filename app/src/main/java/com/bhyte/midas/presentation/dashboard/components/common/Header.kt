package com.bhyte.midas.presentation.dashboard.components.common

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bhyte.midas.R
import com.bhyte.midas.ui.theme.MidasTheme

@Composable
fun Header() {
    Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,

            modifier = Modifier.padding(vertical = 10.dp)
        ) {
            ProfileButton()

            Row(verticalAlignment = Alignment.CenterVertically) {
                PrimaryButtonSmall(text = "Earn ¢50") {

                }
                Spacer(modifier = Modifier.width(15.dp))
                IconButton(onClick = { /*TODO*/ }, vectorResourceId = R.drawable.notifications)
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HeaderPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Header()
        }
    }
}