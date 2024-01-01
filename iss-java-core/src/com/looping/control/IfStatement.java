package com.looping.control;

public class IfStatement {

	public static void main(String[] args) {
		int x = 100;
        //Example 1
		  System.out.println("Example 1");
	      if( x < 300 ) {
	         System.out.println("x is less than 300");
	      }
	    //Example 2
	      System.out.println("Example 2");
	      boolean result=x<300;
	      if(result) {
	         System.out.println("x is less than 300");
	      }
	    //Example 3
	      System.out.println("Example 3");
	      boolean result1=x>300;
	      if(!result1) {
	         System.out.println("x is less than 300");
	      }
	      
	      //If-Else
	      System.out.println("Example 4");
	      if( x < 300 ) {
	         System.out.println("x is less than 300");
	      }
	      else {
	    	  System.out.println("x is not less than 300");
	      }
	      //If-ElseIf-Else
	      System.out.println("Example 5");
	      if( x < 300 ) {
	         System.out.println("x is less than 300");
	      }
	      else if(x>300) {
	    	  System.out.println("x is greater than 300");
	      }
	      else {
	    	  System.out.println("x is equal to  300");
	      }
	      
	      
	     
	          double x1 = 30.0;
	          double y1 = 10.0;

	          if( x1 < 30.0 ) {
	             System.out.print("X1 < 30.0");
	          } else {
	             if( y1 > 9.0 ) {
	                System.out.print("X1 > 30.0 and Y1 > 9.0");
	             }  
	          
	       }
	      

	}

}
