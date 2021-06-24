package br.com.cleanproject.presenter;

import br.com.cleanproject.model.response.UserResponseModel;

public interface UserPresenter {

    UserResponseModel prepareSuccessView(UserResponseModel user);

    UserResponseModel prepareFailView(String error);
}
