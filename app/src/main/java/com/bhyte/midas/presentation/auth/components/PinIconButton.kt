package com.bhyte.midas.presentation.auth.components

import android.content.res.Configuration
import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhyte.midas.R
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.archivoFontFamily
import androidx.compose.ui.Modifier as Modifier1

@Composable
fun PinIconButton(
    onClick: () -> Unit,
    vectorResourceId: Int,
) {

    val backgroundColor = colorResource(id = R.color.background_light)
    FilledIconButton(
        onClick = onClick,
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = backgroundColor,
        ),
        modifier = Modifier1.size(80.dp)
    ) {
        Image(
            painter = painterResource(id = vectorResourceId),
            contentDescription = null,
            modifier = Modifier.size(40.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PinIconButtonPreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            PinIconButton(onClick = { /*TODO*/ }, vectorResourceId = R.drawable.fingerprint)
        }
    }
}