package br.com.cleanproject.gateway;

import br.com.cleanproject.model.request.UserDsRequestModel;

public interface UserRegisterDsGateway {

    boolean existsByName(String name);

    void save(UserDsRequestModel requestModel);
}
