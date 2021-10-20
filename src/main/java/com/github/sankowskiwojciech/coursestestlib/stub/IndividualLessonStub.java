package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.db.organization.OrganizationEntity;
import com.github.sankowskiwojciech.coursescorelib.model.db.student.StudentEntity;
import com.github.sankowskiwojciech.coursescorelib.model.db.tutor.TutorEntity;
import com.github.sankowskiwojciech.coursescorelib.model.individuallesson.IndividualLesson;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.*;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.FILES_IDS_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.LESSON_DESCRIPTION_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.LESSON_TITLE_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IndividualLessonStub {

    public static IndividualLesson createWithExternalEntities(OrganizationEntity organizationEntity, TutorEntity tutorEntity, StudentEntity studentEntity) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        return new IndividualLesson(LESSON_TITLE_STUB, currentDateTime.plusHours(1), currentDateTime.plusHours(3), LESSON_DESCRIPTION_STUB, organizationEntity, tutorEntity, FILES_IDS_STUB, studentEntity);
    }
}
