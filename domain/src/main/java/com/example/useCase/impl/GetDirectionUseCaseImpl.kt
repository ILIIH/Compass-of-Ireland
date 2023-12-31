package com.example.useCase.impl

import com.example.model.Direction
import com.example.repository.GoogleMapRepository
import com.example.useCase.GetDirectionUseCase

class GetDirectionUseCaseImpl (
    private val repository: GoogleMapRepository
): GetDirectionUseCase {
    override suspend fun execute(
        origin: String?,
        destination: String?,
        apiKey: String?
    ): Direction {
        return repository.getDirections(origin, destination,apiKey )
    }
}