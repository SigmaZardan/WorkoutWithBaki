package com.example.workoutwithbaki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
fun BakiWorkoutCard() {

}

@Composable
fun BakiWorkoutTitle() {

}

@Composable
fun BakiWorkoutImage() {

}

@Composable
fun BakiWorkoutDescription() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WorkoutWithBakiTheme {
    }
}