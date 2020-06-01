package com.jwd.tsikunov.task2.view;

public class Printer {
    public static void print(int month, int year, int days) {
        if(days == -1) {
            System.out.printf("Incorrect data\n");
        } else {
            System.out.printf("In %d month %d year - %d days\n", month, year, days);
        }
    }
}
