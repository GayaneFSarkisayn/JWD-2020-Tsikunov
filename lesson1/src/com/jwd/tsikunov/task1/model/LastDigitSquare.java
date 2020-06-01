package com.jwd.tsikunov.task1.model;

public class LastDigitSquare {

    private int getLastDigit(int number) {
        return number %= 10;
    }
    public int getLastDigitOfSquare(int number) {
        number = getLastDigit(number);
        return getLastDigit(number * number);
    }

}
