package com.multithreading;


class Teacher{
	
	//private static Object assist=new Object();
	public static synchronized void meet() throws InterruptedException {
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName+" logged in");
		
		//String threadName=Thread.currentThread().getName();
		
			
			System.out.println(threadName+" meeting started");
			//Thread.sleep();
			System.out.println(threadName+" meeting ended");
			
		
		
		System.out.println(threadName+" logged out");
		
	}
}



public class MethodSync {
	
	private static class StudentThread extends Thread{
		public void run() {
			try {
				Teacher.meet();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++) {
			StudentThread sft=new StudentThread();
			sft.setName("Student"+i);
			sft.start();
		}

	}

}
