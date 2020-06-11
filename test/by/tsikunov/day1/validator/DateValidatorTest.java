package by.tsikunov.day1.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DateValidatorTest {
    DateValidator validator = new DateValidator();

    @Test
    public void testIsValidPositive() {
        boolean actual = validator.isValidDate(1, 1900);
        assertTrue(actual, "Wrong data...");
    }

    @Test
    public void testIsValidNegative() {
        boolean actual = validator.isValidDate(13, 1900);
        assertFalse(actual, "Wrong data");
    }

    @Test
    public void testIsValidAmountOfSecondsNegative() {
        boolean actual = validator.isValidAmountOfSeconds(-5);
        assertFalse(actual, "Wrong data");
    }

    @Test
    public void testIsValidAmountOfSecondsPositive() {
        boolean actual = validator.isValidAmountOfSeconds(10924);
        assertTrue(actual, "Wrong data");
    }
}
