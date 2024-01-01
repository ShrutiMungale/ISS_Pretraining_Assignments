// Example of Student Class, Constructor 
package com.basic.demo;
public class Student {
// instance variables
   String name;
   int age;
   char section ;
   int rollno;

// This is the default constructor of the class Student
   public Student() {
	      
	   }

   // This is the parameterized constructor of the class Student
   public Student(String name) {
      this.name = name;
   }

// Methods
// Assign the name of the Student  to the variable name.
   public void setName(String studentName) {
	      name = studentName;
	   }
   // Assign the age of the Student  to the variable age.
   public void setAge(int studentAge) {
      age = studentAge;
   }

   /* Assign the section of the Student to the variable section.*/
   public void setSection(char studentSection) {
      section = studentSection;
   }

   /* Assign the rollno of the Student to the variable	rollno.*/
   public void setRollno(int studentRollno) {
      rollno = studentRollno;
   }

   /* Print the Student details */
   public void printDetails() {
      System.out.println("Name: "+ name );
      System.out.println("Age: " + age );
      System.out.println("Section: " + section );
      System.out.println("Rollno: " + rollno);
   }
}