package com.example.model

data class Direction(
    val routes: List<Route>?,
)

data class Route(
    var legs: List<Leg>?,
)

data class Leg(
    val duration: String?,
    val distance: String?,
)
