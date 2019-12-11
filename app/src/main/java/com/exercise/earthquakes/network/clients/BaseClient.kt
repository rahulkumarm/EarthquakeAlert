package com.exercise.earthquakes.network.clients

import com.exercise.earthquakes.network.EarthquakeRequestParams
import com.exercise.earthquakes.ui.interfaces.OnEarthquakeRetrieved

abstract class BaseClient {

    abstract fun release()

    abstract fun queryEarthquakes(params: EarthquakeRequestParams, onEarthquakeReceived: OnEarthquakeRetrieved)
}