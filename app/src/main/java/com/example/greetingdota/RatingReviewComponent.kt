package com.example.greetingdota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
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
    Column(
        modifier = modifier
            .padding(top = 15.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(4) {
                Image(
                    modifier = modifier.size(size = 12.dp),
                    painter = painterResource(R.drawable.ic_star),
                    contentDescription = "Full_star"
                )
            }
            item {
                Image(
                    modifier = modifier.size(size = 12.dp),
                    painter = painterResource(R.drawable.ic_part_star),
                    contentDescription = "Part_star"
                )
            }
        }
        Text(
            text = stringResource(id = R.string.review_rating_text),
            textAlign = TextAlign.Center,
            style = Rating_Review_Text
        )
    }
}