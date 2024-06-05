package addition;

public class Armstrong {
    public boolean armstrong(int n){
        int b = n;
        int sum = 0;
        while(b > 0){
            sum = sum + (int)Math.pow(b % 10, 3);
            b /= 10;
        }
        if(sum == n)
        return true;
        else
        return false;
    }
}
