package com.collection.ListExample;
import java.util.*;

class Student implements Comparable<Student>{
	int id;
	String studentName;
	
	public Student(int id,String studentName){
		this.id=id;
		this.studentName=studentName;
	}
	
	public String toString() {
		return "Student [id="+id+" name= "+studentName+"]";
	}
	
	

	@Override
	public int compareTo(Student that) {
		if(this.studentName.length()>that.studentName.length()) {
			return 1;
		}else return -1;
		// TODO Auto-generated method stub
		
	}
}



public class StudentList {
	
	public static void display(List<Student> stud) {
		   for(Student s:stud) {
			   System.out.println(s);
		   }
		   
	   }
	
	

	public static void main(String[] args) {
		
		
		Comparator<Student> com=new Comparator<Student>() {
			public int compare(Student i,Student j) {
				if(i.id>j.id) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		
		//int result = str1.compareTo(str2);
		Comparator<Student> com1=new Comparator<Student>() {
			public int compare(Student i,Student j) {
				int result = i.studentName.compareTo(j.studentName);
				if(result>0) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		// TODO Auto-generated method stub
   List<Student> nums=new ArrayList<>();
   nums.add(new Student(86,"Shruti"));
    Student b=new Student(72,"Bilal");
   nums.add(b);
   nums.add(new Student(80,"Tara"));
   nums.add(new Student(71,"Anannya"));
   System.out.println("List of Students:");
   System.out.println();
   display(nums);
   System.out.println();
   System.out.println("Using Comparator:");
   System.out.println("---------------------------------------");
   Collections.sort(nums,com);
   System.out.println("Students sorted in ascending order of id:");
   System.out.println();
   display(nums);
   System.out.println("---------------------------------------");
   System.out.println("Students sorted in alphabetic order of name :");
   System.out.println();
   Collections.sort(nums,com1);
   display(nums);
   System.out.println("---------------------------------------");
   System.out.println("Using Comparable:");
   System.out.println(); 
   System.out.println("Students sorted in ascending order of length of name:");
   Collections.sort(nums);
   display(nums);
   System.out.println("---------------------------------------");
   System.out.println("List Methods:");
   System.out.println();
   System.out.println("Replace student at index 0 with new student:[67,Aditi]");
   nums.set(0,new Student(67,"Aditi"));
   System.out.println();
   display(nums);
   System.out.println();
   System.out.println("Remove student at index 3");
   nums.remove(3);
   System.out.println();
   display(nums);
   System.out.println();
   System.out.println(" Student at index 0");
   System.out.println();
   System.out.println(nums.get(0));
   System.out.println();
   System.out.println("Index of student named Bilal");
   
   int a=nums.indexOf(b);
  // display(nums);
   System.out.println(a);
   //System.out.println(nums.get(0));
   
   //display(nums);
   
//   for(Student s:nums) {
//	   System.out.println(s);
//   }
//   
   
   
   
	}

}
