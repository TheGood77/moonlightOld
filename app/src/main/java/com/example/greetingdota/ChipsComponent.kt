package com.example.greetingdota

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingdota.ui.theme.ChipsBackgroundColor
import com.example.greetingdota.ui.theme.Chips_Text

val items = listOf("MOBA", "MULTIPLAYER", "STRATEGY")

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChipsComponent() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(24.dp),
        modifier = Modifier,
    ) {
        items(items) { item ->
            AssistChip(
                onClick = {},
                shape = RoundedCornerShape(100.dp),
                border = null,
                colors = AssistChipDefaults.assistChipColors(containerColor = ChipsBackgroundColor),
                label = {
                    Text(
                        text = item,
                        textAlign = TextAlign.Left,
                        style = Chips_Text
                    )
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChipsComponentPreview() {
    ChipsComponent()
}