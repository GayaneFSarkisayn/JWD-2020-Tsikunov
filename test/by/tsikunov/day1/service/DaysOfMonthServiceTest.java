package by.tsikunov.day1.service;


import by.tsikunov.day1.exception.ProjectIllegalDataException;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DaysOfMonthServiceTest {

    DaysOfMonthService service = new DaysOfMonthService();

    @Test
    public void daysCounterLeapPositiveTest() {
        try {
            int actual = service.daysCounter(2, 2020);
            int expected = 29;
            assertEquals(actual, expected, "Wrong date...");
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test
    public void daysCounterLeapNegativeTest() {
        try {
            int actual = service.daysCounter(2, 2020);
            int expected = 28;
            assertNotEquals(actual, expected, "Wrong date...");
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test
    public void daysCounterNotLeapPositiveTest() {
        try {
            int actual = service.daysCounter(2, 2021);
            int expected = 28;
            assertEquals(actual, expected, "Wrong date...");
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test
    public void daysCounterNotLeapNegativeTest() {
        try {
            int actual = service.daysCounter(2, 2021);
            int expected = 30;
            assertNotEquals(actual, expected, "Wrong date...");
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
    expectedExceptionsMessageRegExp = "Invalid data")
    public void daysCounterException() throws ProjectIllegalDataException {
        service.daysCounter(13, 2020);
    }

}
