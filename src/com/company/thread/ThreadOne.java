package com.company.thread;

/**
 * for循环是几个线程
 * @author Dell
 *
 */
public class ThreadOne {
	
	public String queryInfo(int num){
		
		return "this is "+num;
	}
	
	public static void main(String[] args) {
		
		ThreadOne thOne = new ThreadOne();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("thread id :"+Thread.currentThread().getId()+", thread name:"+Thread.currentThread().getName());
			System.out.println(thOne.queryInfo(i));
		}
	}
	

}
