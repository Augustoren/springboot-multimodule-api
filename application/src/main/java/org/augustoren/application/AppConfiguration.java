package org.augustoren.application;

import org.augustoren.port.operation.PersistenceUserOperation;
import org.augustoren.usecase.CreateUserFlow;
import org.augustoren.usecase.validation.UserValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.augustoren")
public class AppConfiguration {

    @Bean
    CreateUserFlow createUserFlow(PersistenceUserOperation persistenceUserOperation, UserValidator validator) {
        return new CreateUserFlow(persistenceUserOperation, validator);
    }

    @Bean
    UserValidator userValidator() {
        return new UserValidator();
    }

}
