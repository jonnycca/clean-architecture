package br.com.cleanproject.usecase;

import br.com.cleanproject.gateway.UserRegisterDsGateway;
import br.com.cleanproject.model.request.UserDsRequestModel;
import br.com.cleanproject.model.request.UserRequestModel;
import br.com.cleanproject.model.response.UserResponseModel;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;


public class UserRegisterInteractorTest {

    @Test
    public void givenBaeldungUserAnd12345Password_whenCreate_thenSaveItAndPrepareSuccessView(){

    }
}
