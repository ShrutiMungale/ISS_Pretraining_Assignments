package com.exceptionhandling;

public class ExceptionPropogation {

	public static void m() {
	System.out.println(20/0);
	}
	
	public static void n() {
		m();
	}
	
	public static void p() {
		try {
		n();}
		catch(Exception e) {System.out.println(e);}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         p();
	}

}
