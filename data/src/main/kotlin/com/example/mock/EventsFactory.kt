package com.example.mock

import android.content.Context
import com.example.data.R
import com.example.model.Event
import com.example.model.Location
import kotlinx.coroutines.delay

internal class EventsFactory(private val context: Context) {
    suspend fun get(location: Location): List<Event> {
        delay(1000)
        return when (location) {
            is Location.Kharkiv -> listOf(
                Event(
                    1,
                    context.getString(R.string.event_1_title),
                    context.getString(R.string.event_1_description),
                    "https://i1.sndcdn.com/artworks-0bq97n0yddKGBwyj-aZyhzg-t500x500.jpg"
                ),
                Event(
                    2,
                    context.getString(R.string.event_2_title),
                    context.getString(R.string.event_2_description),
                    "https://yt3.googleusercontent.com/NGRscJTU-FVvX-70K7bBOFn1Gmd4llwyXis23KwSdRDQS8pRB1Cur1-0hKte9HM70AKF9C_vo2w=s900-c-k-c0x00ffffff-no-rj"
                ),
                Event(
                    3,
                    context.getString(R.string.event_3_title),
                    context.getString(R.string.event_3_description),
                    "https://lvivmozart.com/assets/uploads/person/DahaBraha_db5.jpg"
                ),
                Event(
                    4,
                    context.getString(R.string.event_4_title),
                    context.getString(R.string.event_4_description),
                    "https://cdnp.flypgs.com/files/Sehirler-long-tail/Kharkiv/kharkiv-sehir.jpg"
                ),
                Event(
                    5,
                    context.getString(R.string.event_5_title),
                    context.getString(R.string.event_5_description),
                    "https://www.nta.ua/wp-content/uploads/2022/09/na-sajt-1-1.jpg"
                ),
                Event(
                    1,
                    context.getString(R.string.event_1_title),
                    context.getString(R.string.event_1_description),
                    "https://i1.sndcdn.com/artworks-0bq97n0yddKGBwyj-aZyhzg-t500x500.jpg"
                ),
                Event(
                    2,
                    context.getString(R.string.event_2_title),
                    context.getString(R.string.event_2_description),
                    "https://yt3.googleusercontent.com/NGRscJTU-FVvX-70K7bBOFn1Gmd4llwyXis23KwSdRDQS8pRB1Cur1-0hKte9HM70AKF9C_vo2w=s900-c-k-c0x00ffffff-no-rj"
                ),
                Event(
                    3,
                    context.getString(R.string.event_3_title),
                    context.getString(R.string.event_3_description),
                    "https://lvivmozart.com/assets/uploads/person/DahaBraha_db5.jpg"
                ),
                Event(
                    4,
                    context.getString(R.string.event_4_title),
                    context.getString(R.string.event_4_description),
                    "https://cdnp.flypgs.com/files/Sehirler-long-tail/Kharkiv/kharkiv-sehir.jpg"
                ),
                Event(
                    5,
                    context.getString(R.string.event_5_title),
                    context.getString(R.string.event_5_description),
                    "https://www.nta.ua/wp-content/uploads/2022/09/na-sajt-1-1.jpg"
                )
            )

            is Location.Kyiv -> listOf(
                Event(
                    2,
                    "95 Kvartal",
                    "Stand up",
                    "https://yt3.googleusercontent.com/NGRscJTU-FVvX-70K7bBOFn1Gmd4llwyXis23KwSdRDQS8pRB1Cur1-0hKte9HM70AKF9C_vo2w=s900-c-k-c0x00ffffff-no-rj"
                ),
                Event(
                    1,
                    "Okean Elzy",
                    "Word tour 2024",
                    "https://i1.sndcdn.com/artworks-0bq97n0yddKGBwyj-aZyhzg-t500x500.jpg"
                ),
                Event(
                    6,
                    "Kyiv City Day",
                    "Celebration",
                    "https://cdnp.flypgs.com/files/Sehirler-long-tail/Kyiv/kyiv-bag_ms_zl_k-anit.jpg"
                ),
                Event(
                    7,
                    "Jazz on the roof: Louis Armstrong",
                    "Concert",
                    "https://hips.hearstapps.com/hmg-prod/images/louis.jpg"
                )
            )

            else -> emptyList()
        }
    }
}
