package org.augustoren.operation;

import lombok.RequiredArgsConstructor;
import org.augustoren.entity.UserEntity;
import org.augustoren.mapper.UserEntityMapper;
import org.augustoren.model.User;
import org.augustoren.model.response.UserResponse;
import org.augustoren.port.operation.PersistenceUserOperation;
import org.augustoren.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class SaveUser implements PersistenceUserOperation {

    private final UserEntityMapper mapper;
    private final UserRepository repository;

    @Override
    public UserResponse saveUser(User user) {

        var userEntity = buildUserEntity(user);
        var savedUser = repository.save(userEntity);
        return mapper.toModel(savedUser);

    }

    private UserEntity buildUserEntity(User user) {
        return UserEntity.builder()
                .id(UUID.randomUUID())
                .name(user.getName())
                .email(user.getEmail())
                .createdAt(LocalDate.now().toString())
                .build();
    }
}
