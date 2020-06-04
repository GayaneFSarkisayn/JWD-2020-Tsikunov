package by.tsikunov.day1.main;

import by.tsikunov.day1.console.ComparisonSquareConsole;
import by.tsikunov.day1.service.ComparisonSquaresService;

public class ComparisonSquaresMain {
    public static void main(String[] args) {
        double difference, innerSquare;
        ComparisonSquaresService comparison = new ComparisonSquaresService();
        ComparisonSquareConsole console = new ComparisonSquareConsole();

        double outerSquare = 16;
        try {
            innerSquare = comparison.calculateSquareInnerQuadrate(outerSquare);
            difference = comparison.calculateSquaresDifference(outerSquare, innerSquare);
            console.print(difference, innerSquare);
        } catch (Exception e) {
            console.printError(e);
        }

        outerSquare = 1000;
        try {
            innerSquare = comparison.calculateSquareInnerQuadrate(outerSquare);
            difference = comparison.calculateSquaresDifference(outerSquare, innerSquare);
            console.print(difference, innerSquare);
        } catch (Exception e) {
            console.printError(e);
        }

    }
}
