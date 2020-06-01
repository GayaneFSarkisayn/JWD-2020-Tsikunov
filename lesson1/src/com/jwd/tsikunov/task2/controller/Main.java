package com.jwd.tsikunov.task2.controller;

import com.jwd.tsikunov.task2.model.DaysCounter;
import com.jwd.tsikunov.task2.view.Printer;

public class Main {

    public static void main(String[] args) {
        int month = 2;
        int year = 1896;
        Printer.print(month, year, new DaysCounter().daysCounter(month, year));
    }

}
