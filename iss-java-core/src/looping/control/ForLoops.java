package com.looping.control;

public class ForLoops {

	public static void main(String[] args) {
		
		//Example 1
		        System.out.println("Example 1:");
		        for(int i=0;i<10;i++) {
			    System.out.println("Value of i: "+i);
		        }
		        System.out.println();
		
		//Example 2
				System.out.println("Example 2:");
				int[] numbers= {11,12,13,14,15,16,17};
				for(int i=0;i<numbers.length;i++) {
					System.out.println("Value of item: "+numbers[i]);
				}
				System.out.println();
		//Example 3
				System.out.println("Example 3:");
				int x=0;
				for(;x<numbers.length;x++) {
					System.out.println("Value of x: "+x);
				}
				System.out.println();
		//With Break Statement
				System.out.println("Example 4:");
		        for(int i=0;i<10;i++) {
		        	if(i==4) {
		        		break;
		        	}
			    System.out.println("Value of i: "+i);
		        }
		        System.out.println();
		        
		 //With Continue Statement
				System.out.println("Example 4:");
		        for(int i=0;i<10;i++) {
		        	if(i==4) {
		        		continue;
		        	}
			    System.out.println("Value of i: "+i);
		        }
		        System.out.println();
				
	}

}
