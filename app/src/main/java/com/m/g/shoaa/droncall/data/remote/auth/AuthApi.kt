package com.m.g.shoaa.droncall.data.remote.auth

import com.m.g.shoaa.droncall.data.remote.dto.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

data class LoginRequest(val username:String , val password : String)

interface AuthApi {
    @POST("users/login")
    suspend fun login(@Body request: LoginRequest) : LoginResponse
}