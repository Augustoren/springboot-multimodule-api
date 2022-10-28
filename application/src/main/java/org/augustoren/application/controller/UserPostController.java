package org.augustoren.application.controller;

import lombok.RequiredArgsConstructor;
import org.augustoren.application.dto.request.UserRequestDto;
import org.augustoren.application.dto.response.UserResponseDto;
import org.augustoren.application.mapper.UserMapper;
import org.augustoren.port.command.CreateUserCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
public class UserPostController {

    private final UserMapper mapper;
    private final CreateUserCommand useCase;

    @PostMapping("/user")
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserRequestDto userRequestDto, HttpServletRequest header) {

        var user = mapper.toModel(userRequestDto);
        var createdUser = useCase.createUser(user);
        var userResponse = mapper.toDto(createdUser);

        return ResponseEntity.ok(userResponse);

    }

}
