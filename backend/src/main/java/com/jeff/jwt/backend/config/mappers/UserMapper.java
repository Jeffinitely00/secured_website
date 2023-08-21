package com.jeff.jwt.backend.config.mappers;

import com.jeff.jwt.backend.dtos.SignUpDto;
import com.jeff.jwt.backend.dtos.UserDto;
import com.jeff.jwt.backend.config.entites.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}