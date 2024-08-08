package com.m.g.shoaa.droncall.domain.repository

import com.m.g.shoaa.droncall.data.remote.dto.LoginResponse
import com.m.g.shoaa.droncall.domain.model.Auth

interface AuthRepository {
    suspend fun login(username : String , password : String) : Auth
}