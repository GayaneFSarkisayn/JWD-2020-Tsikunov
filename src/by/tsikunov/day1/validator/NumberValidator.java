package by.tsikunov.day1.validator;

public class NumberValidator {
    private static final int MAX_VALUE = 100;
    private static final int MIN_VALUE = 0;
    public boolean isValid(double number) {
        return (number <= MAX_VALUE && number >= MIN_VALUE);
    }
}
