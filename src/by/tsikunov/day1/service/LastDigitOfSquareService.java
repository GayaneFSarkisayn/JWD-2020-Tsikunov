package by.tsikunov.day1.service;

import by.tsikunov.day1.validator.NumberValidator;

public class LastDigitOfSquareService {

    private int getLastDigit(int number) {
        return number %= 10;
    }
    public int getLastDigitOfSquare(int number) {
        NumberValidator validator = new NumberValidator();
        if(!validator.isValid(number)) {
            throw new IllegalArgumentException("Illegal input data");
        }
        number = getLastDigit(number);
        return getLastDigit((int)Math.pow(number, 2));
    }

}
