abstract class Sphere{
    double radius;
    Sphere(double r){
        radius = r;
    }
    abstract void ComputeArea();
    abstract void ComputeVolume();
}
class Area extends Sphere{
    double area, vol;
    Area(double r){
        super(r);
        area = 0.0;
        vol = 0.0;
    }
    void ComputeArea(){
        area = 4 * 3.141 * (radius * radius);
        System.out.println("Area of sphere: "+area);
    }
    void ComputeVolume(){
        vol = ((4/3) * 3.141 * (radius * radius * radius));
        System.out.println("volume of the sphere: "+vol);
    }
}
class Result{
    public static void main(String[] args){
        Area obj = new Area(6.5);
        System.out.println("Output");

        obj.ComputeArea();
        obj.ComputeVolume();
    }

}