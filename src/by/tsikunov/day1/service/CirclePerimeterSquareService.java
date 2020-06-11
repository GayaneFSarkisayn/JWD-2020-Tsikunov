package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import by.tsikunov.day1.validator.NumberValidator;

public class CirclePerimeterSquareService {
    private NumberValidator validator = new NumberValidator();

    public double calculateCirclePerimeter(int radius) throws ProjectIllegalDataException {
        if(!validator.isValid(radius)) {
            throw new ProjectIllegalDataException("Illegal radius value");
        }
        return 2.0 * radius * Math.PI;
    }

    public double calculateCircleSquare(int radius) throws ProjectIllegalDataException {
        if(!validator.isValid(radius)) {
            throw new ProjectIllegalDataException("Illegal radius value");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
