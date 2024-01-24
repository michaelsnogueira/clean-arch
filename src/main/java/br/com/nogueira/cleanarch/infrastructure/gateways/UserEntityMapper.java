package br.com.nogueira.cleanarch.infrastructure.gateways;

import br.com.nogueira.cleanarch.domain.entity.User;
import br.com.nogueira.cleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    public UserEntity mapToEntity(User user) {
        return new UserEntity(user.name(), user.email(), user.password());
    }

    public User mapToDomain(UserEntity userEntity) {
        return new User(userEntity.getName(), userEntity.getEmail(), userEntity.getPassword());
    }
}
