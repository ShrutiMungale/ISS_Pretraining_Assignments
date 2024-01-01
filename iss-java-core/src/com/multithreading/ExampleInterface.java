package com.multithreading;

class A implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("A -from "+Thread.currentThread().getName());
		try {Thread.sleep(1000);}catch(Exception e) {}
	}}
}

class B implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++) {
	System.out.println("B-from "+Thread.currentThread().getName());
		try {Thread.sleep(1000);}catch(Exception e) {}
	}}
}



public class ExampleInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		A obj1=new A();
		B obj2=new B();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Is Thread 1 alive? "+t1.isAlive());
		System.out.println("Is Thread 2 alive? "+t2.isAlive());
		System.out.println("bye");
	}

}
