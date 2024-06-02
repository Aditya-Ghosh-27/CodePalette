package SingleInheritance;
// Sample problem 2 on single inheritance
import java.util.*;
class Info
{
    String name;
    double sal;
    public void Accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the employee: ");
        name = sc.next();
        System.out.print("Enter salary of the employee: ");
        sal = sc.nextDouble();
    }
    public void show()
    {
        System.out.println("Name of employee: "+ name);
        System.out.println("Salary of employee: "+sal);
    }
}
class Salary extends Info
{
    double allowance, total;
    public void compute()
    {
        if(sal < 20000)
            allowance = sal * 0.11;
        else 
            allowance = 0.0;
        total = sal + allowance;
    }
    public void display()
    {
        show();
        System.out.println("Allowance: "+allowance);
        System.out.print("Total Salary: "+total);
    }
}
public class sampleProblem2 {
    public static void main(String[] args)
    {
        Salary ob = new Salary();
        ob.Accept();
        ob.compute();
        ob.display();
    }
}
