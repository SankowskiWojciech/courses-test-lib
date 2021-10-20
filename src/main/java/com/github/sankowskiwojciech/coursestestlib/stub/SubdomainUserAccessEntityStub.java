package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.db.subdomain.SubdomainUserAccessEntity;
import com.github.sankowskiwojciech.coursescorelib.model.db.subdomain.SubdomainUserAccessEntityId;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SubdomainUserAccessEntityStub {

    public static SubdomainUserAccessEntity create(String subdomainEmailAddress, String userEmailAddress) {
        return new SubdomainUserAccessEntity(new SubdomainUserAccessEntityId(subdomainEmailAddress, userEmailAddress), null);
    }
}
