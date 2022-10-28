package org.augustoren.port.command;

import org.augustoren.model.User;
import org.augustoren.model.response.UserResponse;

public interface CreateUserCommand {

    UserResponse createUser(User user);

}
