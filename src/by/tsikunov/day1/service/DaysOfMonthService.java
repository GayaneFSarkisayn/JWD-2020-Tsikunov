package by.tsikunov.day1.service;

import by.tsikunov.day1.enumerator.Month;
import by.tsikunov.day1.exception.ProjectIllegalDataException;
import by.tsikunov.day1.validator.DateValidator;

public class DaysOfMonthService {

    private static final int MODIFIER_FOR_LEAP_YEAR = 1;

    public int daysCounter(int month, int year) throws ProjectIllegalDataException {

        DateValidator validator = new DateValidator();
        if(!validator.isValidDate(month, year)) {
            throw new ProjectIllegalDataException("Invalid data");
        }
        Month[] months = Month.values();
        int days;
        if(!isLeap(year)) {
            days = months[month - 1].getDays();
        } else {
            days = months[month - 1].getDays() + MODIFIER_FOR_LEAP_YEAR;
        }
        return days;
    }

    private boolean isLeap(int year) {
        return (year % 400 == 0) ||
                ((year % 4 == 0) && (year % 100 != 0));
    }
}
