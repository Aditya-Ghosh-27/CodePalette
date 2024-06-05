import java.util.*;
class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to see: ");
        int n = sc.nextInt();
        int x = 0, y= 1, z;
        System.out.print(x + ", " + y + ", ");
        for(int i = 2; i < n; i++){
            z = x + y;
            System.out.print(z + ", ");
            x = y;
            y = z;
        }
    }
}