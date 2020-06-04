package by.tsikunov.day1.validator;

public class NumberValidator {
    private final int MAX_VALUE = 100;
    private final int MIN_VALUE = 0;
    public boolean isValid(int number) {
        return (number <= MAX_VALUE && number >= MIN_VALUE);
    }
}
