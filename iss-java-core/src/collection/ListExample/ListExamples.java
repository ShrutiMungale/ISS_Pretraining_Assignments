package com.collection.ListExample;
import java.util.*;
public class ListExamples {
	public static void main(String[] args) {
		 //creating ArrayList of string type
		ArrayList<String> arrList=new ArrayList<>();

	    //adding few elements
	    arrList.add("Mumbai"); 
	    arrList.add("Delhi"); 
	    arrList.add("Pune");
	    arrList.add("Indore");
	    arrList.add("Kolkata");
	    arrList.add("Jaipur");
	    //inserting element at first position, index 0
	    arrList.add(0,"Chennai"); 
	    System.out.println("ArrayList: "+arrList);
	    
	    Collections.sort(arrList);
	    System.out.println("Sorted ArrayList: "+arrList);
	    System.out.println("ArrayList contains Mumbai: "+arrList.contains("Mumbai"));
	    System.out.println("ArrayList contains Noida: "+arrList.contains("Noida"));
	   
	    arrList.remove("Pune");
	    arrList.remove(0);
	    System.out.println("Array list after removing Pune and element at 0 index: "+arrList);
	    System.out.println("Element at index 1: "+arrList.get(1));
	    System.out.println("Index of Mumbai: "+arrList.indexOf("Mumbai"));
	    arrList.set(3, "Kochi");
	    System.out.println("ArrayList after replacing element at index 3 with Kochi: "+arrList);
	    arrList.clear();
	    System.out.println("Is Arraylist empty after clear() ? "+ arrList.isEmpty());
	    
	    
	    


	    
	}

}
