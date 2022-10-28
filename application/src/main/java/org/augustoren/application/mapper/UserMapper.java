package org.augustoren.application.mapper;

import org.augustoren.application.dto.request.UserRequestDto;
import org.augustoren.application.dto.response.UserResponseDto;
import org.augustoren.model.User;
import org.augustoren.model.response.UserResponse;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_DEFAULT,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    @Mapping(target = "createdAt", ignore = true)
    User toModel(UserRequestDto request);

    UserResponseDto toDto(UserResponse user);

}
