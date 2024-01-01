package com.multithreading;



import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounterDemo {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger(0);

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    count.incrementAndGet();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    count.incrementAndGet();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count.get());
    }
}
