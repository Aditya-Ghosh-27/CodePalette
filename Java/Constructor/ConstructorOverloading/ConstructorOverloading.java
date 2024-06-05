class Box{
	int length, breadth, depth;
	Box(int x, int y, int z){
		length = x;
		breadth = y; 
		depth = z;
	}
	Box(){
		length = breadth = depth;
	}
	Box(int x){
		length = breadth = depth = x;
	}
	int volume(){
		return (length * breadth * depth);
	}
}

class ConstructorOverloading{
	public static void main(String[] args){
		Box b1 = new Box();
		Box b2 = new Box(2);
		Box b3 = new Box(2, 3, 4);
		
		System.out.println("Volume of box b1 is: " + b1.volume());
		System.out.println("Volume of box b2 is: " + b2.volume());
		System.out.println("Volume of box b3 is: " + b3.volume());
	}
}