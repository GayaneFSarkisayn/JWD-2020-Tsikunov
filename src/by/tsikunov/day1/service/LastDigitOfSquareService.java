package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import by.tsikunov.day1.validator.NumberValidator;

public class LastDigitOfSquareService {

    private int getLastDigit(int number) {
        number %= 10;
        return number;
    }
    public int getLastDigitOfSquare(int number) throws ProjectIllegalDataException {
        NumberValidator validator = new NumberValidator();
        if(!validator.isValid(number)) {
            throw new ProjectIllegalDataException("Illegal input data");
        }
        number = getLastDigit(number);
        return getLastDigit((int)Math.pow(number, 2));
    }

}
