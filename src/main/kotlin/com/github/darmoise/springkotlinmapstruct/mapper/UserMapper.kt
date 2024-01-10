package com.github.darmoise.springkotlinmapstruct.mapper

import com.github.darmoise.springkotlinmapstruct.domain.User
import com.github.darmoise.springkotlinmapstruct.dto.UserDto
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface UserMapper {
    fun toDto(user: User): UserDto
    fun toBean(userDto: UserDto): User
}
