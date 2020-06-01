package com.jwd.tsikunov.task4.controller;

import com.jwd.tsikunov.task4.model.EvenOrOdd;
import com.jwd.tsikunov.task4.view.Printer;

public class Main {
    public static void main(String[] args) {

        int[] firstEntry = {1, 3, 4, 7};
        int[] secondEntry = {2, 9, 4, 8};

        EvenOrOdd evenOrOdd = new EvenOrOdd();
        boolean isTrue = evenOrOdd.countEvens(firstEntry);
        Printer.print(firstEntry, isTrue);

        isTrue = evenOrOdd.countEvens(secondEntry);
        Printer.print(secondEntry, isTrue);
    }
}
