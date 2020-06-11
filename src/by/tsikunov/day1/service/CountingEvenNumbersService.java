package by.tsikunov.day1.service;

import by.tsikunov.day1.exception.ProjectIllegalDataException;

public class CountingEvenNumbersService {

    public boolean countEvens(int[] entry) throws ProjectIllegalDataException {
        if(entry == null) {
            throw new ProjectIllegalDataException("Illegal data");
        }
        int counter = 0;
        for (int i = 0; i < entry.length && counter < 2; i++) {
            if(entry[i] % 2 == 0) {
                counter++;
            }
        }
        return counter == 2;
    }

}
