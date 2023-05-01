package com.example.workoutwithbaki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.workoutwithbaki.data.workouts
import com.example.workoutwithbaki.model.Workout
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
                    BakiWorkoutApp()
                }
            }
        }
    }
}

// list of workouts
private val workouts = workouts()

@Composable
fun BakiWorkoutApp() {
    BakiWorkoutList(workouts = workouts)
}

@Composable
fun BakiWorkoutList(workouts: List<Workout>) {
    LazyColumn() {
        items(workouts) { workout ->
            BakiWorkoutCard(workout)
        }

    }
}

@Composable
fun BakiWorkoutCard(workout: Workout, modifier: Modifier = Modifier) {
    val dayNumber = (workouts.indexOf(workout) + 1)
    Card(
        modifier = modifier.padding(15.dp)
    ) {
        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.day, dayNumber),
                style = MaterialTheme.typography.h2
            )
            BakiWorkoutTitle(workout.workoutTitleRes)
            BakiWorkoutImage(workout.workoutImageRes)
            BakiWorkoutDescription(workout.workoutDescriptionRes)
        }
    }
}


@Composable
fun BakiWorkoutTitle(@StringRes workoutTitle: Int) {
    Text(
        text = stringResource(id = workoutTitle),
        style = MaterialTheme.typography.h3
    )
}

@Composable
fun BakiWorkoutImage(@DrawableRes workoutImageRes: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(workoutImageRes),
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun BakiWorkoutDescription(@StringRes workoutDescriptionRes: Int) {
    Text(
        text = stringResource(id = workoutDescriptionRes),
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
        BakiWorkoutApp()
    }
}