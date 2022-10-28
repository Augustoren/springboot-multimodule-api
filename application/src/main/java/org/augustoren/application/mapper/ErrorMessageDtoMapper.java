package org.augustoren.application.mapper;

import org.augustoren.application.dto.ErrorMessageDto;
import org.augustoren.exception.ErrorMessage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ErrorMessageDtoMapper {
    ErrorMessageDto toDto(ErrorMessage message);
}
