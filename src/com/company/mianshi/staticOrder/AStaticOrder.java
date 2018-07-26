package com.company.mianshi.staticOrder;

public class AStaticOrder extends APerson {
	
	static String strBB = methodBB();
	
	//执行构造方法前执行，
	{
		System.out.println("this is son static block");
	}
	
	
	static{
		System.out.println("Son static");
	}
	
	static String strB = methodB();
	
	static String methodB(){
		System.out.println("son methodB");
		return "BBB";
	}
	
	private static String methodBB() {
		System.out.println("this is methodBB");
		return null;
	}
	
	public AStaticOrder() {
		System.out.println("this is static order");
	}

	public static void main(String[] args) {
		new AStaticOrder();
	}
}



