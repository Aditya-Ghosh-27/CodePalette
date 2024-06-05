import java.util.Scanner;
class Check{
    int n;
    Check(int n){
        this.n = n;
    }
    void check(){
        int c = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                c++;
            }
        }
        if(c == 2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Check ob = new Check(n);
        ob.check();
    }
}
