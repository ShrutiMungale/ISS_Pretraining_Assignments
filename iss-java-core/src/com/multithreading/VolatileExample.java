package com.multithreading;


class VolatileExample {
    public static volatile  boolean flag = true;

    class G1 extends Thread {
        public void run() {
        	int i=0;
            while (flag) {
            	
                System.out.println("Inside thread 1 "+i);
                i++;
            }
        }
    }

    class G2 extends Thread {
        public void run() {
            flag = false;
            System.out.println("Flag value changed");
        }
    }

    public static void main(String[] args) {
        VolatileExample game = new VolatileExample(); // Create an instance of the outer class
        G1 obj1 = game.new G1(); // Create an instance of the inner class G1
        G2 obj2 = game.new G2(); // Create an instance of the inner class G2

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        obj2.start();
    }
}
