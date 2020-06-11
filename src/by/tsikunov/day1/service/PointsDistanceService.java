package by.tsikunov.day1.service;

import by.tsikunov.day1.entity.Point;

public class PointsDistanceService {
    public Point whichCloser(Point a, Point b) {

        double distanceA = Math.hypot(a.getXCoordinate(), a.getYCoordinate());
        double distanceB = Math.hypot(b.getXCoordinate(), b.getYCoordinate());

        return distanceA <= distanceB ? a : b;
    }
}
