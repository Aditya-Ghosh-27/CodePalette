// Program based on MULTIPLE INHERITANCE using interface
interface Employee{
    void display();
}
class Worker implements Employee{
    String Name;
    double Basic;
    Worker(String na, double bs){
        Name = na;
        Basic = bs;
    }
    public void display(){
        System.out.println("Name of worker: "+Name);
        System.out.println("Basic pay of worker: "+Basic);
    }
}
class Wages extends Worker implements Employee{
    double hrs, rate, wage;
    Wages(String na, double bs, double hours, double rates, double wages){
        super(na, bs);
        hrs = hours;
        rate= rates;
        wage = wages;
    }
    public double overtime(){
        double amount;
        amount = (hrs * rate);
        return amount;
    }
    public void display(){
        double wage = (overtime() + Basic);
        super.display();
        System.out.println("Hours: "+hrs);
        System.out.println("Rate: "+rate);
        System.out.println("Wage: "+wage);    
    }
    public static void main(String[] args){
        Wages oc = new Wages("Aditya", 20000.0, 10.0, 5000, 0.0);

        oc.overtime();
        oc.display();
    }
}