package org.augustoren.model.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Value
@Builder
public class UserResponse {
    UUID id;
    String name;
    String email;
    LocalDate createdAt;
}
