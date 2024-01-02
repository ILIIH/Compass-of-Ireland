package com.example.compassofukraine.framework.remote.model

import com.google.gson.annotations.SerializedName

class DirectionResponse {
    @SerializedName("routes")
    var routes: List<Route>? = null

    class Route {
        @SerializedName("legs")
        var legs: List<Leg>? = null
    }

    class Leg {
        @SerializedName("duration")
        var duration: Duration? = null

        @SerializedName("distance")
        var distance: Distance? = null
    }

    class Duration {
        @SerializedName("text")
        var text: String? = null
    }

    class Distance {
        @SerializedName("text")
        var text: String? = null
    }
}
