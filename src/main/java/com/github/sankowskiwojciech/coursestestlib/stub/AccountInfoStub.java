package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.account.AccountInfo;
import com.github.sankowskiwojciech.coursescorelib.model.account.AccountType;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.TUTOR_EMAIL_ADDRESS_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AccountInfoStub {

    public static AccountInfo create() {
        return new AccountInfo(TUTOR_EMAIL_ADDRESS_STUB, AccountType.TUTOR);
    }
}
