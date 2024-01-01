package com.exceptionhandling;

public class RuntimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//try {
			//inner try block 1
			try {
				int i=10;
				int j=0;
				System.out.println(i/j);
			}
			catch(ArithmeticException e) {System.out.println(e);}
			//inner try block 2
			try {
				int[] nums= {1,2,3,4,5};
				System.out.println(nums[6]);
			}
			catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);}
			
			//inner try block 3
			try {
				String s="Hello";
				System.out.println(s.charAt(9));
			}
			catch(StringIndexOutOfBoundsException e) {System.out.println(e);}
			
			//inner try block 4
			try {
				String s1=null;
				System.out.println(s1.length());
			}
			catch(NullPointerException e) {System.out.println(e);}
			
			//inner try block 5
			try {
				String s2="abcd";
				int x=Integer.parseInt(s2);
				System.out.println(x);
			}
			catch(NumberFormatException e) {System.out.println(e);}
			
			{System.out.println("the end");}
		}//catch(Exception e){System.out.println(e);}
		
		
	}


