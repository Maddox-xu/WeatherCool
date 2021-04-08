package com.maddox.cool.logic.network

import com.maddox.cool.SunnyWeatherApplication
import com.maddox.cool.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query")city:String):Call<PlaceResponse>

}