package com.multithreading;

class Hi extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Hi");
		try {Thread.sleep(1000);}catch(Exception e) {}
	}}
}

class Hello extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Hello");
		try {Thread.sleep(1000);}catch(Exception e) {}
	}}
}



public class ExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello obj1=new Hello();
		Hi obj2=new Hi();
		
		obj1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		obj2.start();
		

	}

}
