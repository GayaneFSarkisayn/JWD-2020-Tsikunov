package com.jwd.tsikunov.task1.controller;

import com.jwd.tsikunov.task1.model.LastDigitSquare;
import com.jwd.tsikunov.task1.view.Printer;

public class Main {

    public static void main(String[] args) {
        int number = 13;
        LastDigitSquare lastDigitSquare = new LastDigitSquare();
        int digit = new LastDigitSquare().getLastDigitOfSquare(number);
        Printer.print(number, digit);
    }
}
