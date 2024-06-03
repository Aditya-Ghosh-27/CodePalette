// Program based on MULTIPLE INHERITANCE using interface
interface Shape{
    double Volume();
    void Show();
}
class Cone implements Shape{
    double radius, height;
    Cone(double nr, double nh){
        radius = nr;
        height = nh;
    }
    public double Volume(){
        return ((3.141 * radius * radius * height)/3.0);
    }
    public void Show(){
        System.out.println("Radius: "+radius);
        System.out.println("Height: "+height);
        System.out.println("Volume: "+Volume());
    }
}
class Cylinder implements Shape{
    double radius, height;
    Cylinder(double nr, double nh){
        radius = nr;
        height = nh;
    }
    public double Volume(){
        return ((3.141*radius*radius*height));
    }
    public void Show(){
        System.out.println("Radius: "+radius);
        System.out.println("Height: "+height);
        System.out.println("Volume: "+Volume());    }
    public static void main(String[] args){
        Shape ob = new Cone(2.5, 5.2);
        Shape oc = new Cylinder(3.0, 5.2);

        ob.Volume();
        ob.Show();
        oc.Volume();
        oc.Show();
    }
}