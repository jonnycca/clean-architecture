package br.com.cleanproject.entities;

public interface User {
    boolean passwordIsValid();

    String getName();

    String getPassword();
}
