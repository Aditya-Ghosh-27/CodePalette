abstract class Object{
    double radius;
    Object(double r){
        radius = r;
    }
    abstract void ConeVol();
    abstract void CylinderVol();
}
class Volume extends Object{
    double height, Vcone, Vcylin;
    Volume(double r, double h){
        super(r);
        height = h;
        Vcone = 0.0;
        Vcylin = 0.0;
    }
    void ConeVol(){
        Vcone = ((3.14 * radius * radius * height)/3);
        System.out.println("Volume of cone: "+Vcone);
    }
    void CylinderVol(){
        Vcylin = (3.14 * radius * radius * height);
        System.out.println("Volume of cylinder: "+Vcylin);
    }
}
class Main{
    public static void main(String[] args) {
        Volume ob = new Volume(5, 7);

        ob.ConeVol();
        ob.CylinderVol();
    }
}