package by.tsikunov.day1.service;


import by.tsikunov.day1.exception.ProjectIllegalDataException;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LastDigitOfSquareServiceTest {
    LastDigitOfSquareService service = new LastDigitOfSquareService();

    @Test
    public void getLastDigitOfSquareServiceTest() {
        try {
            int actual = service.getLastDigitOfSquare(25);
            int expected = 5;
            assertEquals(actual, expected, "Wrong data...");
        } catch (Exception e) {
            fail("Got unexpected exception");
        }
    }

    @Test(enabled = true, expectedExceptions = ProjectIllegalDataException.class,
    expectedExceptionsMessageRegExp = "Illegal input data")
    public void getLastDigitOfSquareServiceException() throws ProjectIllegalDataException {
        service.getLastDigitOfSquare(110);
    }
}
