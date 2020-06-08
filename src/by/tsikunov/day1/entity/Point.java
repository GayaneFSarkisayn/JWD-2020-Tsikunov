package by.tsikunov.day1.entity;

import java.util.Objects;

public class Point {
    private int xCoordinate;
    private int yCoordinate;
    private String name;

    public Point(int x, int y, String name) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.name = name;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s(%d, %d)", name, xCoordinate, yCoordinate);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) { return true; }
        if(o == null) { return false; }
        if(!(o instanceof Point)) { return false; }
        Point point = (Point) o;
        return this.xCoordinate == point.xCoordinate &&
                this.yCoordinate == point.yCoordinate &&
                this.name.equals(point.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate, name);
    }
}
