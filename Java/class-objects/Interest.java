import java.util.Scanner;
class Simple{
    int si;
    void display(int p, int r, int t){
        si = (p*r*t)/100;
        System.out.println("Simple Interest: "+si);
    }
}
class Interest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        int p = sc.nextInt();
        System.out.print("Enter rate: ");
        int r = sc.nextInt();
        System.out.print("Enter time: ");
        int t = sc.nextInt();
        Simple ob = new Simple();
        ob.display(p, r, t);
    }
}