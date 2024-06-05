import java.util.*;
class Arithmetic{
    int sum, diff, mul, div;
    int add(int a, int b){
        return a + b;
    }
    int diff(int a, int b){
        return a - b;
    }
    int mul(int a, int b){
        return a * b;
    }
    double div(int a, int b){
        return a/b;
    }
}
public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        Arithmetic ob = new Arithmetic();
        System.out.println("Addition: "+ob.add(n, m));
        System.out.println("Subtraction: "+ob.diff(n, m));
        System.out.println("Multiplication: "+ob.mul(n, m));
        System.out.println("Division: "+ob.div(n, m));
    }
}
