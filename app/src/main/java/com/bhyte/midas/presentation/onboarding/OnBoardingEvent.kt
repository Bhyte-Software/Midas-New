package com.bhyte.midas.presentation.onboarding
sealed class OnBoardingEvent {
    data object SaveAppEntry: OnBoardingEvent()
}