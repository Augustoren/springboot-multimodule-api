package org.augustoren.application.exception;

import lombok.RequiredArgsConstructor;
import org.augustoren.application.dto.MessageDto;
import org.augustoren.application.mapper.ErrorMessageDtoMapper;
import org.augustoren.exception.BusinessException;
import org.augustoren.exception.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@ControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

    private final ErrorMessageDtoMapper mapper;

    @ExceptionHandler
    public ResponseEntity<MessageDto> handleBusinessException(BusinessException exception, WebRequest request) {
        final var error = mapper.toDto(exception.getError());
        final var messages = new MessageDto(List.of(error));
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(messages);
    }

    @ExceptionHandler
    public ResponseEntity<MessageDto> handleValidationException(ValidationException exception, WebRequest request) {
        final var error = mapper.toDto(exception.getError());
        final var messages = new MessageDto(List.of(error));
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(messages);
    }

}
