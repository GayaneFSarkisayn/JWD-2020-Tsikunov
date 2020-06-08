package by.tsikunov.day1.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberValidatorTest {
    NumberValidator validator = new NumberValidator();

    @Test
    public void isValidPositive() {
        int enterValue = 10;
        boolean actual = validator.isValid(enterValue);
        assertTrue(actual, "Wrong data...");
    }

    @Test
    public void isValidNegative() {
        int enterValue = -5;
        boolean actual = validator.isValid(enterValue);
        assertFalse(actual, "Wrong data...");
    }

}
