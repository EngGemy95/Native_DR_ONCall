package com.m.g.shoaa.droncall.domain.repository

import com.m.g.shoaa.droncall.data.remote.dto.LoginResponse

interface AuthRepository {
    suspend fun login(username : String , password : String) : LoginResponse
}