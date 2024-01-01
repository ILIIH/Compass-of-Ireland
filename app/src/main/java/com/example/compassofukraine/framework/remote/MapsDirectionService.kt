package com.example.compassofukraine.framework.remote

import com.example.compassofukraine.framework.remote.model.DirectionResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MapsDirectionService {
    @GET("directions/json")
    suspend fun getDirections(
        @Query("origin") origin: String?,
        @Query("destination") destination: String?,
        @Query("key") apiKey: String?
    ): DirectionResponse
}
