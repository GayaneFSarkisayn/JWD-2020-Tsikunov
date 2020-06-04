package by.tsikunov.day1.main;

import by.tsikunov.day1.console.CountingEvenNumbersConsole;
import by.tsikunov.day1.service.CountingEvenNumbersService;

public class CountingEvenNumbersMain {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 7, 9};
        int[] array2 = {2, 4, 6, 9};
        CountingEvenNumbersService counter = new CountingEvenNumbersService();
        CountingEvenNumbersConsole console = new CountingEvenNumbersConsole();

        boolean hasTwoEventNumbers = counter.countEvens(array1);
        console.print(hasTwoEventNumbers, array1);

        hasTwoEventNumbers = counter.countEvens(array2);
        console.print(hasTwoEventNumbers, array2);
    }
}
