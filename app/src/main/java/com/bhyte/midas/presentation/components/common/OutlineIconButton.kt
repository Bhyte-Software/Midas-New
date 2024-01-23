package com.bhyte.midas.presentation.components.common

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun OutlineIconButton(
    onClick: () -> Unit,
    imageDrawableId: Int
) {
    val backgroundColor = colorResource(id = R.color.background)
    val borderColor = colorResource(id = R.color.background_lighter)
    Surface(
        color = MaterialTheme.colorScheme.background,
    ) {
        FilledIconButton(
            onClick = onClick,
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = backgroundColor,
            ),
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .border(1.dp, borderColor, RoundedCornerShape(size = 1000.dp)),
        ) {
            Image(
                painter = painterResource(id = imageDrawableId),
                contentDescription = null,
                modifier = Modifier.size(26.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun OutlineIconButtonPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            OutlineIconButton(
                onClick = {},
                imageDrawableId = R.drawable.facebook
            )
        }
    }
}
