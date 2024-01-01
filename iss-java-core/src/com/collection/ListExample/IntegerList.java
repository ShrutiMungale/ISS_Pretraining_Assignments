package com.collection.ListExample;
import java.util.*;
public class IntegerList {

	public static void main(String[] args) {
		
		
		Comparator<Integer> com=new Comparator<Integer>() {
			public int compare(Integer i,Integer j) {
				if(i%10>j%10) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<>();
		nums.add(12);
		nums.add(45);
		nums.add(21);
		nums.add(56);
		nums.add(70);
		
		System.out.println("Original List: "+nums);
		Collections.sort(nums);
		System.out.println("Sorted List: "+ nums);
		Collections.sort(nums,com);
		System.out.println("Using Comparator:List Sorted in ascending order according to units digit: "+ nums);
		
		

	}

}
