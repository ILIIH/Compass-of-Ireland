package com.example.repository

import com.example.model.Event
import com.example.model.Location

interface EventsRepository {
    suspend fun getEvents(location: Location): List<Event>
}
