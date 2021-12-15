package com.utcc.momandkit

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

object retrofitClient {
    private var ourInstance: Retrofit? = null
    val instance: Retrofit
        get(){
            if (ourInstance == null){
                ourInstance = Retrofit.Builder()
                    .baseUrl("http://10.0.2.2:3000/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build()
            }
            return ourInstance!!
        }
}