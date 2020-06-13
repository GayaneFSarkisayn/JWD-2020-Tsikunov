package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PerfectNumberTest {
    PerfectNumberService service = new PerfectNumberService();

    @Test
    public void isPerfectNumberPositiveTest() {
        try {
            boolean actual = service.isPerfectNumber(28);
            assertTrue(actual);
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test
    public void isPerfectNumberNegativeTest() {
        try {
            boolean actual = service.isPerfectNumber(5);
            assertFalse(actual);
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
            expectedExceptionsMessageRegExp = "Illegal data")
    public void isPerfectNumberException() throws ProjectIllegalDataException {
        service.isPerfectNumber(200);
    }

}
