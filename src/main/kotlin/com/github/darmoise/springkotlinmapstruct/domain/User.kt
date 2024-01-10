package com.github.darmoise.springkotlinmapstruct.domain

import java.util.*

data class User(
    val id: Long,
    var name: String,
    val createdAt: Date
)