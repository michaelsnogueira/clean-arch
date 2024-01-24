package br.com.nogueira.cleanarch.infrastructure.gateways;

import br.com.nogueira.cleanarch.application.gateways.UserGateway;
import br.com.nogueira.cleanarch.domain.entity.User;
import br.com.nogueira.cleanarch.infrastructure.persistence.UserEntity;
import br.com.nogueira.cleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;
    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = userRepository.save(userEntityMapper.mapToEntity(user));
        return userEntityMapper.mapToDomain(userEntity);
    }
}
