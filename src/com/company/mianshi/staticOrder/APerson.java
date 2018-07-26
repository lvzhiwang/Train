package com.company.mianshi.staticOrder;

public class APerson {

	static{
		System.out.println("Person static");
	}
	////执行构造方法前执行，
	{
		System.out.println("this is person static block");
	}
		
	
	static String str = methodA();
	
	static String methodA(){
		System.out.println("person methodA");
		return "AAA";
	}
	
	public APerson() {
		// TODO Auto-generated constructor stub
		System.out.println("this is constructor Person");
	}
}
