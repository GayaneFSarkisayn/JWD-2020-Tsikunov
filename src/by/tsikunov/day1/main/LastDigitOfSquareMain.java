package by.tsikunov.day1.main;

import by.tsikunov.day1.console.LastSquareDigitConsole;
import by.tsikunov.day1.service.LastDigitOfSquareService;

public class LastDigitOfSquareMain {
    public static void main(String[] args) {
        LastDigitOfSquareService service = new LastDigitOfSquareService();
        LastSquareDigitConsole console = new LastSquareDigitConsole();

        int number = 49;
        try {
            int digit = service.getLastDigitOfSquare(number);
            console.print(number, digit);
        }
        catch (IllegalArgumentException e) {
            console.printError(e);
        }

        number = 25;
        try {
            int digit = service.getLastDigitOfSquare(number);
            console.print(number, digit);
        }
        catch (IllegalArgumentException e) {
            console.printError(e);
        }
    }
}
