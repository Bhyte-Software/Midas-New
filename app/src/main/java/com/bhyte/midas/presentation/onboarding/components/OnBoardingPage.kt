package com.bhyte.midas.presentation.onboarding.components

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhyte.midas.presentation.Dimens.MediumPadding
import com.bhyte.midas.presentation.Dimens.SmallPadding
import com.bhyte.midas.presentation.onboarding.Page
import com.bhyte.midas.presentation.onboarding.pages
import com.bhyte.midas.ui.theme.MidasTheme
import com.bhyte.midas.ui.theme.pleinFontFamily

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier, page: Page
) {
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(modifier = modifier.padding(top = SmallPadding)) {
            Text(
                text = page.title,
                modifier = Modifier.padding(horizontal = SmallPadding),
                style = MaterialTheme.typography.displaySmall,
                lineHeight = 32.sp,
                fontFamily = pleinFontFamily,
                fontWeight = FontWeight.Black,
            )
            Text(
                text = page.description,
                modifier = Modifier.padding(horizontal = SmallPadding).padding(top = 2.dp),
                style = MaterialTheme.typography.bodyLarge,
            )
            Spacer(modifier = Modifier.height(MediumPadding))

            Image(
                modifier = Modifier
                    .padding(horizontal = SmallPadding).padding(top = MediumPadding)
                    .fillMaxWidth(),
                painter = painterResource(id = page.image),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )

        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_NO, showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun OnBoardingPagePreview() {
    MidasTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            OnBoardingPage(page = pages[6])
        }
    }
}