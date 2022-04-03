package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.db.group.StudentGroupAccessEntity;
import com.github.sankowskiwojciech.coursescorelib.model.db.group.StudentGroupAccessEntityId;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.GROUP_ID_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.USER_ID_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StudentGroupAccessEntityStub {
    public static StudentGroupAccessEntity create() {
        return new StudentGroupAccessEntity(new StudentGroupAccessEntityId(USER_ID_STUB, GROUP_ID_STUB), StudentEntityStub.create(), GroupEntityStub.create());
    }
}
