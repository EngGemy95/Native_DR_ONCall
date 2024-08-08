package com.m.g.shoaa.droncall.presentation.login

sealed class AuthIntent {
    data class login(val username : String, val password : String) : AuthIntent()
}