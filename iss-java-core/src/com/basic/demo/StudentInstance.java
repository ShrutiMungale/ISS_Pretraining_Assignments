package com.basic.demo;

public class StudentInstance {

	public static void main(String[] args) {
		//Create object using parameterized constructor
		Student studentOne=new Student("Shruti");
		//Create object using default constructor
		Student studentTwo=new Student();
		
		studentOne.setAge(21);
		studentOne.setRollno(1601012008);
		studentOne.setSection('C');
		
		System.out.println("Details of first student\n" );
		studentOne.printDetails();

		
		studentTwo.setAge(20);
		studentTwo.setName("Aditi");
		studentTwo.setRollno(1601012009);
		studentTwo.setSection('A');
		
		System.out.println("\nDetails of second student\n" );
		studentTwo.printDetails();
		
		
	}

}
