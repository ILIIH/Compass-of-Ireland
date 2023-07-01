package com.example.di

import com.example.mock.EventsFactory
import org.koin.dsl.module

val mockModule = module {
    single { EventsFactory() }
}
