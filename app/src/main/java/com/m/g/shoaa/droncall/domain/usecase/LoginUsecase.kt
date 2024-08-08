package com.m.g.shoaa.droncall.domain.usecase

import com.m.g.shoaa.droncall.domain.model.Auth
import com.m.g.shoaa.droncall.domain.repository.AuthRepository
import javax.inject.Inject

class LoginUsecase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend fun login(username : String , password : String) : Auth {
        return authRepository.login(username,password)
    }
}