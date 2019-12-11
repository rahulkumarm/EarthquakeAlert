package com.exercise.earthquakes.network

import com.exercise.earthquakes.model.Earthquakes
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface EarthquakeService {

    companion object {
        const val BASE_URL = "http://api.geonames.org/"
        const val ENDPOINT = "earthquakesJSON?formatted=true"
    }

    @GET(ENDPOINT)
    fun invokeEarthquakes(
            @Query("north") north: Float,
            @Query("south") south: Float,
            @Query("east") east: Float,
            @Query("west") west: Float,
            @Query("username") username: String): Observable<Earthquakes>
}