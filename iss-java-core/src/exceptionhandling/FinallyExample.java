package com.exceptionhandling;

public class FinallyExample {
	
public static void display1() {
	int i=10;
	int j=0;
	try {
		System.out.println(i/j);
	}catch(ArithmeticException e) {
		System.out.println(e);
	}finally{System.out.println("Finally block is always executed");}
	
}


public static void display3() {
	int i=10;
	int j=0;
	try {
		System.out.println(i/j);
	}catch(NullPointerException e) {
		System.out.println(e);
	}
	finally{System.out.println("Finally block is always executed");}
	
}


public static void display2() {
	int i=10;
	int j=0;
	try {
		System.out.println(i/j);
	}catch(ArithmeticException e) {
		System.out.println(e);
	}System.out.println("Rest of the code");
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First method: Handles the exception and executes finally block");
		display1();
		System.out.println();
		System.out.println("Second method: Handles the exception and executes code after try-catch not inside finally block");
		display2();
		System.out.println();
		System.out.println("Third method: Does not handle the exception but executes finally block");
		display3();
		
  
	}

}
