package com.example.di

import com.example.repository.EventsRepository
import com.example.repository.EventsRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<EventsRepository> { EventsRepositoryImpl(get()) }
}
