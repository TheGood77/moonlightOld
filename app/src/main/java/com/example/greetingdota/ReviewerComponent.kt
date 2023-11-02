package com.example.greetingdota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingdota.ui.theme.Date_Review_Text
import com.example.greetingdota.ui.theme.DividerColor
import com.example.greetingdota.ui.theme.Reviewer_Description_Text
import com.example.greetingdota.ui.theme.Reviewer_Name_Text

@Composable
fun ReviewerComponent(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(horizontal = 24.dp)) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
        ) {
            Image(
                modifier = modifier
                    .size(36.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.ic_first_reviewer),
                contentDescription = "Reviewer image"
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 7.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.first_name_reviewer),
                    textAlign = TextAlign.Center,
                    style = Reviewer_Name_Text
                )
                Text(
                    text = stringResource(id = R.string.date_review),
                    textAlign = TextAlign.Center,
                    style = Date_Review_Text
                )
            }
        }
        Spacer(modifier = modifier.padding(top = 16.dp))
        Text(
            text = stringResource(id = R.string.reviewer_text),
            textAlign = TextAlign.Left,
            style = Reviewer_Description_Text
        )
    }
    Divider(
        modifier = modifier.padding(horizontal = 38.dp, vertical = 24.dp),
        thickness = 1.dp,
        color = DividerColor
    )
} // TODO

@Preview(showBackground = true)
@Composable
fun ReviewerComponentPreview() {
    ReviewerComponent()
}