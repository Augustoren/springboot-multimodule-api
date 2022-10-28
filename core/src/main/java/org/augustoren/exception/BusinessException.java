package org.augustoren.exception;

import java.util.List;

public class BusinessException extends RuntimeException {
    private final ErrorMessage errorMessage;

    public BusinessException(String code, String message, List<ErrorField> fields) {
        super();
        errorMessage = new ErrorMessage(code, message, fields);
    }

    public ErrorMessage getError() {
        return errorMessage;
    }
}
