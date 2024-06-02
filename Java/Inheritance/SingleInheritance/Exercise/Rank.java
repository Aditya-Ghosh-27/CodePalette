import java.util.*;
class Record{
    String[] name;
    int[] rk;
    Record(){
        name = new String[50];
        rk = new int[50];

    }
    void readvalues(){
        for(int i = 1;i<=50;i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name of student: ");
            name[i] = sc.nextLine();
            System.out.print("Enter the rank of student: ");
            rk[i] = sc.nextInt();
        }
    }
    void display(){
        for(int i = 1;i<=50;i++){
            System.out.print("Name: "+name[i]+" Rank: "+rk[i]);
        }
    }
}
class Rank extends Record {
    int index;
    Rank(){
        super();
        index = 0;
    }
    void highest(){
        for(int i = 0; i < 50; i++){
            if(rk[i] > 0){
                index = i;
            }
        }
    }
    void display(){
        super.display();
        System.out.println("Highest Ranker: "+rk[index]);
    }
    public static void main(String args[]){
        Rank ob = new Rank();
        ob.highest();
        ob.display();
    }
}
