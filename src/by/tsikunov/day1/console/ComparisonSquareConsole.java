package by.tsikunov.day1.console;

public class ComparisonSquareConsole {
    public void print(double difference, double innerSquare) {
        System.out.printf("Outer quadrate's square %.2f times bigger" +
                " than inner's quadrate square%n", difference);
        System.out.printf("Square of inner quadrete = %.2f%n", innerSquare);
    }

    public void printError(Exception e) {
        System.out.println(e.getMessage());
    }
}
