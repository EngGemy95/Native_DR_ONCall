package com.m.g.shoaa.droncall.domain.model

import kotlinx.serialization.Serializable


@Serializable
data class User(
    val name : String?,
    val email : String?,
    val type : String?
)