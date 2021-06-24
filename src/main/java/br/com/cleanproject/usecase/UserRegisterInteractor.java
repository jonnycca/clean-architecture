package br.com.cleanproject.usecase;

import br.com.cleanproject.entities.User;
import br.com.cleanproject.entities.UserFactory;
import br.com.cleanproject.gateway.UserRegisterDsGateway;
import br.com.cleanproject.model.request.UserDsRequestModel;
import br.com.cleanproject.model.request.UserRequestModel;
import br.com.cleanproject.model.response.UserResponseModel;
import br.com.cleanproject.presenter.UserPresenter;

import java.time.LocalDateTime;

public class UserRegisterInteractor implements  UserInputBoundary{

    final UserRegisterDsGateway userRegisterDsGateway;
    final UserPresenter userPresenter;
    final UserFactory userFactory;

    public UserRegisterInteractor(UserRegisterDsGateway userRegisterDsGateway, UserPresenter userPresenter, UserFactory userFactory) {
        this.userRegisterDsGateway = userRegisterDsGateway;
        this.userPresenter = userPresenter;
        this.userFactory = userFactory;
    }

    @Override
    public UserResponseModel create(UserRequestModel requestModel) {
        if(userRegisterDsGateway.existsByName(requestModel.getName())){
            return userPresenter.prepareFailView("User already exists.");
        }

        User user = userFactory.create(requestModel.getName(), requestModel.getPassword());
        if(!user.passwordIsValid()){
            return userPresenter.prepareFailView("User password must have more than 5 characters.");
        }

        LocalDateTime now = LocalDateTime.now();
        UserDsRequestModel userDsRequestModel = new UserDsRequestModel(user.getName(), user.getPassword(), now);

        userRegisterDsGateway.save(userDsRequestModel);

        UserResponseModel accountResponseModel = new UserResponseModel(user.getName(), now.toString());
        return userPresenter.prepareSuccessView(accountResponseModel);
    }
}
