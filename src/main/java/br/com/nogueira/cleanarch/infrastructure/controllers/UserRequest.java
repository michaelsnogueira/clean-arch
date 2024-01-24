package br.com.nogueira.cleanarch.infrastructure.controllers;

public record UserRequest(String name, String email, String password) {
}
