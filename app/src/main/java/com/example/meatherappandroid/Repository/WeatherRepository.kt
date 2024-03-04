package com.example.meatherappandroid.Repository

import com.example.meatherappandroid.Server.ApiServices

class WeatherRepository(val api: ApiServices) {
    fun getCurrentWeather(lat: Double, lng: Double, unit: String) = api.getCurrentWeather(
        lat, lng, unit, "072f10ab5761df05393e3a3c4a8ceeb4"
    )
}