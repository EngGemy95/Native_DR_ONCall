package com.m.g.shoaa.droncall.app

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.m.g.shoaa.droncall.domain.model.Auth

class Helpers {

    inline fun <reified T> convertApiToModel(json: String): T {
        val gson = Gson()
        return gson.fromJson(json, object : TypeToken<T>() {}.type)
    }

}