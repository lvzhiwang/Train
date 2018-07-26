package com.company.pattern.factory.singletonDemo;
import java.util.List;

/**
 * 单例模式
 * 
 * @author Dell
 *
 */
public class Singleton {

	// 饿汉模式

	private static Singleton single = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return single;
	}

}

// 饱汉模式
//线程不安全
class SingleTon {

	private static SingleTon sing = null;

	private SingleTon() {

	}

	public static SingleTon getInstance() {
		if(sing==null){
			sing = new SingleTon();
		}
		return sing;
	}
	
	public static void test(List<Integer> list){
		
	}

	
}