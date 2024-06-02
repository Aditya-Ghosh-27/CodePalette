package ConstructorInheritance;
// Sample problem on constructor inheritance
import java.util.*;
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
        System.out.print("Account number: "+AccNo);
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
public class result {
    public static void main(String[] args)
    {
        Deposit obj = new Deposit(12243, "MR. XYZ", 75000.00);
        System.out.println("Account Details");
        obj.showDetails();
    }
}
