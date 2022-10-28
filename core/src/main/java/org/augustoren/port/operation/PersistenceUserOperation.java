package org.augustoren.port.operation;

import org.augustoren.model.User;
import org.augustoren.model.response.UserResponse;

public interface PersistenceUserOperation {

    UserResponse saveUser(User user);

}
