package com.example.webtoon.Network

import android.app.Application

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ConnectController : Application() {
    private val BASE_URL = "https://webtoon.p.rapidapi.com"
    lateinit var connect: Connect


    companion object {
        lateinit var instance: ConnectController
    }

    override fun onCreate() {
        super.onCreate()

        instance = this
        buildConnect()
    }

    private fun buildConnect() {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        connect = retrofit.create(Connect::class.java)
    }

}