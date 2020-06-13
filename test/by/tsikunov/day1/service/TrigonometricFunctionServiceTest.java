package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import org.testng.annotations.Test;

import java.util.SortedMap;
import java.util.TreeMap;

import static org.testng.Assert.*;

public class TrigonometricFunctionServiceTest {
    private TrigonometricFunctionService service = new TrigonometricFunctionService();

    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
    expectedExceptionsMessageRegExp = "Illegal data!")
    public void calculateTangentFunctionException() throws ProjectIllegalDataException {
        service.calculateTangentFunction(1, 2, -1);
    }

    @Test
    public void calculateTangentFunctionPositiveTest() {
        try {
            SortedMap<Double, Double> actual = service.calculateTangentFunction(1, 9, 2);
            SortedMap<Double, Double> expected = new TreeMap<>();
            expected.put(1.0, 1.558);
            expected.put(3.0, -0.142);
            expected.put(5.0, -3.38);
            expected.put(7.0, 0.872);
            expected.put(9.0, -0.452);
            assertEquals(actual, expected);
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test
    public void calculateTangentFunctionNegativeTest() {
        try {
            SortedMap<Double, Double> actual = service.calculateTangentFunction(1, 9, 2);
            SortedMap<Double, Double> expected = new TreeMap<>();
            expected.put(1.0, 1.558);
            expected.put(3.0, 1.0);
            expected.put(5.0, -3.38);
            expected.put(7.0, 2.7);
            expected.put(9.0, -0.452);
            assertNotEquals(actual, expected);
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

}
