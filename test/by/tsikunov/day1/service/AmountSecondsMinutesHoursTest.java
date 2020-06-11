package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;
import org.testng.annotations.Test;

import java.time.LocalTime;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class AmountSecondsMinutesHoursTest {
    AmountSecondsMinutesHoursService service = new AmountSecondsMinutesHoursService();
    @Test
    public void calculateDayClockTest() {
        try {
            LocalTime expected = LocalTime.of(23, 45, 10);
            LocalTime actual = service.calculateDayClock(85510);
            assertEquals(actual, expected, "Wrong date");
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
