package com.example.useCase

import com.example.model.Event
import com.example.model.Location

interface GetEventsUseCase {
    suspend fun execute(location: Location): List<Event>
}
