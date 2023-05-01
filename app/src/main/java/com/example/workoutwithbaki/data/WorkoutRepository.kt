package com.example.workoutwithbaki.data

import com.example.workoutwithbaki.R
import com.example.workoutwithbaki.model.Workout


fun workouts(): List<Workout> {

    return listOf(
        Workout(R.string.title1,  R.drawable.baki1, R.string.description1),
        Workout(R.string.title2,  R.drawable.baki2, R.string.description2),
        Workout(R.string.title3,  R.drawable.baki3, R.string.description3),
        Workout(R.string.title4,  R.drawable.baki4, R.string.description4),
        Workout(R.string.title5,  R.drawable.baki5, R.string.description5),
        Workout(R.string.title6,  R.drawable.baki6, R.string.description6),
        Workout(R.string.title7,  R.drawable.baki7, R.string.description7),
    )
}