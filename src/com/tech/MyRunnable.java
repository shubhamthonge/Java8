package com.tech;

public class MyRunnable  implements Runnable{

	public void run() {
	        System.out.println("Thread is running using Runnable interface...");
	    }

	    public static void main(String[] args) {
	        MyRunnable myRunnable = new MyRunnable();
	        Thread t1 = new Thread(myRunnable);
	        t1.start();  // Start the thread
	    }
	}


