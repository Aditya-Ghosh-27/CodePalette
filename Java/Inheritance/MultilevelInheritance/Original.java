import java.util.*;
class GrandParent{
    double amount = 600000;
}
class Son extends GrandParent{
    String name;
    Son(String name){
        this.name = name;
    }
    void display(){
        double sonAmount = (0.4 * amount);
        System.out.println("Amount of " + name + " is: " + sonAmount);
    }
}
class GrandSon extends Son{
    String name;
    GrandSon(String name, String fatherName){
        super(fatherName);
        this.name = name;
    }
    void display(){
        double grandsonAmount = (0.3 * amount);
        System.out.println("Amount of " + name + " is: " + grandsonAmount);
    }
}
class Original {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
