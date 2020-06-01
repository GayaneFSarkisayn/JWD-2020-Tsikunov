package com.jwd.tsikunov.task2.model;

public class DaysCounter {

    public int daysCounter(int month, int year) {
        int days;
        if (!isValid(month, year)) {
            days = -1;
        } else if(month >= 8) {
            days = 30 + (month + 1) % 2;
        } else if(month != 2) {
            days = 30 + month % 2;
        } else {
            days = (isLeap(year)) ? 29 : 28;
        }
        return days;
    }

    private boolean isValid(int month, int year) {
        return ((month >= 1 && month <= 12) && year > 1);
    }

    private boolean isLeap(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

}
