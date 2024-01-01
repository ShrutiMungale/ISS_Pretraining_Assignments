package oop;

class Shape{
	
	public void display() {
		System.out.println("This is a Shape");
	}
}

class Quadrilateral extends Shape{
	 int numSides=4;
	public void display() {
		super.display();
		System.out.println("This is a Quadrilateral");
	}
}

class Circle extends Shape{
	 
	public void display() {
		System.out.println("--------------------------------");
		super.display();
		System.out.println("This is a Circle");
	}
}



class Square extends Quadrilateral {
	
	int side;
	
	Square(int length){
		this.side=length;
	}
	
	public void display() {
		System.out.println("--------------------------------");
		super.display();
		System.out.println("This is a Square");
		System.out.println("Length of side: "+side);
		System.out.println("Number of sides: "+super.numSides);
	}
}

class Rectangle extends Quadrilateral {
	
	int l;
	int w;
	
	Rectangle(int length,int width){
		this.l=length;
		this.w=width;
	}
	
	public void display() {
		System.out.println("--------------------------------");
		super.display();
		System.out.println("This is a Rectangle");
		System.out.println("Length and Breadth of Rectangle: "+l+" "+w);
		System.out.println("Number of sides: "+super.numSides);
		
		
	}
}




public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square(5);
		Rectangle rt=new Rectangle(6,2);
		Circle c=new Circle();
		sq.display();
		rt.display();
		c.display();
		

	}

}
