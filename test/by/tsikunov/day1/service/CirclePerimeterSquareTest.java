package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CirclePerimeterSquareTest {
    CirclePerimeterSquareService service = new CirclePerimeterSquareService();

    @Test
    public void calculateCircleSquarePositiveTest() {
        try {
            double actualSquare = service.calculateCircleSquare(2);
            double expectedSquare = 12.56;
            assertEquals(expectedSquare, actualSquare, 0.01, "Incorrect calculation");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test
    public void calculateCircleSquareNegativeTest() {
        try {
            double actualSquare = service.calculateCircleSquare(2);
            double expectedSquare = 12.58;
            assertNotEquals(expectedSquare, actualSquare, 0.01, "Incorrect calculation");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test
    public void calculateCirclePerimeterPositiveTest() {
        try {
            double actualPerimeter = service.calculateCirclePerimeter(2);
            double expectedPerimeter = 12.56;
            assertEquals(expectedPerimeter, actualPerimeter, 0.01, "Incorrect calculation");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test
    public void calculateCirclePerimeterNegativeTest() {
        try {
            double actualPerimeter = service.calculateCirclePerimeter(2);
            double expectedPerimeter = 12.59;
            assertNotEquals(expectedPerimeter, actualPerimeter, 0.01, "Incorrect calculation");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
    expectedExceptionsMessageRegExp = "Illegal radius value")
    public void calculateCircleSquareException() throws ProjectIllegalDataException {
        service.calculateCircleSquare(200);
    }

    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
            expectedExceptionsMessageRegExp = "Illegal radius value")
    public void calculateCirclePerimeterException() throws ProjectIllegalDataException {
        service.calculateCirclePerimeter(-1);
    }
}
