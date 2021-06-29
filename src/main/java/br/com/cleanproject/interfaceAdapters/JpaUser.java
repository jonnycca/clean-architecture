package br.com.cleanproject.interfaceAdapters;

import br.com.cleanproject.gateway.UserRegisterDsGateway;
import br.com.cleanproject.mapper.UserDataMapper;
import br.com.cleanproject.model.request.UserDsRequestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public class JpaUser implements UserRegisterDsGateway {

    final JpaRepository repository;

    public JpaUser(JpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean existsByName(String name) {
        return repository.existsById(name);
    }

    @Override
    public void save(UserDsRequestModel requestModel) {
        UserDataMapper accountDataMapper = new UserDataMapper(requestModel.getName(), requestModel.getPassword(), requestModel.getCreationTime());
        repository.save(accountDataMapper);
    }
}
