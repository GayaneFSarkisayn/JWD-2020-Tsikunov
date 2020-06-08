package by.tsikunov.day1.service;


import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LastDigitOfSquareServiceTest {
    LastDigitOfSquareService service = new LastDigitOfSquareService();

    @Test
    public void getLastDigitOfSquareServiceTest() {
        int actual = service.getLastDigitOfSquare(25);
        int expected = 5;
        assertEquals(actual, expected, "Wrong data...");
    }

    @Test(enabled = true, expectedExceptions = IllegalArgumentException.class,
    expectedExceptionsMessageRegExp = "Illegal input data")
    public void getLastDigitOfSquareServiceException() {
        service.getLastDigitOfSquare(110);
    }
}
