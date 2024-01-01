package com.collection.Set;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<>();
	    set.add("Orange");
	    set.add("Apple");
	    set.add("Banana");
	    set.add("Jackfruit");
	    set.add("Strawberry");
	    set.add("Blueberry");
	    System.out.println("Original HashSet");
	    System.out.println(set);
	    HashSet<String> newSet=new HashSet<>();
	    newSet =(HashSet)set.clone();
	    System.out.println();
	    System.out.println("Cloned HashSet");
	    System.out.println(newSet);
	    System.out.println();
	    System.out.println("Size of HashSet: "+set.size());
	    System.out.println();
	    System.out.println("HashSet contains Blueberry? "+set.contains("Blueberry"));
	    System.out.println();
	    set.remove("Blueberry");
	    System.out.println("After removing Blueberry");
	    System.out.println(set);
	    System.out.println();
	    System.out.println("HashSet contains Blueberry? "+set.contains("Blueberry"));
	    System.out.println("-------------------------------------");
	    System.out.println("Print Set elements using iterator");
	    System.out.println();
	    Iterator<String> it=set.iterator();
	    while(it.hasNext()){
	      System.out.println(it.next());
	    }
	    System.out.println("-------------------------------------");
	    System.out.println("Clear the HashSet");
	    set.clear();
	    System.out.println(set);
	    System.out.println("Set is empty?"+set.isEmpty());
	    
	    
	    
	}

}
