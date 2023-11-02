package com.example.greetingdota

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingdota.ui.theme.Title_Text

@Composable
fun TitleComponent() {
    Text(
        text = stringResource(id = R.string.title_text),
        textAlign = TextAlign.Left,
        style = Title_Text
    )
}

@Preview(showBackground = true)
@Composable
fun TitleComponentPreview() {
    TitleComponent()
}