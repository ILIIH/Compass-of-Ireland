package com.example.di

import org.koin.dsl.module

val dataModule = module {
    includes(
        mockModule,
        repositoryModule
    )
}
