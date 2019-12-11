package com.exercise.earthquakes.model

import java.io.Serializable

class EarthquakeItem : Serializable {

    var eqid: String? = null
    var magnitude: Double = 0.0
    var lng: Double? = null
    var src: String? = null
    var datetime: String? = null
    var lat: Double? = null
    var depth: String? = null

    override fun toString(): String {
        return "EarthquakeItem [eqid = $eqid, magnitude = $magnitude, lng = $lng, src = $src, datetime = $datetime, lat = $lat, depth = $depth]"
    }

    public fun getLocation(): String {
        return String.format("(%s, %s)", lat, lng)
    }
}

