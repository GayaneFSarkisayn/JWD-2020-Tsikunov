package by.tsikunov.day1.service;

import by.tsikunov.day1.entity.Point;
import by.tsikunov.day1.exception.ProjectIllegalDataException;

public class PointsDistanceService {
    public Point whichCloser(Point a, Point b) throws ProjectIllegalDataException {
        if(a == null || b == null) {
            throw new ProjectIllegalDataException("Illegal data");
        }
        double distanceA = Math.hypot(a.getXCoordinate(), a.getYCoordinate());
        double distanceB = Math.hypot(b.getXCoordinate(), b.getYCoordinate());

        return distanceA <= distanceB ? a : b;
    }
}
