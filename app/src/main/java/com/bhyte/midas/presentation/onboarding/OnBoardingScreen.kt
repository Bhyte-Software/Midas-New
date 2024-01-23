package com.bhyte.midas.presentation.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bhyte.midas.presentation.constants.Dimens.SmallPadding
import com.bhyte.midas.presentation.components.common.GoogleButton
import com.bhyte.midas.presentation.components.common.PrimaryButton
import com.bhyte.midas.presentation.onboarding.components.Indicator
import com.bhyte.midas.presentation.onboarding.components.OnBoardingPage

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(
    event: (OnBoardingEvent) -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        val pagerState = rememberPagerState(initialPage = 0) {
            pages.size
        }
        val buttonState = remember {
            derivedStateOf {
                when (pagerState.currentPage) {
                    0 -> listOf("", "", "Get Started", "")
                    1 -> listOf("", "", "Get Started", "")
                    2 -> listOf("", "", "Get Started", "")
                    3 -> listOf("", "", "Get Started", "")
                    4 -> listOf("", "", "Get Started", "")
                    5 -> listOf("Log in", "Register", "", "Sign In With Google")
                    else -> listOf("", "", "", "", "")
                }
            }
        }
        Indicator(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = SmallPadding),
            pageSize = pages.size,
            selectedPage = pagerState.currentPage
        )

        HorizontalPager(
            state = pagerState, modifier = Modifier.weight(1f), verticalAlignment = Alignment.Top
        ) { index ->
            OnBoardingPage(page = pages[index])
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = SmallPadding),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {

            if (buttonState.value[0].isNotEmpty() && buttonState.value[1].isNotEmpty()) {
                Box(
                    modifier = Modifier.weight(1f)
                ) {
                    // Log in Button
                    PrimaryButton(text = buttonState.value[0]) {
                        event(OnBoardingEvent.SaveAppEntry)
                    }
                }

                Spacer(modifier = Modifier.width(15.dp))

                Box(
                    modifier = Modifier.weight(1f)
                ) {
                    // Register Button
                    PrimaryButton(text = buttonState.value[1], onClick = {
                        event(OnBoardingEvent.SaveAppEntry)
                    })
                }
            }

        }

        Spacer(modifier = Modifier.height(4.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(SmallPadding)
                .navigationBarsPadding()
        ) {
            if (buttonState.value[2].isNotEmpty()) {
                // Get Started Button
                PrimaryButton(text = buttonState.value[2], onClick = {
                    event(OnBoardingEvent.SaveAppEntry)
                })
            }
            if (buttonState.value[3].isNotEmpty()) {
                // Sign In With Google Button
                GoogleButton(text = buttonState.value[3], onClick = {
                    event(OnBoardingEvent.SaveAppEntry)
                })
            }

        }
    }
}