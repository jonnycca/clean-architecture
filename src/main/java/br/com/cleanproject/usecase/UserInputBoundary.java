package br.com.cleanproject.usecase;

import br.com.cleanproject.model.request.UserRequestModel;
import br.com.cleanproject.model.response.UserResponseModel;

public interface UserInputBoundary {
    UserResponseModel create(UserRequestModel requestModel);
}
