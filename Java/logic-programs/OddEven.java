import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n % 2 == 0)
        System.out.print("Even Number");
        else 
        System.out.print("Odd Number");
    }
}