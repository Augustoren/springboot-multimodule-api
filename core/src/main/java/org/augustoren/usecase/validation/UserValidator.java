package org.augustoren.usecase.validation;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.augustoren.exception.ErrorField;
import org.augustoren.exception.ValidationException;
import org.augustoren.model.User;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class UserValidator {

    public void validateUserRequest(User user) {
        List<ErrorField> errors = new ArrayList<>();

        validateUserRequestFields(user, errors);

        if (!errors.isEmpty()) {
            throw new ValidationException("001", "Fields validation error", errors);
        }
    }

    private void validateUserRequestFields(User user, List<ErrorField> errors) {
        if (StringUtils.isBlank(user.getName())) {
            errors.add(new ErrorField("name", "name must be provided.", user.getName()));
        }

        if (StringUtils.isBlank(user.getEmail())) {
            errors.add(new ErrorField("email", "email must be provided.", user.getEmail()));
        }
    }

}
