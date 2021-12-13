package com.github.sankowskiwojciech.coursestestlib.stub;

import com.github.sankowskiwojciech.coursescorelib.model.grouplesson.GroupLessonsSchedule;
import com.github.sankowskiwojciech.coursescorelib.model.lesson.DayOfWeekWithTimes;
import com.github.sankowskiwojciech.coursescorelib.model.lesson.ScheduleType;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GroupLessonsScheduleStub {

    private static final long ALL_LESSONS_DURATION_IN_MINUTES_STUB = 240;

    public static GroupLessonsSchedule createWithLessonsTitles(List<String> lessonsTitles) {
        return new GroupLessonsSchedule(LocalDate.now(), null, ScheduleType.FIXED_DATES_LESSONS, null, createDayOfWeekWithTimes(), lessonsTitles, SubdomainEntityStub.create(), TutorEntityStub.create(), GroupEntityStub.create());
    }

    public static GroupLessonsSchedule createWithScheduleType(ScheduleType scheduleType) {
        switch (scheduleType) {
            case ONE_YEAR_LENGTH_LESSONS:
                return createForScheduleTypeOneYearLengthLessons();
            case FIXED_DATES_LESSONS:
                return createForScheduleTypeFixedDatesLessons();
            default:
                return createForScheduleTypeFixedDurationLessons();
        }
    }

    private static GroupLessonsSchedule createForScheduleTypeOneYearLengthLessons() {
        return new GroupLessonsSchedule(LocalDate.now(), null, ScheduleType.ONE_YEAR_LENGTH_LESSONS, null, createDayOfWeekWithTimes(), null, SubdomainEntityStub.create(), TutorEntityStub.create(), GroupEntityStub.create());
    }

    private static GroupLessonsSchedule createForScheduleTypeFixedDatesLessons() {
        final LocalDate currentDate = LocalDate.now();
        return new GroupLessonsSchedule(currentDate, currentDate.plusMonths(3), ScheduleType.FIXED_DATES_LESSONS, null, createDayOfWeekWithTimes(), null, SubdomainEntityStub.create(), TutorEntityStub.create(), GroupEntityStub.create());
    }

    private static GroupLessonsSchedule createForScheduleTypeFixedDurationLessons() {
        return new GroupLessonsSchedule(LocalDate.now(), null, ScheduleType.FIXED_DURATION_LESSONS, ALL_LESSONS_DURATION_IN_MINUTES_STUB, createDayOfWeekWithTimes(), null, SubdomainEntityStub.create(), TutorEntityStub.create(), GroupEntityStub.create());
    }

    private static List<DayOfWeekWithTimes> createDayOfWeekWithTimes() {
        final DayOfWeekWithTimes dayOfWeekWithTimes = DayOfWeekWithTimesStub.createValid();
        return Arrays.asList(dayOfWeekWithTimes);
    }
}
