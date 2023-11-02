package com.example.greetingdota

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.greetingdota.ui.theme.BackgroundColor

@Composable
fun BackgroundComponent() {
    Box(
        modifier = Modifier
            .size(930.dp)
            .background(color = BackgroundColor)
    )
}