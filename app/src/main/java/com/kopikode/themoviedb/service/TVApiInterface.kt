package com.kopikode.themoviedb.service

import com.kopikode.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=d7b5318c3d23785afe13cece9c3de50e")
    fun getTVList(): Call<TVResponse>
}