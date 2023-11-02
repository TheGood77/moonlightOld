package com.example.greetingdota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingdota.ui.theme.GreetingDotaTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.greetingdota.ui.theme.BackgroundColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            GreetingDotaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BackgroundColor
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF050B18)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Box {
                BackgroundImageComponent()
                BackgroundComponent()
                Box(
                    modifier = Modifier
                        .padding(top = 324.dp, start = 24.dp)
                ) {
                    Row {
                        LogoComponent()
                        Spacer(modifier = Modifier.padding(horizontal = 6.dp))
                        Column(
                            modifier = Modifier
                                .padding(top = 34.dp)
                        )
                        {
                            TitleComponent()
                            Spacer(modifier = Modifier.padding(vertical = 3.dp))
                            RatingComponent()
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(top = 400.dp)
                ) {
                    Column {
                        ChipsComponent()
                        TextDescriptionComponent()
                        Spacer(modifier = Modifier.padding(vertical = 7.dp))
                        GalleryComponent()
                        Spacer(modifier = Modifier.padding(vertical = 10.dp))
                        ReviewTitleComponent()
                        Spacer(modifier = Modifier.padding(vertical = 6.dp))
                        Row (
                            modifier = Modifier
                                .padding(start = 24.dp)
                        ){
                            NumberRatingComponent()
                            Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                            RatingReviewComponent()
                        }
                        Spacer(modifier = Modifier.padding(vertical = 16.dp))
                        ReviewerComponent()
                        Spacer(modifier = Modifier.padding(vertical = 20.dp))
                        ButtonComponent()
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 1)
@Composable
fun MainPreview() {
    MainScreen()
}
