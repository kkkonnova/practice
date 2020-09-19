package ru.ssau.tk.kkkonnova.practice;

public class MainClass {

    public static void main(String[] args) {

        Point myPoint1 = new Point(0, 0, 0);
        Point myPoint2 = new Point(3, 5, 2);
        Point myPoint3 = new Point(-4, -6, 8);

        double resPoint1 = Points.scalarProduct(myPoint3, myPoint2);
        System.out.println(resPoint1);


    }
}
