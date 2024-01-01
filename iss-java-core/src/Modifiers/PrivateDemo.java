package Modifiers;
//  to access private variable outside class public get  set method required
class Test{

	  // private variables
	  private int age;
	  private String name;
	  public int rollno=86;

	  // initialize age
	  public void setAge(int age) {
	    this.age = age;
	  }

	  // initialize name
	  public void setName(String name) {
	    this.name = name;
	  }

	  // access age
	  public int getAge() {
	    return this.age;
	  }

	  // access name
	  public String getName() {
	    return this.name;
	  }

	}

	class PrivateDemo{
	  public static void main(String[] args) {
	    // create an object of Test
	    Test test = new Test();

	    // set value of private variables
	    test.setAge(22);
	    test.setName("Shruti");

	    // get value of private variables
	    System.out.println("Age: " + test.getAge());
	    System.out.println("Name: " + test.getName());
	    // get value of public variable without public method
	    System.out.println("Rollno: " + test.rollno);
	    test.rollno=87;
	    // change value of public variable without public method
	    System.out.println("Rollno: " + test.rollno);
	    
	    
	  }
	}


