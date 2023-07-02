package com.example.repository

import com.example.mock.EventsFactory
import com.example.model.Event
import com.example.model.Location

internal class EventsRepositoryImpl(
    private val eventsFactory: EventsFactory
) : EventsRepository {
    override suspend fun getEvents(location: Location): List<Event> = eventsFactory.get(location)
}
