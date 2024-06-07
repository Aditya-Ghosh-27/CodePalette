// Sample problem on constructor inheritance
class Bank
{
    String nam;
    long AccNo;
    Bank(long x, String na)
    {
        nam = na;
        AccNo = x;
    }
    public void display()
    {
        System.out.println("Name of account holder: "+nam);
        System.out.println("Account number: "+AccNo);
    }
}
class Deposit extends Bank
{
    double amt;
    Deposit(long x, String na, double q)
    {
        super(x, na);
        amt = q;
    }
    public void showDetails()
    {
        display();
        System.out.println("Fixed Deposit Amount: "+amt);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Deposit obj = new Deposit(12243, "MR. Aditya", 75000.00);
        System.out.println("Account Details");
        obj.showDetails();
    }
}
