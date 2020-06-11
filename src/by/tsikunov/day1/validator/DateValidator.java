package by.tsikunov.day1.validator;

public class DateValidator {
    private static final int MIN_MONTH = 1;
    private static final int MAX_MONTH = 12;
    private static final int MIN_YEAR = 1;
    private static final int MAX_YEAR = 4000;
    private static final int MAX_SECOND_DAY  = 86_400;

    public boolean isValidDate(int month, int year) {
        boolean valid = false;
        if((month >= MIN_MONTH && month <= MAX_MONTH) &&
                (year >= MIN_YEAR && year <= MAX_YEAR)) {
            valid = true;
        }
        return valid;
    }

    public boolean isValidAmountOfSeconds(int seconds) {
        boolean isTrue = false;
        if(seconds >= 0 && seconds < MAX_SECOND_DAY) {
            isTrue = true;
        }
        return isTrue;
    }
}
