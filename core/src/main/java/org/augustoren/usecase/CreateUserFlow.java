package org.augustoren.usecase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.augustoren.model.User;
import org.augustoren.model.response.UserResponse;
import org.augustoren.port.command.CreateUserCommand;
import org.augustoren.port.operation.PersistenceUserOperation;
import org.augustoren.usecase.validation.UserValidator;

@RequiredArgsConstructor
public class CreateUserFlow implements CreateUserCommand {

    private final PersistenceUserOperation saveUser;
    private final UserValidator validator;

    @Override
    public UserResponse createUser(User user) {

        validator.validateUserRequest(user);
        return saveUser.saveUser(user);
    }
}
