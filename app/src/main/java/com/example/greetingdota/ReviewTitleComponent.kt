package com.example.greetingdota

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingdota.ui.theme.Review_Title_Text

@Composable
fun ReviewTitleComponent() {
    Text(
        text = stringResource(id = R.string.review_title_text),
        textAlign = TextAlign.Left,
        style = Review_Title_Text
    )
}

@Preview(showBackground = true)
@Composable
fun ReviewTitleComponentPreview() {
    ReviewTitleComponent()
}