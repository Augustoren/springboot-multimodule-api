package org.augustoren.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "user_entity")
public class UserEntity {
    private static final long serialVersionUID = 1L;

    @Id
    UUID id;
    String name;
    String email;
    String createdAt;

}
