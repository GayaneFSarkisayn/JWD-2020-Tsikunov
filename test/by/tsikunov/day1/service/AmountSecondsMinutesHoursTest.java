package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import org.testng.annotations.Test;

import java.time.LocalTime;

import static org.testng.Assert.*;

public class AmountSecondsMinutesHoursTest {
    AmountSecondsMinutesHoursService service = new AmountSecondsMinutesHoursService();
    @Test
    public void calculateDayClockPositiveTest() {
        try {
            LocalTime expected = LocalTime.of(23, 45, 10);
            LocalTime actual = service.calculateDayClock(85510);
            assertEquals(actual, expected, "Wrong date");
        }catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test
    public void calculateDayClockNegativeTest() {
        try {
            LocalTime expected = LocalTime.of(23, 45, 10);
            LocalTime actual = service.calculateDayClock(85511);
            assertNotEquals(actual, expected, "Wrong date");
        }catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
    expectedExceptionsMessageRegExp = "Illegal amount of seconds")
    public void calculateDayClockException() throws ProjectIllegalDataException {
        service.calculateDayClock(-5);
    }
}
