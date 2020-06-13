package by.tsikunov.day1.validator;

public class NumberValidator {
    private static final int MAX_VALUE = 100;
    private static final int MIN_VALUE = 0;

    public boolean isValid(double number) {
        return (number <= MAX_VALUE && number >= MIN_VALUE);
    }

    public boolean validateLineInterval(int firstPoint, int endPoint, int step){
        boolean result = true;
        if (firstPoint > endPoint || step <= 0) {
            result = false;
        }
        return result;
    }
}
