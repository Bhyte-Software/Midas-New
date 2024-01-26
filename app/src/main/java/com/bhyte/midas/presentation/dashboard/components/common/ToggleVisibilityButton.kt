package com.bhyte.midas.presentation.dashboard.components.common

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bhyte.midas.R
import com.bhyte.midas.ui.theme.MidasTheme

@Composable
fun ToggleVisibilityButton(
    onClick: () -> Unit,
    isBalanceVisible: Boolean
) {
    val backgroundColor = colorResource(id = R.color.background_light)
    Surface(color = backgroundColor) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            FilledIconButton(
                onClick = onClick,
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = backgroundColor,
                ),
                modifier = Modifier.size(50.dp)
            ) {
                val iconResourceId = if (isBalanceVisible) R.drawable.showing else R.drawable.hidden
                Image(
                    painter = painterResource(id = iconResourceId),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    contentScale = ContentScale.Fit
                )
            }
        }
    }
}