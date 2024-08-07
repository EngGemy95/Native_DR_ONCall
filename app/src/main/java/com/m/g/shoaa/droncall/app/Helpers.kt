package com.m.g.shoaa.droncall.app

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Helpers {
    inline fun <reified T> Gson.fromJson(json: String): T = this.fromJson(json, object : TypeToken<T>() {}.type)
}