package org.augustoren.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "org.augustoren")
@EnableJpaRepositories(basePackages = {"org.augustoren"})
@EntityScan("org.augustoren")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
