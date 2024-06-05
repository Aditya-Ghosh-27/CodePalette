class FourWheeler{
	int height, weight;
	FourWheeler(int height, int weight){
		this.height = height;
		this.weight = weight;
	}
	void display(){
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
	}
}

class Public extends FourWheeler{
	double ticketFair;
	Public(int height, int weight, double tf){
		super(height, weight);
		ticketFair = tf;
	}
	void display(){
		super.display();
		System.out.println("Ticket Fair: " + ticketFair);
	}
}

class Bus extends Public{
	double duration;
	Bus(int h, int w, double tf, double d){
		super(h, w, tf);
		duration = d;
	}
	void display(){
		super.display();
		System.out.println("Total duration: " + duration);
	}
}

class Minibus extends Public{
	String source, destination;
	Minibus(int h, int w, double tf, String s, String des){
		super(h, w, tf);
		source = s;
		destination = des;
	}
	void display(){
		super.display();
		System.out.println("Source: " + source);
		System.out.println("Destination: " + destination);
	}
}
		
class Private extends FourWheeler{
	double petrolPrice;
	Private(int height, int weight, double pp){
		super(height, weight);
		this.petrolPrice = pp;
	}
	void display(){
		super.display();
		System.out.println("Petrol Price: " + petrolPrice);
	}
}

class Tata extends Private{
	String color;
	Tata(int h, int w, double p, String c){
		super(h, w, p);
		color = c;
	}
	void display(){
		super.display();
		System.out.println("Color: " + color);
	}
}

class Maruti extends Private{
	double mileage;
	Maruti(int h, int w, double p, double m){
		super(h, w, p);
		mileage = m;
	}
	void display(){
		super.display();
		System.out.println("Mileage: " + mileage);
	}
}

class Desire extends Maruti{
	int nog;
	Desire(int h, int w, double p, double m, int n){
		super(h, w, p, m);
		nog = n;
	}
	void display(){
		super.display();
		System.out.println("No. of gears: " + nog);
	}
}

class Swift extends Maruti{
	int numPlate;
	Swift(int h, int w, double p, double m, int n){
		super(h, w, p, m);
		numPlate = n;
	}
	void display(){
		super.display();
		System.out.println("Number plate: " + numPlate);
	}
}

class Hybrid{
	public static void main(String[] args){
        	Bus bs = new Bus(100, 200, 800, 700);
        	bs.display();
		Swift sz = new Swift(100, 200, 800, 50, 100012);
		sz.display();
	}
}
