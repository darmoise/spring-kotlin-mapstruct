package com.github.darmoise.springkotlinmapstruct.controller

import com.github.darmoise.springkotlinmapstruct.domain.User
import com.github.darmoise.springkotlinmapstruct.dto.UserDto
import com.github.darmoise.springkotlinmapstruct.mapper.UserMapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/api/v1/mapstruct")
class Controller(
    private val userMapper: UserMapper
) {

    @GetMapping("users")
    fun sentToQueueAThroughDefaultExchange(): UserDto {
        val user = User(
            id = 1,
            name = "user",
            createdAt = Date()
        )

        return userMapper.toDto(user)
    }
}