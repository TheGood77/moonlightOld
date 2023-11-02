package com.example.greetingdota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingdota.ui.theme.Rating_Review_Text

@Preview
@Composable
fun RatingReviewComponent(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row (
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Image(
                modifier = modifier.size(size = 12.dp),
                painter = painterResource(R.drawable.ic_star),
                contentDescription = "Full_star"
            )
            Image(
                modifier = modifier.size(size = 12.dp),
                painter = painterResource(R.drawable.ic_star),
                contentDescription = "Full_star"
            )
            Image(
                modifier = modifier.size(size = 12.dp),
                painter = painterResource(R.drawable.ic_star),
                contentDescription = "Full_star"
            )
            Image(
                modifier = modifier.size(size = 12.dp),
                painter = painterResource(R.drawable.ic_star),
                contentDescription = "Full_star"
            )
            Image(
                modifier = modifier.size(size = 12.dp),
                painter = painterResource(R.drawable.ic_part_star),
                contentDescription = "Part_star"
            )
        }
        Text(
            text = stringResource(id = R.string.review_rating_text),
            textAlign = TextAlign.Center,
            style = Rating_Review_Text
        )
    }
}