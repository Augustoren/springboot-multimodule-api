package org.augustoren.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorField {
    private String name;
    private String message;
    private String value;
}
