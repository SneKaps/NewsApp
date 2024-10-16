package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image:Int
)

val pages = listOf(
    Page(
        title = "Oboarding Page 1",
        description = "This is page 1 of onboarding which the users see when they install the app",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Oboarding Page 3",
        description = "This is page 2 of onboarding which the users see when they install the app",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Oboarding Page 3",
        description = "This is page 3 of onboarding which the users see when they install the app",
        image = R.drawable.onboarding3
    )
)
