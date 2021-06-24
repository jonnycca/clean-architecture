package br.com.cleanproject.entities;

public interface UserFactory {

    User create(String name, String password);
}
