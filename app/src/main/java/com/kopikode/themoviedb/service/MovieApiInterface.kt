package com.kopikode.themoviedb.service

import com.kopikode.themoviedb.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=d7b5318c3d23785afe13cece9c3de50e")
    fun getMovieList(): Call<MovieResponse>


}