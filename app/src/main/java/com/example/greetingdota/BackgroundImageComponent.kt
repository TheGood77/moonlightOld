package com.example.greetingdota

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun BackgroundImageComponent() {
    Image(
        painter = painterResource(id = R.drawable.ic_background_image),
        contentDescription = "background_image",
        contentScale = ContentScale.Crop,
    )
}