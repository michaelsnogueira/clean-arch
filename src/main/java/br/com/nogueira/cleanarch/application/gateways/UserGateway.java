package br.com.nogueira.cleanarch.application.gateways;

import br.com.nogueira.cleanarch.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
