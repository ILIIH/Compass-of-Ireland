package com.example.useCase

import com.example.model.Direction

interface GetDirectionUseCase {
    suspend fun execute(
        origin: String?,
        destination: String?,
        apiKey: String?,
    ): Direction
}
