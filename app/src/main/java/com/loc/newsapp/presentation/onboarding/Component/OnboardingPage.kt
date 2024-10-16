package com.loc.newsapp.presentation.onboarding.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.loc.newsapp.R
import com.loc.newsapp.presentation.onboarding.Page
import com.loc.newsapp.presentation.onboarding.pages

@Composable
fun OnboardingPage(
    modifier: Modifier = Modifier,
    page: Page
){
    Column(
        //modifier = Modifier.fillMaxWidth()
    ){
        //val image:Painter = painterResource(id = R.drawable.onboarding1)
        Image(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.8f),
            painter = painterResource(page.image),
            contentDescription = "oboarding page 1 image",
            contentScale = ContentScale.Crop
            )

        Text(text = page.title,
            modifier = Modifier.align(Alignment.Start).padding(6.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

        Text(text = page.description,
            modifier = Modifier.align(Alignment.Start).padding(6.dp),
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium)
    }
}

@Preview
@Composable
fun OnboardingPagePreview(){
    OnboardingPage( page = pages[0])
}