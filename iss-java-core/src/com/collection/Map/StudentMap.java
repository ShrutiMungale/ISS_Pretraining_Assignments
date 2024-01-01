package com.collection.Map;
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

class Subject{
	int marks;
	String subjectName;
	
	public Subject(String subjectName,int marks) {
		this.marks=marks;
		this.subjectName=subjectName;
	}
	
	public String toString() {
		//return "Subject ["+subjectName+" marks= "+marks+"]";
		return marks+" marks in "+subjectName;
	}
}


public class StudentMap {
	
	public static void display(HashMap<Student,Subject> studentMarks) {
		for(Map.Entry m : studentMarks.entrySet()){    
		    System.out.println(m.getKey()+" scored "+m.getValue());    
		   }  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,Subject> studentMarks=new HashMap<Student,Subject>();
		Student st1=new Student(80,"Ruta");
		Student st2=new Student(86,"Shruti");
		Student st3=new Student(72,"Bilal");
		Student st4=new Student(71,"Anannya");
		Student st5=new Student(87,"Bhavik");
		
		Subject m1=new Subject("Biology",89);
		Subject m2=new Subject("Maths",100);
		Subject m3=new Subject("Maths",79);
		Subject m4=new Subject("Maths",79);
		Subject m5=new Subject("Physics",88);
		
		studentMarks.put(st1,m1);
		studentMarks.put(st2,m2);
		studentMarks.put(st3,m3);
		studentMarks.put(st4,m4);
		studentMarks.put(st5,m5);
		
		//System.out.println(studentMarks.entrySet());
		display(studentMarks);
		System.out.println("--------------------------");
		System.out.println("Methods on map");
		System.out.println();
		System.out.println("Details of all students:");
		System.out.println(studentMarks.keySet());
		System.out.println();
		
		System.out.println("Remove details of student-Shruti:");
		studentMarks.remove(st2);
		display(studentMarks);
		System.out.println();
		System.out.println("Change marks of student-Anannya:");
		for (Map.Entry<Student, Subject> entry : studentMarks.entrySet()) {
            Student student = entry.getKey();
            if ("Anannya".equals(student.studentName)) {
                // Update marks for Anannya
                Subject newMarks = new Subject(entry.getValue().subjectName, 90);
                entry.setValue(newMarks);
            }
        }
        display(studentMarks);
//		Subject b=studentMarks.get(st4);
//		studentMarks.remove(st2);
//		display(studentMarks);
		
		
		
		
		
		
		
		 
		
	}

}
