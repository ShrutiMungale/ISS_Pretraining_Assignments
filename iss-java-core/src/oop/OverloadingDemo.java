package oop;

public class OverloadingDemo {
// Method Overloading
	public static int multiply(int a,int b) {
		return a*b;
	}
	
	public static int multiply(int a,int b,int c) {
		return a*b*c;
	}
	
	public static double multiply(double a,double b) {
		return a*b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int y=3;
		int z=5;
		double p=2.0;
		double q=5.0;
				
System.out.println("2*3 = "+multiply(x,y));
System.out.println("2*3*5 = "+multiply(x,y,z));
System.out.println("2.0*5.0 = "+multiply(p,q));
	}

}
