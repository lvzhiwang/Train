package com.company.thread;

public class Test {

	public static void main(String args[]) {
		// 实现runnable接口 调用方法1
		RunnableDemo R0 = new RunnableDemo("Thread-00");
		String name = "localhost";
		Thread t = new Thread(R0, name);
		t.start();

		// 实现runnable接口  调用方法2
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		R1.start();

		RunnableDemo R2 = new RunnableDemo("Thread-2");
		R2.start();

		//继承Thread类
		ThreadDemo T1 = new ThreadDemo("Thread-1");
		T1.start();

		ThreadDemo T2 = new ThreadDemo("Thread-2");
		T2.start();

	}
	
	
	

}
