package org.augustoren.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class ErrorMessage {

    private String code;
    private String message;
    private List<ErrorField> fields;
}
