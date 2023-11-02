package com.example.greetingdota

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingdota.ui.theme.Description_Text

@Composable
fun TextDescriptionComponent() {
    Text(
        text = stringResource(id = R.string.description_text),
        textAlign = TextAlign.Left,
        style = Description_Text,
        modifier = Modifier.padding(start = 24.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun TextDescriptionComponentPreview() {
    TextDescriptionComponent()
}