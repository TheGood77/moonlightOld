package com.example.greetingdota

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingdota.ui.theme.StrokeColor

@Composable
fun LogoComponent() {
    Card(
        modifier = Modifier.size(size = 88.dp),
        shape = RoundedCornerShape(13.dp),
        colors = CardDefaults.cardColors(Color.Black),
        border = BorderStroke(width = 3.dp, color = StrokeColor),
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier.size(size = 54.dp),
                painter = painterResource(id = R.drawable.ic_dota_logo),
                contentDescription = "dota_logo_image"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LogoComponentPreview() {
    LogoComponent()
}