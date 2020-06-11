package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import by.tsikunov.day1.validator.NumberValidator;

public class FunctionService {
    private int CONDITION_VALUE = 3;

    public double calculateEquation(int entryValue) throws ProjectIllegalDataException {
        NumberValidator validator = new NumberValidator();
        if(!validator.isValid(entryValue)) {
            throw new ProjectIllegalDataException("Wrong data");
        }
        double result;
        if(entryValue >= CONDITION_VALUE) {
            result = firstFunction(entryValue);
        } else {
            result = secondFunction(entryValue);
        }
        return result;
    }

    private double firstFunction(int entryValue) {
        return -Math.pow(entryValue, 2) + 3 * entryValue + 9;
    }

    private double secondFunction(int entryValue) {
        return 1.0 / (Math.pow(entryValue, 3) - 6.0);
    }
}
