package com.codecool.model;

public class Point {

    private final long xCoordinate;
    private final long yCoordinate;


    public Point(long xCoordinate, long yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    public long getxCoordinate() {
        return xCoordinate;
    }


    public long getyCoordinate() {
        return yCoordinate;
    }
}
