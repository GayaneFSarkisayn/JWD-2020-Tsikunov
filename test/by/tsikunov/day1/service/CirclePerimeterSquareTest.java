package by.tsikunov.day1.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CirclePerimeterSquareTest {
    CirclePerimeterSquareService service = new CirclePerimeterSquareService();

    @Test
    public void calculateCircleSquarePerimeterTest() {
        try {
            double[] actual = service.calculateCirclePerimeterSquare(2);
            System.out.println(actual[0] + " " + actual[1]);
            double[] expected = {12.56, 12.56};
            assertEquals(expected, actual, "Incorrect calculation");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }
}
