package by.tsikunov.day1.service;


import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DaysOfMonthServiceTest {

    DaysOfMonthService service = new DaysOfMonthService();

    @Test
    public void daysCounterLeapTest() {
        int actual = service.daysCounter(2, 2020);
        int expected = 29;
        assertEquals(actual, expected, "Wrong date...");
    }

    @Test
    public void daysCounterNotLeapTest() {
        int actual = service.daysCounter(2, 2021);
        int expected = 28;
        assertEquals(actual, expected, "Wrong date...");
    }

    @Test(enabled = true, expectedExceptions = IllegalArgumentException.class,
    expectedExceptionsMessageRegExp = "Invalid data")
    public void daysCounterException() {
        int actual = service.daysCounter(13, 2020);
    }

}
