package com.example.greetingdota

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BackgroundImageComponent() {
    Image(
        painter = painterResource(id = R.drawable.ic_background_image),
        contentDescription = "background_image",
        contentScale = ContentScale.FillWidth,
    )
}

@Preview(showBackground = true)
@Composable
fun BackgroundImageComponentPreview() {
    BackgroundImageComponent()
}