package com.example.workoutwithbaki.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Workout(
    @StringRes val workoutTitleRes: Int,
    @DrawableRes val workoutImageRes: Int,
    @StringRes val workoutDescriptionRes: Int
)
