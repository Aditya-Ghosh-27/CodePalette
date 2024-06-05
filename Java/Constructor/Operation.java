import java.util.*;
class Add{
    int a, b;
    Add(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("Addition: "+(a+b));
    }
}
class Sub{
    int a, b;
    Sub(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("Subtraction: "+(a-b));
    }

}
class Mul{
    int a, b;
    Mul(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("Multiplication: "+(a*b));
    }
}
class Div{
    int a, b;
    Div(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("Division: "+(a/b));
    }
}
class Operation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 number: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        Add ob = new Add(n, m);
        ob.display();
        Sub oc = new Sub(n, m);
        oc.display();
        Mul od = new Mul(n, m);
        od.display();
        Div oe = new Div(n, m);
        oe.display();
    }
}