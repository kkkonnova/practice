package ru.ssau.tk.kkkonnova.practice;

public class Points {
    private Point myPoint = new Point(0,0,0);

    private Points(){
    }

    public static Point sum(Point p1, Point p2){

        return new Point(p1.x + p2.x, p1.y + p2.y, p1.z + p2.z);
    }
    public static Point subtract(Point p1, Point p2){

        return new Point(p1.x - p2.x, p1.y - p2.y, p1.z - p2.z);
    }
    public static Point multiply(Point p1, Point p2){

        return new Point(p1.x * p2.x, p1.y * p2.y, p1.z * p2.z);
    }
    public static Point divide(Point p1, Point p2){

        return new Point(p1.x / p2.x, p1.y / p2.y, p1.z / p2.z);
    }
    public static Point enlarge(Point p, double a){
        return new Point(p.x * a, p.y * a, p.z * a);
    }
   public static Point opposite(Point p){
        return new Point(-1*p.x,-1*p.y,-1*p.z);
   }
    public static Point inverse(Point p){
        return new Point(1/p.x,1/p.y,1/p.z);
    }
}
