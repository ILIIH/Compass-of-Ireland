package com.example.compassofukraine.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.compassofukraine.util.ResultOf
import com.example.compassofukraine.viewModel.map.GoogleMapViewModel
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import org.koin.androidx.compose.koinViewModel

/*
@Composable
fun MapWithDrivingRoute(
    origin: LatLng,
    waypoints: List<LatLng>
) {
    val mapViewModel = koinViewModel<GoogleMapViewModel>()
    val route by remember { mapViewModel.route }

    mapViewModel.getRoute(
        origin.toString(),
        waypoints,
        ""
    )
    when(route){
        is ResultOf.Success -> {
            val mapView = rememberMapViewWithLifecycle()

            AndroidView({ mapView }) { mapView ->
                mapView.getMapAsync { googleMap ->
                    // Add markers or polylines for each route
                    for (route in routes) {
                        val polylineOptions = PolylineOptions()
                        polylineOptions.addAll(route)
                        polylineOptions.color(Color.BLUE)
                        googleMap.addPolyline(polylineOptions)
                    }
                }
            }
        }
        is ResultOf.Loading -> {

        }
        is ResultOf.Error -> {

        }
    }
    
}

fun rememberMapViewWithLifecycle(): Any {

}

*/
