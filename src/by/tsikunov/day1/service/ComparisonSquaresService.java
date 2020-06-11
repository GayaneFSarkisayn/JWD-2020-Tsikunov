package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import by.tsikunov.day1.validator.NumberValidator;

public class ComparisonSquaresService {
    public double calculateSquareInnerQuadrate(double square)
            throws ProjectIllegalDataException {
        NumberValidator validator = new NumberValidator();
        if(!validator.isValid(square)) {
            throw new ProjectIllegalDataException("Incorrect value");
        }
        return square / 2;
    }
    public double calculateSquaresDifference(double outerSquare, double innerSquare)
            throws ProjectIllegalDataException {
        if(innerSquare == 0) {
            throw new ProjectIllegalDataException("Divide by zero");
        }
        return outerSquare / innerSquare;
    }
}
