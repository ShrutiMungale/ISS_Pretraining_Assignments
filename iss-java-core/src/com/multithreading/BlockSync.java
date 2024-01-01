package com.multithreading;



class Interviewer{
	
	private static Object assist=new Object();
	public static void meet() throws InterruptedException {
		String threadName=Thread.currentThread().getName();
		System.out.println(threadName+"logged in");
		
		//String threadName=Thread.currentThread().getName();
		try {
			synchronized(assist) {
			System.out.println(threadName+" meeting started");
			//Thread.sleep();
			System.out.println(threadName+" meeting ended");
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(threadName+"logged out");
		
	}
}



public class BlockSync {
	
	private static class CandidateThread extends Thread{
		public void run() {
			try {
				Interviewer.meet();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++) {
			CandidateThread cft=new CandidateThread();
			cft.setName("Candidate"+i);
			cft.start();
		}

	}

}
