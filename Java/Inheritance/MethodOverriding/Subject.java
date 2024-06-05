import java.util.*;
class Super{
    int math, java, os , se, coa, hsmc;
    Super(int math, int java, int os, int se, int coa, int hsmc){
        this.math = math;
        this.java = java;
        this.os = os;
        this.se = se;
        this.coa = coa;
        this.hsmc = hsmc;
    }
    void display(){
        System.out.println("Maths: " + math);
        System.out.println("Java: " + java);
        System.out.println("OS: " + os);
        System.out.println("SE: " + coa);
        System.out.println("COA: " + coa);
        System.out.println("HSMC: " + hsmc);
    }
}
class Sub extends Super{
    int nss;
    Sub(int maths, int java, int os, int se, int coa, int hsmc, int nss){
        super(maths, java, os , se, coa, hsmc);
        this.nss = nss;
    }
    void display(){
        super.display();
        System.out.println("NSS = " + nss);
    }
}
class Subject{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int math = sc.nextInt();
        int java = sc.nextInt();
        int os = sc.nextInt();
        int se = sc.nextInt();
        int coa = sc.nextInt();
        int hsmc = sc.nextInt();
        Sub ob = new Sub(math, java, os, se, coa, hsmc, hsmc);
        System.out.println("Grades are: ");
        ob.display();
    }
}