package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionTest {
    FunctionService service = new FunctionService();
    @Test
    public void calculateEquationLess3Test() {
        try {
            double actual = service.calculateEquation(2);
            double expected = 0.5;
            assertEquals(actual, expected, 0.01, "Wrong calculation");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }
    @Test
    public void calculateEquationMore2Test() {
        try {
            double actual = service.calculateEquation(3);
            double expected = 9.0;
            assertEquals(actual, expected, 0.01, "Wrong calculation");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }
    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
    expectedExceptionsMessageRegExp = "Wrong data")
    public void calculateEquationException() throws ProjectIllegalDataException {
        service.calculateEquation(-1);
    }
}
