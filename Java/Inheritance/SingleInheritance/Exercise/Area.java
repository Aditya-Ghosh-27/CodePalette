class Perimeter{
    double a, b;
    Perimeter(double length, double breadth){
        a = length;
        b = breadth;
    }
    double calculate(){
        return 2*(a+b);
    }
    public void show(){
        System.out.println("Length: "+a);
        System.out.println("Breadth: "+b);
        System.out.println("Perimeter: "+calculate());
    }
}
public class Area extends Perimeter {
    double h;
    double area;
    Area(double length, double breadth, double height){
        super(length, breadth);
        h = height;
    }
    public void doarea(){
        area = b * h;
    }
    public void show(){
        super.show();
        System.out.println("Height: "+h);
        System.out.println("Area:"+area);
    }
    public static void main(String[] args){
        Area ob = new Area(10, 5, 5);
        ob.doarea();
        ob.show();
    }
}

