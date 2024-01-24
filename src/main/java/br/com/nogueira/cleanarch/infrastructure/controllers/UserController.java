package br.com.nogueira.cleanarch.infrastructure.controllers;

import br.com.nogueira.cleanarch.application.usecases.CreateUserInteractor;
import br.com.nogueira.cleanarch.domain.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserInteractor createUserInteractor;
    private final UserDtoMapper userDtoMapper;

    public UserController(CreateUserInteractor createUserInteractor, UserDtoMapper userDtoMapper) {
        this.createUserInteractor = createUserInteractor;
        this.userDtoMapper = userDtoMapper;
    }
    @PostMapping
    public UserResponse create(@RequestBody UserRequest userRequest) {
        User user = createUserInteractor.createUser(userDtoMapper.mapToDomain(userRequest));
        return userDtoMapper.mapToResponse(user);

    }
}
