package by.tsikunov.day1.service;

import by.tsikunov.day1.entity.Point;
import by.tsikunov.day1.exception.ProjectIllegalDataException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsDistanceTest {
    PointsDistanceService service = new PointsDistanceService();

    @Test
    public void whichCloserTest() {
        Point a = new Point(4, 2, "A");
        Point b = new Point(1, 1, "B");
        try{
            Point actualPoint = service.whichCloser(a, b);
            Point expectedPoint = b;
            assertEquals(actualPoint, expectedPoint, "Incorrect result");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
    expectedExceptionsMessageRegExp = "Illegal data")
    public void whichCloserException() throws ProjectIllegalDataException {
        Point a = null;
        Point b = null;
        service.whichCloser(a, b);
    }
}
