package com.string.array;
import java.util.Scanner; 
import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
	int[] numbers= {11,112,131,104,151,136};
	System.out.println("Original Array: "+Arrays.toString(numbers));
	Arrays.sort(numbers);
	System.out.println("Array Sorted in ascending order: "+Arrays.toString(numbers));
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Element to be searched in array: ");
	int x=sc.nextInt();
	System.out.println("Index of element "+x+" is: "+Arrays.binarySearch(numbers, x));
    sc.close();
	}

}
