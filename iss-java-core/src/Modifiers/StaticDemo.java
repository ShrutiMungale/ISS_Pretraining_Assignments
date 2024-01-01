package Modifiers;

public class StaticDemo {
	
	static void myStaticMethod() {
	    System.out.println("This is a static method. It can be called without creating an object");
	  }
	
	public void myPublicMethod() {
	    System.out.println("This is a public method. Object needs to be created to call it");
	  }

	public static void main(String[] args) {
		StaticDemo myObj=new StaticDemo();
		myObj.myPublicMethod();
		myObj.myStaticMethod();
		
		myStaticMethod();

	}

}
