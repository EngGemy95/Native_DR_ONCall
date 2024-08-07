package com.m.g.shoaa.droncall.domain.usecase

import com.m.g.shoaa.droncall.data.remote.dto.LoginResponse
import com.m.g.shoaa.droncall.domain.repository.AuthRepository
import javax.inject.Inject

class AuthUsecase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend fun login(username : String , password : String) : LoginResponse{

    }
}