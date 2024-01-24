package br.com.nogueira.cleanarch.infrastructure.controllers;

import br.com.nogueira.cleanarch.domain.entity.User;

public class UserDtoMapper {
    public User mapToDomain(UserRequest userRequest) {
        return new User(userRequest.name(), userRequest.email(), userRequest.password());
    }
    public UserResponse mapToResponse(User user) {
        return new UserResponse(user.name(), user.email());
    }
}
