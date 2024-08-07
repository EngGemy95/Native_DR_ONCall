package com.m.g.shoaa.droncall.data.RepositoryImpl

import com.m.g.shoaa.droncall.data.remote.auth.AuthApi
import com.m.g.shoaa.droncall.data.remote.auth.LoginRequest
import com.m.g.shoaa.droncall.data.remote.dto.LoginResponse
import com.m.g.shoaa.droncall.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authApi: AuthApi
) : AuthRepository {

    override suspend fun login(username: String, password: String): LoginResponse {
        val response = authApi.login(LoginRequest(username,password))
        return LoginResponse(response.status,response.message,null)
    }
}