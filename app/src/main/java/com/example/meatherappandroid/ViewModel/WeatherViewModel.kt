package com.example.meatherappandroid.ViewModel

import androidx.lifecycle.ViewModel
import com.example.meatherappandroid.Repository.WeatherRepository
import com.example.meatherappandroid.Server.ApiClient
import com.example.meatherappandroid.Server.ApiServices

class WeatherViewModel(val repository: WeatherRepository) : ViewModel() {
    constructor() : this(
        WeatherRepository(ApiClient().getClient().create(ApiServices::class.java))
    )

    fun loadCurrentWeather(lat: Double, lng: Double, unit: String) =
        repository.getCurrentWeather(lat, lng, unit)
}