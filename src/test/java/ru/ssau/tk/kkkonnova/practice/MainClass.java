package ru.ssau.tk.kkkonnova.practice;

public class MainClass {

    public static void main(String[] args) {

        Point myPoint1 = new Point(0,0,0);
        Point myPoint2 = new Point(34,56,2);
        Point myPoint3 = new Point(-4,-6,8);

       Point resPoint = Points.enlarge(myPoint2, 5);

       System.out.println(resPoint.x);
       System.out.println(resPoint.y);
       System.out.println(resPoint.z);

    }
}
