package by.tsikunov.day1.service;

import by.tsikunov.day1.entity.Point;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComparisonSquaresServiceTest {
    ComparisonSquaresService service = new ComparisonSquaresService();

    @Test
    public void calculateSquareInnerQuadrateTest() {
        double actual = service.calculateSquareInnerQuadrate(25);
        double expected = 12.5;
        assertEquals(actual, expected, 0.001, "Wrong data...");
    }

    @Test(enabled = true, expectedExceptions = IllegalArgumentException.class,
    expectedExceptionsMessageRegExp = "Incorrect value")
    public void calculateSquareInnerQuadrateException() {
        service.calculateSquareInnerQuadrate(120);
    }

    @Test
    public void calculateSquaresDifferenceTest() {
        double actual = service.calculateSquaresDifference(25, 12.5);
        double expected = 2.0;
        assertEquals(actual, expected, 0.001, "Wrong data");
    }

    @Test(enabled = true, expectedExceptions = ArithmeticException.class,
    expectedExceptionsMessageRegExp = "Divide by zero")
    public void calculateSquaresDifferenceException() {
        service.calculateSquaresDifference(12, 0);
    }
}
