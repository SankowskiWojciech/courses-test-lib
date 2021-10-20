package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.account.AccountType;
import com.github.sankowskiwojciech.coursescorelib.model.db.login.LoginCredentialsEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.PASSWORD_HASH_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.TUTOR_EMAIL_ADDRESS_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginCredentialsEntityStub {
    public static LoginCredentialsEntity create() {
        return new LoginCredentialsEntity(TUTOR_EMAIL_ADDRESS_STUB, PASSWORD_HASH_STUB, AccountType.TUTOR);
    }
}
