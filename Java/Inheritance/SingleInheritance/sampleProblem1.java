package SingleInheritance;
// Sample problem 1 on Single Inheritance
import java.util.*;
class basePro
{
    float n1, n2;
    public void enter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
    }
    public void show()
    {
        System.out.println("First number: "+n1);
        System.out.print("Second number: "+n2);
    }
}
class dervPro extends basePro
{
    float result;
    public void prod()
    {
        enter();
        result = n1 * n2;
    }
    public void disp()
    {
        System.out.println("Result: "+result);
    }
}
class sampleProblem1
{
    public static void main(String[] args)
    {
        dervPro obj = new dervPro();
        obj.prod();
        System.out.println("OUTPUT");
        obj.disp();
    }
}