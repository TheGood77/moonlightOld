package com.example.greetingdota

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.greetingdota.ui.theme.Name_Section_Text

@Composable
fun NameSectionComponent() {
    Text(
        text = stringResource(id = R.string.name_section_text),
        textAlign = TextAlign.Left,
        style = Name_Section_Text
    )
}