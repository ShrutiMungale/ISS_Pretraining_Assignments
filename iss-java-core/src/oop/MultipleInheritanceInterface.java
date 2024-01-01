package oop;

interface Animal{
	void eat();
	void sleep();
}

interface Flyable{
	void fly();
}

interface Swimmable{
	void swim();
}

class Duck implements Animal,Flyable,Swimmable{
	@Override
    public void eat() {
        System.out.println("Duck can eat");
    }
	
	@Override
    public void sleep() {
        System.out.println("Duck can sleep");
    }
	
	@Override
    public void fly() {
        System.out.println("Duck can fly");
    }
	
	@Override
    public void swim() {
        System.out.println("Duck can swim");
    }
	
	public void display() {
		eat();
		sleep();
		fly();
		swim();
	}
	
}


class Sparrow implements Animal,Flyable{
	@Override
    public void eat() {
        System.out.println("Sparrow can eat");
    }
	
	@Override
    public void sleep() {
        System.out.println("Sparrow can sleep");
    }
	
	@Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }
	
	public void display() {
		eat();
		sleep();
		fly();
	}
	
}

class Shark implements Animal,Swimmable{
	@Override
    public void eat() {
        System.out.println("Shark can eat");
    }
	
	@Override
    public void sleep() {
        System.out.println("Shark can sleep");
    }
	
	
	@Override
    public void swim() {
        System.out.println("Shark can swim");
    }
	
	public void display() {
		eat();
		sleep();
		swim();
	}
	
}


public class MultipleInheritanceInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck duck=new Duck();
		duck.display();
		System.out.println("------------------------");
		Sparrow sparrow=new Sparrow();
		sparrow.display();
		System.out.println("------------------------");
		Shark shark=new Shark();
		shark.display();
		System.out.println("------------------------");

	}

}
