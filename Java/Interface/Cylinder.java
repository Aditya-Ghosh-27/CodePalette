// Program based on MULTIPLE INHERITANCE using interface
interface Shapes{
    double calcArea();
}
class Sphere implements Shapes{
    double radius;
    Sphere(double r){
        radius = r;
    }
    public double calcArea(){
        return (4 * 3.141 * (radius * radius));
    }
}
class Cylinder implements Shapes{
    double radius, height;
    Cylinder(double r, double h){
        radius = r;
        height = h;
    }
    public double calcArea(){
        return ((2*3.141*radius*height)+(2*3.141*(radius*radius)));
    }
    public static void main(String[] args){
        Shapes obj = new Sphere(2.5);
        Shapes oc = new Cylinder(3.0, 5.2);

        obj.calcArea();
        oc.calcArea();
    }
}