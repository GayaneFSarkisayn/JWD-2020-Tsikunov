package by.tsikunov.day1.console;

public class LastSquareDigitConsole {

    public void print(int number, int digit) {
        System.out.printf("The last digit of square of %d is %d%n", number, digit);
    }

    public void printError(Exception message) {
        System.out.println(message.getMessage());
    }
}
