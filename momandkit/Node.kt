package com.utcc.momandkit

import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import java.util.*

interface Node {
    @POST("/register")
    @FormUrlEncoded
    fun registerUser(
        @Field("email") email: String,
        @Field("userName")userName: String,
        @Field("password")password: String,
        @Field("enterPass")enterPass: String): Observable<String>


    @POST("/login")
    @FormUrlEncoded
    fun  userLogin(
        @Field("email")email: String,
        @Field("password")password: String): Observable<String>

}


