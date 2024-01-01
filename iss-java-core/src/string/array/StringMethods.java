package com.string.array;
import java.util.Arrays;
public class StringMethods {

	public static void main(String[] args) {
	
		String s = "Strings are immutable";
		String s1="Strings are immutable";
		String s2="Hello";
		String s3="World";
		String s4="Sally sells seashells by the seashore";
		  System.out.println("Str1: "+s);
	      System.out.println("Character at index 8: "+s.charAt(8));
	      System.out.println("Lower Case:  "+s.toLowerCase());
	      System.out.println("UpperCase : "+s.toUpperCase());
	      System.out.println("Length of string: "+s.length());
	      char[] arr=s.toCharArray();
	      System.out.println("String to character array: "+Arrays.toString(arr));
	      System.out.println("First occurance of 'r': "+s.indexOf('r'));
	      System.out.println("First occurance of 'are': "+s.indexOf("are"));
	      System.out.println("Last occurance of 'r': "+s.lastIndexOf('r'));
	      System.out.println();
	      System.out.println("Str1: "+s);
	      System.out.println("Str2: "+s1);
	      System.out.println("Str3: "+s2);
	      System.out.println("Str4: "+s3);
	      System.out.println();
	      System.out.println("Concatenation of Str3 and Str4: "+s2.concat(s3));
	      System.out.println("Compare Str1 and Str2: "+s.compareTo(s1));
	      System.out.println("Compare Str1 and Str3: "+s.compareTo(s2));
	      System.out.println("Compare Str1 and Str4: "+s.compareTo(s3));
	      System.out.println();
	      System.out.println("Str5: "+s4);
	      System.out.println("Replace all occurance of 's' with 'x': "+s4.replace('s','x'));
	      System.out.println("Replace all occurance of 'sea' with 'xx': "+s4.replaceAll("sea","xx"));
	      System.out.println("Replace first occurance of 'sea' with 'xx': "+s4.replace("sea","xx"));
	      
	    
	      
	   

	}

}
