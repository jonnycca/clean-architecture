package br.com.cleanproject;

import br.com.cleanproject.common.CommunUser;
import br.com.cleanproject.entities.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class UserUnitTest {

    @Test
    void given123Password_whenPasswordIsNotValid_thenIsFalse(){
        User user = new CommunUser("User", "123");

        assertThat(user.passwordIsValid()).isFalse();
    }

    @Test
    void givenPasswordLength6_whenPasswordIsValid_thenIsTrue(){
        User user = new CommunUser("User", "123456");

        assertThat(user.passwordIsValid()).isTrue();
    }
}
