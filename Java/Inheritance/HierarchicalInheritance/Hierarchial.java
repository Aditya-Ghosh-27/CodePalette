class Couple{
	double amount = 600000;
	double calculate(int percent){
		return (percent/100.0 * amount);
	}
}
class Son extends Couple{
	String name, location;
	int age;
	double sonAmount;
	Son(String name, int age, String location){
		this.name = name;
		this.age = age;
		this.location = location;
	}
	void display(){
		sonAmount = super.calculate(20);
		System.out.println("Son's name: " + name);
		System.out.println(name + " lives in " + location);
		System.out.println(name + " age is " + age);
		System.out.println("Amount received: " + sonAmount);
	}
}
class Daughter extends Couple{
	String name, location;
	int age;
	double daughterAmount;
	Daughter(String name, int age, String location){
		this.name = name;
		this.age = age;
		this.location = location;
	}
	void display(){
		daughterAmount = super.calculate(15);
		System.out.println("Daughter's name: " + name);
		System.out.println(name + " lives in " + location);
		System.out.println(name + "age is " + age);
		System.out.println("Amount received: " + daughterAmount);
	}
}

class Hierarchial{
	public static void main(String[] args){
		Son s1 = new Son("Firdous", 20, "Dudh-Para");
		Son s2 = new Son("Mohok", 20, "Madral Jhautola");
		
		s1.display();
		s2.display();
		
		Daughter d1 = new Daughter("Bidisha", 20, "Chinsurah");
		Daughter d2 = new Daughter("Rupsha", 20, "11 no rail-gate");
		
		d1.display();
		d2.display();
	}
}