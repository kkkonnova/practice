package ru.ssau.tk.kkkonnova.practice;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    Point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double length(Point p){
        return java.lang.Math.sqrt(p.x * p.x + p.y * p.y + p.z*p.z);
    }
}
