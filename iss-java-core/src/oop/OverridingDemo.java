package oop;
//Method overriding
 class Student{
	public void display() {
		System.out.println("I am a student");
	}
}

 class StudentOne extends Student{
	 public void display() {
			System.out.println("I am a Student One");
		}
 }
 
 class StudentTwo extends Student{
	 public void display() {
			System.out.println("I am a Student Two");
		}
 }

public class OverridingDemo {
	public static void main(String[] args) {
		Student st=new Student();
		StudentOne st1=new StudentOne();
		StudentTwo st2=new StudentTwo();
		st.display();
		st1.display();
		st2.display();
		
		
		
		
	}

	
}
