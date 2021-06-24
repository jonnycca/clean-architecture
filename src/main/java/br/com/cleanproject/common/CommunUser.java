package br.com.cleanproject.common;

import br.com.cleanproject.entities.User;

public class CommunUser implements User {

    String name;
    String password;

    CommunUser(){

    }

    public CommunUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean passwordIsValid() {
        return password != null && password.length() > 5;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}
