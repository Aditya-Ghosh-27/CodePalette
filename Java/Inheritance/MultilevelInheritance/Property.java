import java.util.*;
class GrandFather{
    double amount;
    double amountfather;
    double amountson;
    GrandFather(double amount){
        this.amount = amount;
    }
    void calculate(){
        amountfather = ((2.0/3.0)*amount);
        amountson = amount - amountfather;
    }
}
class Father extends GrandFather{
    String name;
    int age;
    double amount;
    Father(String name, int age, double amount){
        super(amount);
        this.name = name;
        this.age = age;
    }
    void display(){
        super.calculate();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Amount Received: "+amountfather);
    }

}
class GrandSon extends Father{
    String name;
    int age;
    double amount;
    GrandSon(String name, int age, String namef, int agef,  double amount){
        super(namef, agef, amount);
        this.name = name;
        this.age = age;
    }
    void display(){
        super.display();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Amount:"+amountson);
    }
}
class Property{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter name and age of father: ");
        String namef = sc.next();
        int agef = sc.nextInt();
        System.out.print("Enter name and age of grandson: ");
        String names = sc.next();
        int ages = sc.nextInt();
        System.out.print("Enter the total amount that was to be divided: ");
        double amount = sc.nextDouble();
        GrandSon ob = new GrandSon(names, ages, namef, agef, amount);
        ob.display();
    }
}
// class Property{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         System.out.print("Enter name and age of father: ");
//         String namef = sc.next();
//         int agef = sc.nextInt();
//         System.out.print("Enter name and age of grandson: ");
//         String names = sc.next();
//         int ages = sc.nextInt();
//         System.out.print("Enter the total amount that was to be divided: ");
//         double amount = sc.nextDouble();
//         GrandSon ob = new GrandSon(names, ages, namef, agef, amount);
//         ob.display();
//     }
// }