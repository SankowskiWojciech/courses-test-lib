package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.login.LoginCredentials;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.PASSWORD_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.TUTOR_EMAIL_ADDRESS_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginCredentialsStub {
    public static LoginCredentials createWithAddressEmailAndPassword(String emailAddress, String password) {
        return new LoginCredentials(emailAddress, password);
    }

    public static LoginCredentials create() {
        return new LoginCredentials(TUTOR_EMAIL_ADDRESS_STUB, PASSWORD_STUB);
    }

    public static LoginCredentials createEmpty() {
        return new LoginCredentials(null, null);
    }
}
