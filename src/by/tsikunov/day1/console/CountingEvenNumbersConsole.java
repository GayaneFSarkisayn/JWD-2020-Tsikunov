package by.tsikunov.day1.console;

public class CountingEvenNumbersConsole {
    public void print(boolean hasTwoEventNumbers, int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.printf("has at least 2 event numbers: %b%n", hasTwoEventNumbers);
    }
}
