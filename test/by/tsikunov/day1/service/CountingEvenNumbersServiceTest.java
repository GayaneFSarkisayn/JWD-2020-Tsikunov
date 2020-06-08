package by.tsikunov.day1.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CountingEvenNumbersServiceTest {
    CountingEvenNumbersService service = new CountingEvenNumbersService();

    @Test
    public void countEvensPositive() {
        int[] entry = {1, 2, 4, 5};
        boolean actual = service.countEvens(entry);
        assertTrue(actual, "Wrong data");
    }

    @Test
    public void countEvensNegative() {
        int[] entry = {1, 2, 3, 5};
        boolean actual = service.countEvens(entry);
        assertFalse(actual, "Wrong data");
    }
}
