package com.bhyte.midas.presentation.dashboard.components.common

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bhyte.midas.R
import com.bhyte.midas.ui.theme.MidasTheme

@Composable
fun ProfileButton(){
    val backgroundColor = colorResource(id = R.color.background_light)
    FilledIconButton(
        onClick = {

        },
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = backgroundColor,
        ),
        modifier = Modifier.size(45.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ProfileButtonPreview(){
    MidasTheme {
        Surface (color = MaterialTheme.colorScheme.background) {
            ProfileButton()
        }
    }
}