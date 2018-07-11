package com.company.thread;

public class ThreadYieldOne implements Runnable{
	public String name;

	public void run() {

		for (int i = 0; i < 10; i++) {

			Thread.yield(); 
			// (2) Thread.sleep(100);
			System.out.println(name + " :" + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		ThreadYieldOne one = new ThreadYieldOne();
		ThreadYieldOne two = new ThreadYieldOne();
		one.name = "one========";
		two.name = "two";
		Thread t1 = new Thread(one);
		Thread t2 = new Thread(two);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY); 
		// (1)t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}
