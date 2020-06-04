package by.tsikunov.day1.console;

public class DaysOfMonthConsole {
    public void print(int days, int month, int year) {
        System.out.printf("In %d month of %d year are %d days %n", month, year, days);
    }

    public void printError(Exception e) {
        System.out.println(e.getMessage());
    }
}
