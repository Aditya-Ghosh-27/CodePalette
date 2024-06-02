interface Demo{
    public void Show();
    public void Display();
}
class example implements Demo{
    public void Show(){
        System.out.println("I belong to interface and function Show()");
    }
    public void Display(){
        System.out.println("I belong to interface and function Display()");
    }
    public static void main(String[] args){
        Demo ob = new example();
        ob.Show();
        ob.Display();
    }
}