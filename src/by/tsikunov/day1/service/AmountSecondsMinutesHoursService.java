package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import by.tsikunov.day1.validator.DateValidator;

import java.time.LocalTime;

public class AmountSecondsMinutesHoursService {
    private final int MINUTE_SECONDS = 60;
    private final int HOUR_SECOND = 3600;
    public LocalTime calculateDayClock(int secondsOfDay)
            throws ProjectIllegalDataException {
        DateValidator validator = new DateValidator();
        if(!validator.isValidAmountOfSeconds(secondsOfDay)) {
            throw new ProjectIllegalDataException("Illegal amount of seconds");
        }

        int hours = secondsOfDay / HOUR_SECOND;
        int balanceSec = secondsOfDay % HOUR_SECOND;
        int minutes = balanceSec / MINUTE_SECONDS;
        int seconds = secondsOfDay % MINUTE_SECONDS;

        return LocalTime.of(hours, minutes, seconds);
    }
}
