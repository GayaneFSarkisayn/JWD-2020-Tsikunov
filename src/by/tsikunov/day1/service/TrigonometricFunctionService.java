package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import by.tsikunov.day1.validator.NumberValidator;

import java.util.SortedMap;
import java.util.TreeMap;

public class TrigonometricFunctionService {
    public SortedMap<Double, Double> calculateTangentFunction(int startPoint, int endPoint, int step) throws ProjectIllegalDataException {
        NumberValidator validator = new NumberValidator();
        if(!validator.validateLineInterval(startPoint, endPoint, step)) {
            throw new ProjectIllegalDataException("Illegal data!");
        }
        double functionArgument = startPoint;
        SortedMap<Double, Double> tangentFunction = new TreeMap<>();

        while(functionArgument <= endPoint) {
            double tan = Math.tan(functionArgument);
            double scale = Math.pow(10, 3);
            tan = Math.ceil(tan * scale) / scale;
            tangentFunction.put(functionArgument, tan);
            functionArgument += step;
        }
        return tangentFunction;
    }

}
