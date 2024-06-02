// Sample problem on method overriding and constructor inheritance

class Override
{
    int x;
    Override(int q)
    {
        x = q;
    }
    public void Display()
    {
        System.out.println("Value of x: "+x);
    }
}
class Derive extends Override
{
    double h;
    Derive(int q, double height)
    {
        super(q);
        h = height;
    }
    public void Display()
    {
        super.Display();
        System.out.print("Value of h: "+h);
    }
}
class sampleProblem3
{
    public static void main(String[] args)
    {
        Derive ob = new Derive(81, 56.2);
        ob.Display();
    }
}