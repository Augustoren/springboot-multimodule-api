package org.augustoren.testdata;

import org.augustoren.model.User;

public class UserTestData {

    public static User validUserRequest() {
        return User.builder()
                .name("Augusto")
                .email("augusto@email.com")
                .build();
    }

    public static User invalidUserRequest() {
        return User.builder().build();
    }

}
