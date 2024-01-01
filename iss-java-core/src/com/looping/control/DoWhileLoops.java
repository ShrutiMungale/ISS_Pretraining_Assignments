package com.looping.control;

public class DoWhileLoops {

	public static void main(String[] args) {
		//Example 1
        System.out.println("Example 1:");
        int i=0;
        do{
	    System.out.println("Value of i: "+i);
	    i++;
        }while(i<10);
        System.out.println();

//Example 2
		System.out.println("Example 2:");
		int[] numbers= {11,12,13,14,15,16,17};
		int x=0;
		do{
			System.out.println("Value of item: "+numbers[x]);
			x++;
		}while(x<numbers.length);
		System.out.println();
		
		
//With Break Statement		
        System.out.println("Example 3:");
        int z=0;
        do{
        	if(z==5) {break;}
	    System.out.println("Value of i: "+z);
	    z++;
        }while(z<10);
        System.out.println();
        
//With Continue Statement		
        System.out.println("Example 3:");
        int y=0;
        do{
        	if(y==5) {continue;}
	    System.out.println("Value of i: "+y);
	    y++;
        }while(y<10);
        System.out.println();



	}

}
