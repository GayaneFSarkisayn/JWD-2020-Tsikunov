package by.tsikunov.day1.service;

import by.tsikunov.day1.validator.NumberValidator;

public class ComparisonSquaresService {
    public double calculateSquareInnerQuadrate(double square) {
        NumberValidator validator = new NumberValidator();
        if(!validator.isValid(square)) {
            throw new IllegalArgumentException("Incorrect value");
        }
        return square / 2;
    }
    public double calculateSquaresDifference(double outerSquare, double innerSquare) {
        if(innerSquare == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return outerSquare / innerSquare;
    }
}
