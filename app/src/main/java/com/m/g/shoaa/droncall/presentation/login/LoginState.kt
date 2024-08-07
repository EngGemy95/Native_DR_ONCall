package com.m.g.shoaa.droncall.presentation.login

sealed class LoginState {
    val isLoading : Boolean = true
    val error : String? = null
}