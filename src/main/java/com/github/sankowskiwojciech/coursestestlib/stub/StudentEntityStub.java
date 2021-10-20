package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.db.student.StudentEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.STUDENT_EMAIL_ADDRESS_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.STUDENT_FIRST_NAME_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.STUDENT_LAST_NAME_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StudentEntityStub {

    public static StudentEntity create() {
        return StudentEntity.builder()
                .emailAddress(STUDENT_EMAIL_ADDRESS_STUB)
                .firstName(STUDENT_FIRST_NAME_STUB)
                .lastName(STUDENT_LAST_NAME_STUB)
                .build();
    }

    public static StudentEntity createWithEmailAddress(String studentEmailAddress) {
        return StudentEntity.builder()
                .emailAddress(studentEmailAddress)
                .firstName(STUDENT_FIRST_NAME_STUB)
                .lastName(STUDENT_LAST_NAME_STUB)
                .build();
    }
}
