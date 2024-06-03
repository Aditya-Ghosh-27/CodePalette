// Abstract class problem to find the distance of radius between 2 points and also find their midpoint.
import java.util.*;
abstract class Point{
    double x1, y1;
    Point(double nx1, double ny1){
        x1 = nx1;
        y1 = ny1;
    }
    abstract void FindDistance();
    abstract void FindMidPoint();
    void Show(){
        System.out.println("Value of x1: "+x1);
        System.out.println("Value of y1: "+y1);
    }
}
class distance extends Point{
    double x2, y2;
    double dist;
    double midx, midy;
    distance(double nx1, double ny1, double nx2, double ny2){
        super(nx1, ny1);
        x2 = nx2;
        y2 = ny2;
        dist = 0.0;
        midx = midy = 0.0;
    }
    void FindDistance(){
        dist = (Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2)))/2;
    }
    void FindMidPoint(){
        midx = (x1 + x2)/2;
        midy = (y1 + y2)/2;
    }
    void Show(){
        super.Show();
        System.out.println("Value of x2: "+x2);
        System.out.println("Value of y2: "+y2);
        System.out.println("Value of distance of radius: "+dist);
        System.out.println("midx:  "+midx);
        System.out.println("midy:  "+midy);
    }
}
class ABC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of point 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter the value of point 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        distance ob = new distance(x1, y1, x2, y2);

        ob.FindDistance();
        ob.FindMidPoint();
        ob.Show();

    }
}
