package org.augustoren.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.augustoren.exception.ErrorField;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorMessageDto {
    private String code;
    private String message;
    private List<ErrorField> fields;
}
