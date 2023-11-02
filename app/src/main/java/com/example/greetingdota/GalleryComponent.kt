package com.example.greetingdota

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingdota.ui.theme.BackgroundColor

@Composable
fun GalleryComponent() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(BackgroundColor)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.ic_first_gallery_image),
                contentDescription = "first_gallery_image",
                contentScale = ContentScale.Crop,
            )
            Image(
                painter = painterResource(id = R.drawable.ic_second_gallery_image),
                contentDescription = "second_gallery_image",
                contentScale = ContentScale.Crop,
            )
        }
    }
} // TODO: PlayButton on image

@Preview(showBackground = true)
@Composable
fun GalleryComponentPreview() {
    GalleryComponent()
}