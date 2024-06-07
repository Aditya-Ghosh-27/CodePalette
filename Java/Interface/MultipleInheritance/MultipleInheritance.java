package MultipleInheritance;
interface canfly{
    void fly();
}
interface canswim{
    void swim();
}
class Duck implements canfly, canswim{
    public void fly(){
        System.out.println("The duck is flying.");
    }
    public void swim(){
        System.out.println("The duck is swimming");
    }
    public void display(){
        System.out.println("The duck can fly as well as swim");
    }
}
class MultipleInheritance{
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
        duck.display();
    }
}