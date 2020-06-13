package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComparisonSquaresServiceTest {
    ComparisonSquaresService service = new ComparisonSquaresService();

    @Test
    public void calculateSquareInnerQuadratePositiveTest() {

        try {
            double actual = service.calculateSquareInnerQuadrate(25);
            double expected = 12.5;
            assertEquals(actual, expected, 0.001, "Wrong data...");
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test
    public void calculateSquareInnerQuadrateNegativeTest() {

        try {
            double actual = service.calculateSquareInnerQuadrate(25);
            double expected = 12;
            assertNotEquals(actual, expected, 0.001, "Wrong data...");
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
    expectedExceptionsMessageRegExp = "Incorrect value")
    public void calculateSquareInnerQuadrateException() throws ProjectIllegalDataException {
        service.calculateSquareInnerQuadrate(120);
        fail("Expected ProjectIllegalDataException");
    }

    @Test
    public void calculateSquaresDifferencePositiveTest() {
        try {
            double actual = service.calculateSquaresDifference(25, 12.5);
            double expected = 2.0;
            assertEquals(actual, expected, 0.001, "Wrong data");
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test
    public void calculateSquaresDifferenceNegativeTest() {
        try {
            double actual = service.calculateSquaresDifference(25, 12.5);
            double expected = 3.0;
            assertNotEquals(actual, expected, 0.001, "Wrong data");
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
    expectedExceptionsMessageRegExp = "Divide by zero")
    public void calculateSquaresDifferenceException() throws ProjectIllegalDataException {
        service.calculateSquaresDifference(12, 0);
    }
}
