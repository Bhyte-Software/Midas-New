package com.bhyte.midas.presentation.onboarding

import androidx.annotation.DrawableRes
import com.bhyte.midas.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "EASY TO PAY AT HOME AND AWAY",
        description = "Some cards available on paid plans only",
        image = R.drawable.onboarding1

    ),
    Page(
        title = "CREATE & MANAGE VIRTUAL CARDS",
        description = "Some cards available on paid plans only",
        image = R.drawable.onboarding2

    ),
    Page(
        title = "YOUR MONEY PROTECTED - PERIOD",
        description = "Some cards available on paid plans only",
        image = R.drawable.onboarding5

    ),
    Page(
        title = "SEND & RECEIVE MONEY IN GHANA",
        description = "Some cards available on paid plans only",
        image = R.drawable.onboarding3

    ),
    Page(
        title = "ONE ACCOUNT FOR ALL YOUR MONEY",
        description = "Some cards available on paid plans only",
        image = R.drawable.onboarding4

    ),
    Page(
        title = "ALMOST 0% TRANSACTION COST",
        description = "Some cards available on paid plans only",
        image = R.drawable.onboarding6

    ),
)
