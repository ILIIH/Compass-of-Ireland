package com.example.compassofukraine.viewModel.map

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.compassofukraine.util.ResultOf
import com.example.compassofukraine.util.map.convertCoordinatesListToString
import com.example.model.Direction
import com.example.model.excursion.DetailedExcursion
import com.example.useCase.GetDirectionUseCase
import com.google.android.gms.maps.model.LatLng
import java.net.SocketTimeoutException
import kotlinx.coroutines.launch

class GoogleMapViewModel(private val getDirectionUseCase: GetDirectionUseCase): ViewModel() {
    private val _route: MutableState<ResultOf<Direction>> = mutableStateOf(ResultOf.Loading)
    val route: State<ResultOf<Direction>> get() = _route


    fun getRoute(origin: String,waypoints: List<LatLng>,apiKey: String ) {

        val destinations: String = convertCoordinatesListToString(waypoints)

        viewModelScope.launch {
            try {
                _route.value = ResultOf.Success(getDirectionUseCase.execute(origin,destinations, apiKey ))
            } catch (e: SocketTimeoutException) {
                _route.value = ResultOf.Error(e)
            }
        }
    }
}
