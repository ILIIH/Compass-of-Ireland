package com.example.compassofukraine.util.map

import com.example.model.GeoPosition
import com.google.android.gms.maps.model.LatLng

fun List<GeoPosition>.toLatLng(): List<LatLng> {
    return this.map { LatLng(it.latitude, it.longitude) }
}

fun convertCoordinatesListToString(coordinatesList: List<LatLng>): String {
    val stringBuilder = StringBuilder()
    for (latLng in coordinatesList) {
        stringBuilder.append(latLng.latitude)
            .append(",")
            .append(latLng.longitude)
            .append("|") // Use "|" to separate multiple coordinates
    }
    return stringBuilder.toString()
}
