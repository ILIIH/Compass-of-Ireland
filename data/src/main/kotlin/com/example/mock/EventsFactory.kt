package com.example.mock

import com.example.model.Event
import com.example.model.Location

internal class EventsFactory {
    fun get(location: Location): List<Event> {
        return when (location) {
            is Location.Kharkiv -> listOf(
                Event(
                    "Okean Elzy",
                    "Word tour 2024",
                    "https://i1.sndcdn.com/artworks-0bq97n0yddKGBwyj-aZyhzg-t500x500.jpg"
                ),
                Event(
                    "95 Kvartal",
                    "Stand up",
                    "https://yt3.googleusercontent.com/NGRscJTU-FVvX-70K7bBOFn1Gmd4llwyXis23KwSdRDQS8pRB1Cur1-0hKte9HM70AKF9C_vo2w=s900-c-k-c0x00ffffff-no-rj"
                ),
                Event(
                    "Dacha bracha",
                    "Concert",
                    "https://lvivmozart.com/assets/uploads/person/DahaBraha_db5.jpg"
                ),
                Event(
                    "Kharkiv City Day",
                    "Celebration",
                    "https://cdnp.flypgs.com/files/Sehirler-long-tail/Kharkiv/kharkiv-sehir.jpg"
                ),
                Event(
                    "Zhadan i sobaky",
                    "Concert",
                    "https://www.nta.ua/wp-content/uploads/2022/09/na-sajt-1-1.jpg"
                )
            )
            is Location.Kyiv -> listOf(
                Event(
                    "95 Kvartal",
                    "Stand up",
                    "https://yt3.googleusercontent.com/NGRscJTU-FVvX-70K7bBOFn1Gmd4llwyXis23KwSdRDQS8pRB1Cur1-0hKte9HM70AKF9C_vo2w=s900-c-k-c0x00ffffff-no-rj"
                ),
                Event(
                    "Okean Elzy",
                    "Word tour 2024",
                    "https://i1.sndcdn.com/artworks-0bq97n0yddKGBwyj-aZyhzg-t500x500.jpg"
                ),
                Event(
                    "Kyiv City Day",
                    "Celebration",
                    "https://cdnp.flypgs.com/files/Sehirler-long-tail/Kyiv/kyiv-bag_ms_zl_k-anit.jpg"
                ),
                Event(
                    "Jazz on the roof: Louis Armstrong",
                    "Concert",
                    "https://hips.hearstapps.com/hmg-prod/images/louis.jpg"
                )
            )
            else -> emptyList()
        }
    }
}
