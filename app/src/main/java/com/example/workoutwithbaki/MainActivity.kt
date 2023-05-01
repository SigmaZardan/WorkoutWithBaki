package com.example.workoutwithbaki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.workoutwithbaki.ui.theme.WorkoutWithBakiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkoutWithBakiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BakiWorkoutCard()
                }
            }
        }
    }
}

@Composable
fun BakiWorkoutApp() {

}

@Composable
fun BakiWorkoutList() {

}

@Composable
fun BakiWorkoutCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.padding(15.dp)
    ) {
        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.day),
                style = MaterialTheme.typography.h2
            )
            BakiWorkoutTitle()
            BakiWorkoutImage()
            BakiWorkoutDescription()
        }
    }
}


@Composable
fun BakiWorkoutTitle() {
    Text(
        text = stringResource(id = R.string.title1),
        style = MaterialTheme.typography.h3
    )
}

@Composable
fun BakiWorkoutImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.baki1),
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun BakiWorkoutDescription() {
    Text(
        text = stringResource(id = R.string.description1),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun BakiWorkoutAppBar() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WorkoutWithBakiTheme {
        BakiWorkoutCard()
    }
}