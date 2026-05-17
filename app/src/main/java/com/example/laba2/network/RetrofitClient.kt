package com.example.laba2.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.example.com/") // Замени на свой URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}