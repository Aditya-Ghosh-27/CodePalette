

import addition.Addition;
import addition.Armstrong;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Addition addition = new Addition();
        Armstrong ob = new Armstrong();

        if(ob.armstrong(n) == true){
            System.out.println("ArmStrong Number");
        } else{
            System.out.println("Not");
        }

        int result = addition.add(5, 8);
        System.out.println("Addition of 5 and 8 is:" + result);
    }
}