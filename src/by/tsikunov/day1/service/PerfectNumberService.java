package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import by.tsikunov.day1.validator.NumberValidator;

public class PerfectNumberService {
    public boolean isPerfectNumber(int number) throws ProjectIllegalDataException {
        NumberValidator validator = new NumberValidator();
        if(!validator.isValid(number)) {
           throw new ProjectIllegalDataException("Illegal data");
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
