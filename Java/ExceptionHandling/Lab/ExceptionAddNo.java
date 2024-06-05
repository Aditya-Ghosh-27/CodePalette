

public class ExceptionAddNo{
    public static void tryNumber(int n){
        try{
            checkNumber(n);
            System.out.println(n + " is even number");
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void checkNumber(int n){
        if(n % 2 != 0){
            throw new IllegalArgumentException("Number is odd");
        }
    }
    public static void main(String[] args) {
        int n = 18;
        tryNumber(n);
        int m = 7;
        tryNumber(m);
    }
}
