package org.augustoren.application.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

@AllArgsConstructor
@Value
public class MessageDto {
    List<ErrorMessageDto> messages;
}
