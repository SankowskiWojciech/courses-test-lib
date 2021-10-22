package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.individuallesson.request.IndividualLessonRequest;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.FILES_IDS_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.LESSON_DESCRIPTION_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.LESSON_TITLE_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.STUDENT_EMAIL_ADDRESS_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.SUBDOMAIN_ALIAS_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IndividualLessonRequestStub {
    public static IndividualLessonRequest createWithDatesOfLesson(LocalDateTime startDateOfLesson, LocalDateTime endDateOfLesson) {
        return new IndividualLessonRequest(LESSON_TITLE_STUB, startDateOfLesson, endDateOfLesson, LESSON_DESCRIPTION_STUB, SUBDOMAIN_ALIAS_STUB, null, STUDENT_EMAIL_ADDRESS_STUB);
    }

    public static IndividualLessonRequest createWithTitle(String title) {
        final LocalDateTime currentDateTime = LocalDateTime.now();
        return new IndividualLessonRequest(title, currentDateTime, currentDateTime.plusHours(2), LESSON_DESCRIPTION_STUB, SUBDOMAIN_ALIAS_STUB, null, STUDENT_EMAIL_ADDRESS_STUB);
    }

    public static IndividualLessonRequest create() {
        final LocalDateTime currentDateTime = LocalDateTime.now();
        return new IndividualLessonRequest(LESSON_TITLE_STUB, currentDateTime, currentDateTime.plusHours(2), LESSON_DESCRIPTION_STUB, SUBDOMAIN_ALIAS_STUB, FILES_IDS_STUB, STUDENT_EMAIL_ADDRESS_STUB);
    }
}
