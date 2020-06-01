package com.jwd.tsikunov.task4.model;

public class EvenOrOdd {

    public boolean countEvens(int[] entry) {
        int counter = 0;
        for (int i = 0; i < entry.length && counter < 2; i++) {
            if(entry[i] % 2 == 0){ counter++; }
        }
        return counter == 2;
    }

}
