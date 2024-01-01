package com.looping.control;
import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		

		
		      List<Integer> numbers = Arrays.asList(101, 201, 301, 401, 501);
//Example 1
		      System.out.print("Example 1:");
		      for(Integer x : numbers ) {
		         System.out.print( x );
		         System.out.print(",");
		      } 
		      System.out.println();
//Break Statement
		      System.out.print("Example with break statement:");
		      for(Integer x : numbers ) {
		    	  if(x==301)break;
		         System.out.print( x );
		         System.out.print(",");
		      } 
		      System.out.println();
		      
//Continue Statement
		      System.out.print("Example with continue statement:");
		      for(Integer x : numbers ) {
		    	  if(x==301)continue;
		         System.out.print( x );
		         System.out.print(",");
		      } 
		      System.out.println();
		      
		      
		   }
	

}
