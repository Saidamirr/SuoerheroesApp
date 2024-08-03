package com.example.superherosapp.data

import com.example.superherosapp.R

data class Hero(
    val nameRes: Int,
    val  aboutRes: Int,
    val pictureRes: Int,
)

object HeroesRepository {
    val heroes = listOf(
        Hero(
            nameRes = R.string.hero1,
            aboutRes = R.string.description1,
            pictureRes = R.drawable.android_superhero1
        ),
        Hero(
            nameRes = R.string.hero2,
            aboutRes = R.string.description2,
            pictureRes = R.drawable.android_superhero2
        ),
        Hero(
            nameRes = R.string.hero3,
            aboutRes = R.string.description3,
            pictureRes = R.drawable.android_superhero3
        ),
        Hero(
            nameRes = R.string.hero4,
            aboutRes = R.string.description4,
            pictureRes = R.drawable.android_superhero4
        ),
        Hero(
            nameRes = R.string.hero5,
            aboutRes = R.string.description5,
            pictureRes = R.drawable.android_superhero5
        ),
        Hero(
            nameRes = R.string.hero6,
            aboutRes = R.string.description6,
            pictureRes = R.drawable.android_superhero6
        )
    )
}
