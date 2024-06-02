class Plane{
    int x1, y1;
    Plane(int nx, int ny){
        x1 = nx;
        y1 = ny;
    }
    public void Show(){
        System.out.println("x1: "+x1);
        System.out.println("y1: "+y1);
    }
}
public class Circle extends Plane {
    int x2, y2;
    double radius, area;
    Circle(int nx1, int ny1, int nx2, int ny2){
        super(nx1, ny1);
        x2 = nx2;
        y2 = ny2;
        radius= 0.0;
        area = 0.0;
    }
    public void findRadius(){
        radius = (int)Math.sqrt((int)Math.pow(x2 - x1, 2) - (int)Math.pow(y2 - y1, 2));
    }
    public void findArea(){
        area = 3.14 * radius * radius;
    }
    public void Show(){
        super.Show();
        System.out.println("x2: "+x2);
        System.out.println("y2: "+y2);
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+area);
    }
    public static void main(String[] args){
        Circle ob = new Circle(10, 1, 5, 4);
        ob.findRadius();
        ob.findArea();
        ob.Show();
    }
}
