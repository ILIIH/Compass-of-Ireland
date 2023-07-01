package com.example.di

import com.example.useCase.GetEventsUseCase
import com.example.useCase.impl.GetEventsUseCaseImpl
import org.koin.dsl.module

val useCaseModule = module {
    single<GetEventsUseCase> { GetEventsUseCaseImpl(get()) }
}
