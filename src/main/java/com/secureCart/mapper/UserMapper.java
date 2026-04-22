package com.secureCart.mapper;

import org.mapstruct.Mapper;

import com.secureCart.dto.UserDTO;
import com.secureCart.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDTO dto);

    UserDTO toDTO(User user);

}