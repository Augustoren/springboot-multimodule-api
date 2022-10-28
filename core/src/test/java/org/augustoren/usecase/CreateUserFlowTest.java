package org.augustoren.usecase;

import org.augustoren.port.operation.PersistenceUserOperation;
import org.augustoren.testdata.UserResponseTestData;
import org.augustoren.testdata.UserTestData;
import org.augustoren.usecase.validation.UserValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;

class CreateUserFlowTest {

    private final PersistenceUserOperation repository = Mockito.mock(PersistenceUserOperation.class);
    private final UserValidator validator = new UserValidator();
    private final CreateUserFlow useCase = new CreateUserFlow(repository, validator);

    @Test
    void CreateUserSuccessfully() {
        var userRequest = UserTestData.validUserRequest();
        BDDMockito.given(repository.saveUser(any())).willReturn(UserResponseTestData.userResponse());

        var response = useCase.createUser(userRequest);

        Assertions.assertEquals(response.getName(), userRequest.getName());
    }

    @Test
    void CreateUserValidationError() {
        var userRequest = UserTestData.validUserRequest();
        BDDMockito.given(repository.saveUser(any())).willReturn(UserResponseTestData.userResponse());

        var response = useCase.createUser(userRequest);

        Assertions.assertEquals(response.getName(), userRequest.getName());
    }

}