package com.m.g.shoaa.droncall.data.remote.dto

import com.google.gson.Gson

data class LoginResponse(
    val status : Int,
    val message : String,
    val data : String?
) {
    fun toJson(): String {
        val gson = Gson()
        return gson.toJson(this)
    }
}
