import java.util.*;
class Room{
    int length, breadth;
    Room(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    int area(){
        return length * breadth;
    }
}
class Bedroom extends Room{
    int depth;
    Bedroom(int length, int breadth, int depth){
        super(length, breadth);
        this.depth = depth;
    }
    int volume(){
        System.out.println("Area: "+super.area());
        return length * breadth * depth;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length, breadth and depth of the room: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int depth = sc.nextInt();
        Bedroom ob = new Bedroom(length, breadth, depth);
        // System.out.println("Area: "+ob.area());
        System.out.println("Volume: "+ob.volume());
    }
}