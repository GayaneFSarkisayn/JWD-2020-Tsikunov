package by.tsikunov.day1.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DateValidatorTest {
    DateValidator validator = new DateValidator();

    @Test
    public void testIsValidPositive() {
        boolean actual = validator.isValid(1, 1900);
        assertTrue(actual, "Wrong data...");
    }

    @Test
    public void testIsValidNegative() {
        boolean actual = validator.isValid(13, 1900);
        assertFalse(actual, "Wrong data");
    }
}
