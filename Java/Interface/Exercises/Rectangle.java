interface Object {
    double doArea();
}

class Circle implements Object {
    double radius;

    Circle(double nr) {
        radius = nr;
    }

    public double doArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle implements Object {
    double length, breadth;

    Rectangle(double nl, double nb) {
        length = nl;
        breadth = nb;
    }

    public double doArea() {
        return length * breadth;
    }
    public static void main(String[] args){
        Object ob = new Circle(5);
        Object oc = new Rectangle(6, 4);

        ob.doArea();
        oc.doArea();
    }
}