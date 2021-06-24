package br.com.cleanproject.common;

import br.com.cleanproject.entities.User;
import br.com.cleanproject.entities.UserFactory;

public class CommonUserFactory implements UserFactory {

    @Override
    public User create(String name, String password) {
        return new CommunUser(name, password);
    }
}
