package com.example.di

import com.example.useCase.GetDirectionUseCase
import com.example.useCase.impl.GetDirectionUseCaseImpl
import org.koin.dsl.module

val googleMapUseCase = module {
    single<GetDirectionUseCase> { GetDirectionUseCaseImpl(get()) }
}

