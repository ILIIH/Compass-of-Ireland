package com.example.compassofukraine.di

import com.example.compassofukraine.BuildConfig
import com.example.compassofukraine.framework.remote.MapsDirectionService
import com.example.compassofukraine.framework.repository.GoogleMapRepositoryImpl
import com.example.repository.GoogleMapRepository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single {
        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL_MAPS_DIRECTION)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(MapsDirectionService::class.java)
    }

    single <GoogleMapRepository> { GoogleMapRepositoryImpl(get()) }
}
