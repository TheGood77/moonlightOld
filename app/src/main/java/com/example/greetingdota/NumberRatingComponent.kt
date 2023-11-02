package com.example.greetingdota

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingdota.ui.theme.Number_Rating_Text

@Composable
fun NumberRatingComponent() {
    Text(
        text = stringResource(id = R.string.number_rating_text),
        textAlign = TextAlign.Left,
        style = Number_Rating_Text
    )
}

@Preview(showBackground = true)
@Composable
fun NumberRatingComponentPreview() {
    NumberRatingComponent()
}