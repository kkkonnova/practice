package ru.ssau.tk.kkkonnova.practice;

public class MainClass {

    public static void main(String[] args) {

        Point myPoint1 = new Point(0, 0, 0);
        Point myPoint2 = new Point(3, 5, 2);
        Point myPoint3 = new Point(-4, -6, 8);

        Point resPoint1 = Points.vectorProduct(myPoint2, myPoint3);
        System.out.println(resPoint1.x);
        System.out.println(resPoint1.y);
        System.out.println(resPoint1.z);


    }
}
