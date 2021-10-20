package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.subdomain.Subdomain;
import com.github.sankowskiwojciech.coursescorelib.model.subdomain.SubdomainType;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.ORGANIZATION_ALIAS_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.ORGANIZATION_DESCRIPTION_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.ORGANIZATION_EMAIL_ADDRESS_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.ORGANIZATION_NAME_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.ORGANIZATION_PHONE_NUMBER_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.ORGANIZATION_WEBSITE_URL_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SubdomainStub {

    public static Subdomain createWithSubdomainType(SubdomainType subdomainType) {
        return Subdomain.builder()
                .name(ORGANIZATION_NAME_STUB)
                .alias(ORGANIZATION_ALIAS_STUB)
                .description(ORGANIZATION_DESCRIPTION_STUB)
                .emailAddress(ORGANIZATION_EMAIL_ADDRESS_STUB)
                .phoneNumber(ORGANIZATION_PHONE_NUMBER_STUB)
                .websiteUrl(ORGANIZATION_WEBSITE_URL_STUB)
                .subdomainType(subdomainType)
                .build();
    }
}
