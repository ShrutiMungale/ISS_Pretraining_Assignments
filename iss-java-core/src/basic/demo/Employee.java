package com.basic.demo;
//Variable Types: Local,Instance and Static
public class Employee {
//Instance variable 
public String empName;
//Static variable
private static double salary;
public Employee (String Name) {
    empName = Name;
 }

public void getSalaryAfterBonus() {
//Local Variables: bonus and result
	double bonus;
	bonus=10000;
	double result=bonus+salary;
	System.out.println("Salary After Bonus  : " + result );
}
public void printEmp() {
    System.out.println("Name  : " + empName );
    System.out.println("Salary :" + salary);
 }

public static void main(String args[]) {
    Employee empOne = new Employee("Shruti");
    salary=230000;
    empOne.printEmp();
    empOne.getSalaryAfterBonus();
}

}
