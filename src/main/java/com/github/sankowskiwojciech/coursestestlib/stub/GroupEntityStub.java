package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.db.group.GroupEntity;
import com.github.sankowskiwojciech.coursescorelib.model.db.subdomain.SubdomainEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.GROUP_DESCRIPTION_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.GROUP_ID_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.GROUP_NAME_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GroupEntityStub {
    public static GroupEntity create() {
        return GroupEntity.builder()
                .id(GROUP_ID_STUB)
                .name(GROUP_NAME_STUB)
                .description(GROUP_DESCRIPTION_STUB)
                .creationDateTime(LocalDateTime.now().minusMonths(1))
                .subdomainEntity(SubdomainEntityStub.create())
                .tutorEntity(TutorEntityStub.create())
                .build();
    }

    public static GroupEntity createWithSubdomain(SubdomainEntity subdomain) {
        return GroupEntity.builder()
                .id(GROUP_ID_STUB)
                .name(GROUP_NAME_STUB)
                .description(GROUP_DESCRIPTION_STUB)
                .creationDateTime(LocalDateTime.now().minusMonths(1))
                .subdomainEntity(subdomain)
                .tutorEntity(TutorEntityStub.create())
                .build();
    }
}
