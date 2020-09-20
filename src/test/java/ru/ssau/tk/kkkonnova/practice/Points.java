package ru.ssau.tk.kkkonnova.practice;

public class Points {
    private Points() {
    }

    public static Point sum(Point p1, Point p2) {

        return new Point(p1.x + p2.x, p1.y + p2.y, p1.z + p2.z);
    }

    public static Point subtract(Point p1, Point p2) {

        return new Point(p1.x - p2.x, p1.y - p2.y, p1.z - p2.z);
    }

    public static Point multiply(Point p1, Point p2) {

        return new Point(p1.x * p2.x, p1.y * p2.y, p1.z * p2.z);
    }

    public static Point divide(Point p1, Point p2) {

        return new Point(p1.x / p2.x, p1.y / p2.y, p1.z / p2.z);
    }

    public static Point enlarge(Point p, double a) {
        return new Point(p.x * a, p.y * a, p.z * a);
    }

    public static double length(Point p) {
        return p.length(p);
    }

    public static Point opposite(Point p) {
        return new Point(-1 * p.x, -1 * p.y, -1 * p.z);
    }

    public static Point inverse(Point p) {
        return new Point(1 / p.x, 1 / p.y, 1 / p.z);
    }

    public static double scalarProduct(Point p1, Point p2) {
        return p1.x * p2.x + p1.y * p2.y + p1.z * p2.z;
    }

    public static Point vectorProduct(Point p1, Point p2) {
        double newX = p1.y * p2.z - p2.y * p1.z;
        double newY = p1.x * p2.z - p2.x * p1.z;
        double newZ = p1.x * p2.y - p2.x * p1.y;
        return new Point(1 * newX, -1 * newY, 1 * newZ);
    }
}
