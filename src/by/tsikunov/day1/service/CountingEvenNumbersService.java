package by.tsikunov.day1.service;

public class CountingEvenNumbersService {

    public boolean countEvens(int[] entry) {
        int counter = 0;
        for (int i = 0; i < entry.length && counter < 2; i++) {
            if(entry[i] % 2 == 0) {
                counter++;
            }
        }
        return counter == 2;
    }

}
