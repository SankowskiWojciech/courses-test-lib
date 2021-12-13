package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.grouplesson.request.GroupLessonsScheduleRequest;
import com.github.sankowskiwojciech.coursescorelib.model.lesson.DayOfWeekWithTimes;
import com.github.sankowskiwojciech.coursescorelib.model.lesson.ScheduleType;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.GROUP_ID_STUB;
import static com.github.sankowskiwojciech.coursestestlib.DefaultTestValues.ORGANIZATION_EMAIL_ADDRESS_STUB;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GroupLessonsScheduleRequestStub {

    public static GroupLessonsScheduleRequest createWithLessonsDaysOfWeekWithTimes(List<DayOfWeekWithTimes> lessonsDaysOfWeekWithTimes) {
        return new GroupLessonsScheduleRequest(LocalDate.now(), null, ScheduleType.ONE_YEAR_LENGTH_LESSONS, null, lessonsDaysOfWeekWithTimes, null, ORGANIZATION_EMAIL_ADDRESS_STUB, GROUP_ID_STUB);
    }

    public static GroupLessonsScheduleRequest createWithScheduleTypeFixedDurationLessons(Long allLessonsDurationInMinutes) {
        final DayOfWeekWithTimes dayOfWeekWithTimes = DayOfWeekWithTimesStub.createValid();
        final List<DayOfWeekWithTimes> lessonsDaysOfWeekWithTimes = Arrays.asList(dayOfWeekWithTimes);
        return new GroupLessonsScheduleRequest(LocalDate.now(), null, ScheduleType.FIXED_DURATION_LESSONS, allLessonsDurationInMinutes, lessonsDaysOfWeekWithTimes, null, ORGANIZATION_EMAIL_ADDRESS_STUB, GROUP_ID_STUB);
    }

    public static GroupLessonsScheduleRequest createWithGroupId(String groupId) {
        return new GroupLessonsScheduleRequest(LocalDate.now(), null, ScheduleType.ONE_YEAR_LENGTH_LESSONS, null, Arrays.asList(DayOfWeekWithTimesStub.createValid()), null, ORGANIZATION_EMAIL_ADDRESS_STUB, groupId);
    }

    public static GroupLessonsScheduleRequest createWithScheduleTypeFixedDatesLessons(LocalDate beginningDate, LocalDate endDate) {
        final DayOfWeekWithTimes dayOfWeekWithTimes = DayOfWeekWithTimesStub.createValid();
        final List<DayOfWeekWithTimes> lessonsDaysOfWeekWithTimes = Arrays.asList(dayOfWeekWithTimes);
        return new GroupLessonsScheduleRequest(beginningDate, endDate, ScheduleType.FIXED_DATES_LESSONS, null, lessonsDaysOfWeekWithTimes, null, ORGANIZATION_EMAIL_ADDRESS_STUB, GROUP_ID_STUB);
    }
}