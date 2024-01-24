package br.com.nogueira.cleanarch.config;

import br.com.nogueira.cleanarch.application.gateways.UserGateway;
import br.com.nogueira.cleanarch.application.usecases.CreateUserInteractor;
import br.com.nogueira.cleanarch.infrastructure.controllers.UserDtoMapper;
import br.com.nogueira.cleanarch.infrastructure.gateways.UserEntityMapper;
import br.com.nogueira.cleanarch.infrastructure.gateways.UserRepositoryGateway;
import br.com.nogueira.cleanarch.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway createUserGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper createUserEntityMapper() {
        return new UserEntityMapper();
    }
    @Bean
    UserDtoMapper createUserDtoMapper() {
        return new UserDtoMapper();
    }
}
