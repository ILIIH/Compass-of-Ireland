package com.example.repository

import com.example.model.Direction

interface GoogleMapRepository {
    suspend fun getDirections(
        origin: String?,
        destination: String?,
        apiKey: String?
    ): Direction
}