package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.db.individuallesson.IndividualLessonEntity;
import com.github.sankowskiwojciech.coursescorelib.model.db.organization.OrganizationEntity;
import com.github.sankowskiwojciech.coursescorelib.model.db.student.StudentEntity;
import com.github.sankowskiwojciech.coursescorelib.model.db.tutor.TutorEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.INDIVIDUAL_LESSON_ID_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.LESSON_DESCRIPTION_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.LESSON_TITLE_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IndividualLessonEntityStub {

    public static IndividualLessonEntity createWithExternalEntities(OrganizationEntity organizationEntity, TutorEntity tutorEntity, StudentEntity studentEntity) {
        final IndividualLessonEntity entity = create(INDIVIDUAL_LESSON_ID_STUB);
        entity.setOrganizationEntity(organizationEntity);
        entity.setTutorEntity(tutorEntity);
        entity.setStudentEntity(studentEntity);
        return entity;
    }

    public static IndividualLessonEntity createWithDatesOfLesson(LocalDateTime startDateOfLesson, LocalDateTime endDateOfLesson) {
        final IndividualLessonEntity entity = create(INDIVIDUAL_LESSON_ID_STUB);
        entity.setStartDate(startDateOfLesson);
        entity.setEndDate(endDateOfLesson);
        return entity;
    }

    public static IndividualLessonEntity create(String lessonId) {
        final LocalDateTime currentDateTime = LocalDateTime.now();
        IndividualLessonEntity entity = new IndividualLessonEntity();
        entity.setId(lessonId);
        entity.setTitle(LESSON_TITLE_STUB);
        entity.setStartDate(LocalDateTime.now());
        entity.setEndDate(LocalDateTime.now().plusHours(2));
        entity.setDescription(LESSON_DESCRIPTION_STUB);
        entity.setOrganizationEntity(OrganizationEntityStub.create());
        entity.setTutorEntity(TutorEntityStub.create());
        entity.setStudentEntity(StudentEntityStub.create());
        entity.setCreationDateTime(currentDateTime.minusMonths(2));
        return entity;
    }
}
