package br.com.nogueira.cleanarch.application.usecases;

import br.com.nogueira.cleanarch.application.gateways.UserGateway;
import br.com.nogueira.cleanarch.domain.entity.User;

public class CreateUserInteractor {

    private final UserGateway userGateway;
    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
