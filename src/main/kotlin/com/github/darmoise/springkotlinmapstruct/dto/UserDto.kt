package com.github.darmoise.springkotlinmapstruct.dto

import java.util.*

data class UserDto(
    val id: Long,
    var name: String,
    val createdAt: Date
)