package org.augustoren.mapper;

import org.augustoren.entity.UserEntity;
import org.augustoren.model.response.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    UserResponse toModel(UserEntity user);
}
