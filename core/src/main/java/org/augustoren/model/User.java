package org.augustoren.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {
    String name;
    String email;
    LocalDate createdAt;
}
