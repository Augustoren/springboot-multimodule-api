package org.augustoren.testdata;

import org.augustoren.model.response.UserResponse;

import java.time.LocalDate;
import java.util.UUID;

public class UserResponseTestData {

    public static UserResponse userResponse() {
        return UserResponse.builder()
                .id(UUID.randomUUID())
                .name("Augusto")
                .email("augusto@email.com")
                .createdAt(LocalDate.now())
                .build();
    }

}
