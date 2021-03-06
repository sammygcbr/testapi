package com.example.testapi.retrofit

import com.example.testapi.retrofit.service.ResponseService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun responseService() = retrofit.create(ResponseService::class.java)

}