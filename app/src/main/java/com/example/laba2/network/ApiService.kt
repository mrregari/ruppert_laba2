package com.example.laba2.network

import com.example.laba2.data.LoginReq
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @POST("/login") fun login(@Body req: LoginReq): Call<Void>
    @GET("/feelings") fun getMoods(): Call<List<com.example.laba2.data.MoodRemote>>
}