package com.bhyte.midas.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.bhyte.midas.R
import com.bhyte.midas.presentation.constants.Dimens.SmallPadding

@Composable
fun Indicator(
    modifier: Modifier = Modifier,
    pageSize: Int,
    selectedPage: Int,
) {

    val selectedColor = colorResource(id = R.color.primary)
    val unselectedColor = colorResource(id = R.color.background_lighter)

    Row(modifier = modifier.padding(horizontal = SmallPadding), horizontalArrangement = Arrangement.SpaceBetween) {
        repeat(pageSize) { page ->
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(6.dp)
                    .padding(horizontal = 2.dp)
                    .clip(CircleShape)
                    .background(color = if (page <= selectedPage) selectedColor else unselectedColor)
            )
        }
    }
}