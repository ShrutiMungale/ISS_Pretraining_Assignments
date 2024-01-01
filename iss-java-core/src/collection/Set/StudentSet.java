package com.collection.Set;
import java.util.*;



class Student{
	int id;
	String studentName;
	
	public Student(int id,String studentName) {
		this.id=id;
		this.studentName=studentName;
	}
	
	public String toString() {
		return "Student [id="+id+" name= "+studentName+"]";
	}
}
public class StudentSet {
	
	public static void display(HashSet<Student> stud) {
		   for(Student s:stud) {
			   System.out.println(s);
		   }
		   
	   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet<Student> students=new HashSet<>();
	Student a=new Student(11,"Aditi");
	students.add(a);
	students.add(new Student(21,"Riddhi"));
	students.add(new Student(34,"Shruti"));
	students.add(new Student(9,"Varsha"));
	
	System.out.println("Original HashSet");
    display(students);
    HashSet<Student> newSet=new HashSet<>();
    newSet =(HashSet)students.clone();
    System.out.println();
    System.out.println("Cloned HashSet");
   // System.out.println(newSet);
    display(students);
    System.out.println();
    System.out.println("Number of Students: "+students.size());
    System.out.println();
    System.out.println("HashSet contains student named Aditi? "+students.contains(a));
    System.out.println();
    students.remove(a);
    System.out.println("After removing student named Aditi");
    //System.out.println(set);
    display(students);
    System.out.println();
    System.out.println("HashSet contains student named Aditi? "+students.contains(a));
    System.out.println("-------------------------------------");
    System.out.println("Print Set elements using iterator");
    System.out.println();
    Iterator<Student> it=students.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
    System.out.println("-------------------------------------");
    System.out.println("Clear the HashSet");
    students.clear();
    System.out.println(students);
    display(students);
    System.out.println("Set is empty?"+students.isEmpty());
    
	
	
	}

}
