package com.example.greetingdota

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingdota.ui.theme.Review_Title_Text

@Composable
fun ReviewTitleComponent() {
    Text(
        text = stringResource(id = R.string.review_title_text),
        textAlign = TextAlign.Left,
        style = Review_Title_Text,
        modifier = Modifier.padding(start = 24.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ReviewTitleComponentPreview() {
    ReviewTitleComponent()
}