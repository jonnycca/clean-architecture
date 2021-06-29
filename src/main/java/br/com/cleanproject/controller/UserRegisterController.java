package br.com.cleanproject.controller;

import br.com.cleanproject.model.request.UserRequestModel;
import br.com.cleanproject.model.response.UserResponseModel;
import br.com.cleanproject.usecase.UserInputBoundary;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegisterController {

    final UserInputBoundary userInput;

    public UserRegisterController(UserInputBoundary userInput) {
        this.userInput = userInput;
    }

    @PostMapping("/user")
    UserResponseModel create(@RequestBody UserRequestModel requestModel) {
        return userInput.create(requestModel);
    }
}
