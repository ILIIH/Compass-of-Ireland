package com.example.model

sealed interface Location {
    object Kharkiv : Location
    object Kyiv : Location
}
