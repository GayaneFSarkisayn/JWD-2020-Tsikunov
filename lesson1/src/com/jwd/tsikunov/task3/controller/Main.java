package com.jwd.tsikunov.task3.controller;

import com.jwd.tsikunov.task3.model.Square;
import com.jwd.tsikunov.task3.view.Printer;

public class Main {
    public static void main(String[] args) {
        double quadrateSquare = 25;
        Square square = new Square();
        double circleSquare = square.countCircleSquare(quadrateSquare);
        double difference = square.countSquareDifference(quadrateSquare, circleSquare);
        Printer.print(quadrateSquare, circleSquare, difference);
    }
}
