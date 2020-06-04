package by.tsikunov.day1.main;

import by.tsikunov.day1.console.DaysOfMonthConsole;
import by.tsikunov.day1.service.DaysOfMonthService;

public class DaysOfMonthMain {
    public static void main(String[] args) {
        int year = 2000;
        int month = 2;
        int days;
        DaysOfMonthService daysOfMonthService = new DaysOfMonthService();
        DaysOfMonthConsole console = new DaysOfMonthConsole();

        try{
            days = daysOfMonthService.daysCounter(month, year);
            console.print(days, month, year);
        } catch (IllegalArgumentException e) {
            console.printError(e);
        }

        year = 1928;
        month = 13;
        try{
            days = daysOfMonthService.daysCounter(month, year);
            console.print(days, month, year);
        } catch (IllegalArgumentException e) {
            console.printError(e);
        }

    }
}
