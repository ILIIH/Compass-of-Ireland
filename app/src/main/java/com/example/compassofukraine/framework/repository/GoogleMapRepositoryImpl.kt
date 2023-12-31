package com.example.compassofukraine.framework.repository

import com.example.compassofukraine.framework.map.toDomainDirection
import com.example.compassofukraine.framework.remote.MapsDirectionService
import com.example.repository.GoogleMapRepository

class GoogleMapRepositoryImpl(
    private val mapsDirectionService: MapsDirectionService,
) : GoogleMapRepository {
    override suspend fun getDirections(
        origin: String?,
        destination: String?,
        apiKey: String?,
    ) = mapsDirectionService.getDirections(origin, destination, apiKey).toDomainDirection()
}
