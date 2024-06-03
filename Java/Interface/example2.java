// an interface extending an interface
interface Demo1{
    public void Show();
}
interface Demo2 extends Demo1{
    public void Display();
}
class example2 implements Demo2{
    public void Show(){
        System.out.println("I belong to interface Demo1 and function Show()");
    }
    public void Display(){
        System.out.println("I belong to interface Demo2 and function Display()");
    }
    public static void main(String[] args){
        Demo2 obj = new example2();
        obj.Show();
        obj.Display();
    }
}
