package com.jwd.tsikunov.task4.view;

public class Printer {
    public static void print(int[]entry, boolean isTrue) {
        System.out.print("Entry { ");
        for (int i = 0; i < entry.length; i++) {
            System.out.print(entry[i] + " ");
        }
        System.out.print("} has at least 2 even numbers: " + isTrue + "\n");
    }
}
