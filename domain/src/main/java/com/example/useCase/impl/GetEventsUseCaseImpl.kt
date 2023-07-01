package com.example.useCase.impl

import com.example.model.Location
import com.example.repository.EventsRepository
import com.example.useCase.GetEventsUseCase

internal class GetEventsUseCaseImpl(
    private val eventsRepository: EventsRepository
) : GetEventsUseCase {
    override suspend fun execute(location: Location) = eventsRepository.getEvents(location)
}
