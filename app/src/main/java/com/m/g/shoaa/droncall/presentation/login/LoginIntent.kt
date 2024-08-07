package com.m.g.shoaa.droncall.presentation.login

sealed class LoginIntent {
    data class login(val username : String , val password : String) : LoginIntent()
}