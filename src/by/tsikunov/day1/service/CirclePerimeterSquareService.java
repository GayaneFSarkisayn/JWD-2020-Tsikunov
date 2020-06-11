package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import by.tsikunov.day1.validator.NumberValidator;

public class CirclePerimeterSquareService {
    private NumberValidator validator = new NumberValidator();
    
    public double calculateCirclePerimeter(int radius) throws ProjectIllegalDataException {
        if(!validator.isValid(radius)) {
            throw new ProjectIllegalDataException("Illegal radius value");
        }
        double[] parameters = new double[2];
        parameters[0] = 2.0 * radius * Math.PI;
        parameters[1] = Math.PI * Math.pow(radius, 2);
        return parameters;
    }

    public double calculateCircleSquare(int radius) throws ProjectIllegalDataException {
        if(!validator.isValid(radius)) {
            throw new ProjectIllegalDataException("Illegal radius value");
        }
        double[] parameters = new double[2];
        parameters[0] = 2.0 * radius * Math.PI;
        parameters[1] = Math.PI * Math.pow(radius, 2);
        return parameters;
    }
}
