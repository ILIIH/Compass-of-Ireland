package com.example.compassofukraine.framework.map

import com.example.compassofukraine.framework.remote.model.DirectionResponse
import com.example.model.Direction
import com.example.model.Leg
import com.example.model.Route

fun DirectionResponse.Leg.toLegDomain() = Leg(
    duration = duration?.text,
    distance = distance?.text,
)

fun DirectionResponse.Route.toRouteDomain() = Route(
    legs = legs?.map { it.toLegDomain() },
)

fun DirectionResponse.toDomainDirection() = Direction(
    routes = routes?.map { it.toRouteDomain() },
)
