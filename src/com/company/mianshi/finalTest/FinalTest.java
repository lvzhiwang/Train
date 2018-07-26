package com.company.mianshi.finalTest;

/**
 * 
 * final 测试
 * 1、final必须初始化
 * @author Dell
 *
 */
public class FinalTest {
	//final变量一旦被初始化赋值之后，就不能再被赋值了。
	final int num =1;
	
	 public static void main(String[] args)  {
	        String a = "hello2";  
	        final String b = getHello();
	        String c = b + 2;  
	        System.out.println((a == c));
	 
	    }
	     
	    public static String getHello() {
	        return "hello";
	    }
	
	//引用变量被final修饰之后，虽然不能再指向其他对象，但是它指向的对象的内容是可变的

}
