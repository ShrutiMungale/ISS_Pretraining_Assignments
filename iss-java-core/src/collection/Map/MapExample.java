package com.collection.Map;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<String,Integer>();//Creating HashMap    
		   map.put("Mango",10);  //Put elements in Map  
		   map.put("Apple",25);    
		   map.put("Banana",40);   
		   map.put("Grapes",100);
		   map.put("Guava",10);
		   map.put("Strawberry",20);
		   map.put("Peach",20);
		   
		   // Methods
		   System.out.println("Quantity of each fruit in map: "+map.entrySet());
		   System.out.println();
		   System.out.println("Set of fruits in map: "+map.keySet());
		   System.out.println();
		   System.out.println("Any fruit that has quantity=20? "+map.containsValue(20));
		   System.out.println();
		   System.out.println("Map contains Banana: "+map.containsKey("Banana"));
		   System.out.println();
		   map.remove("Banana");
		   System.out.println("After removing Banana:");
		   System.out.println();
		   System.out.println("Map contains Banana: "+map.containsKey("Banana"));
		   System.out.println();
		   System.out.println("Quantity of Guavas: "+map.get("Guava"));
		   System.out.println();
		   map.replace("Mango",0);
		   System.out.println("Set quantity of Mango to 0");
		   System.out.println();
		   System.out.println("Quantity of each fruit in map: "+map.entrySet());
		   System.out.println();
		   System.out.println("Number of different fruits available: "+map.size());
		   System.out.println();
		   System.out.println("Delete all elements from map");
		   map.clear();
		   map.entrySet();
		   System.out.println("Map isEmpty? "+map.isEmpty());
		   map.toString();
		   
		  
		       
	}

}
