package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CountingEvenNumbersServiceTest {
    CountingEvenNumbersService service = new CountingEvenNumbersService();

    @Test
    public void countEvensPositive() {
        try{
            int[] entry = {1, 2, 4, 5};
            boolean actual = service.countEvens(entry);
            assertTrue(actual, "Wrong data");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test
    public void countEvensNegative() {
        try{
            int[] entry = {1, 2, 3, 5};
            boolean actual = service.countEvens(entry);
            assertFalse(actual, "Wrong data");
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
    expectedExceptionsMessageRegExp = "Illegal data")
    public void countEvensException() throws ProjectIllegalDataException {
        service.countEvens(null);
    }
}
