
class Library{
    String name, author;
    double p;
    Library(String n, String a, double np){
        name = n;
        author = a;
        p = np;
    }
    public void show(){
        System.out.println("Book Details");
        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
        System.out.println("Price: "+p);
    }
}
class Compute extends Library{
    int d;
    double f;
    Compute(String n, String a, double np, int days){
        super(n, a, np);
        d = days;
        f = 0.0;
    }
    public void fine(){
        if(d <= 7){
            f = 0.0;
        }
        else if((d - 7) >= 1 && (d - 7) <= 5){
            f = ((d - 7) * 2);
        }
        else if((d - 7) >= 6 && (d - 7) <= 10){
            f = ((d - 12) * 3 + 10);
        }
        else{
            f = (25 + (d - 17)* 5); 
        }
    }
    public void display(){
        double amount;
        amount = ((0.02*p*d)+f);
        show();
        System.out.println("Number of days the book was kept: "+d);
        System.out.println("Total amount to be paid as fine: "+f);
        System.out.print("Amount to be paid: "+amount);

    }
    public static void main(String[] args){
        Compute ob = new Compute("Aditya", "Tanisha", 700.0, 8);
        ob.fine();
        ob.display();
    }
}