class GrandParent{
    String name;
    double amount = 600000;
    GrandParent(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Total Amount: " + amount);
    }
    
}
class Son extends GrandParent{
    Son(String name){
        super(name);
    }
    void display(){
        double sonAmount = (0.4 * amount);
        System.out.println("Amount son received: " + sonAmount);
    }
}

class Grandson extends GrandParent{
    Grandson(String name){
        super(name);
    }
    void display(){
        double grandSonAmount = (0.4 * amount);
        System.out.println("Amount grandson received: " + grandSonAmount);
    }
}

class DynamicMethodDispatch{
    public static void main(String[] args) {
        GrandParent ob;
        ob = new Son("Anibrata");
        ob.display();
        ob = new Grandson("Aditya");
        ob.display();
    }
}