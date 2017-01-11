package com.allstate.models;

public class Line {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Line() {
    }

    public Line(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }


    public static double distance(Line line) {
        return  java.lang.Math.sqrt(Math.square(line.getX2() - line.getX1()) + Math.square(line.getY2() - line.getY1()));
    }

    public static double slope(Line line) {
        double yLength = line.getY2() - line.getY1();
        double xLength = line.getX2() - line.getX1();
        double slope = yLength / xLength;

        return java.lang.Math.round(slope * 100.0) / 100.0;

    }

    @Override
    public String toString() {
        return "Line{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                '}';
    }

    public static double yIntercept(Line line) {
        return line.getY2() - (Line.slope(line) * line.getX2());
    }
}
