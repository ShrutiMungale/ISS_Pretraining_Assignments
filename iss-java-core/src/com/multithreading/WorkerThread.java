package com.multithreading;




public class WorkerThread implements Runnable {
	  
    private String job;
    
    public WorkerThread(String s){
        this.job=s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Job = "+job);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }
    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
   @Override
    public String toString(){
        return this.job;
    }}