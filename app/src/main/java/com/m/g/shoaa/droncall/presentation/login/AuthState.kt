package com.m.g.shoaa.droncall.presentation.login

import com.m.g.shoaa.droncall.domain.model.Auth

data class AuthState (
    val isLoading : Boolean = true,
    val auth: Auth? = null,
    val error : String? = null
)