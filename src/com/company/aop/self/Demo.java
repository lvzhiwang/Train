package com.company.aop.self;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Demo {
	
	public static void main(String[] args) {
		//1-参数
		Teacher teacher = new TeacherImpl();
		
		InvocationHandler handle = new FactoryProxy(teacher);

		Class<?>[] interfaces = teacher.getClass().getInterfaces();
		
		ClassLoader load = handle.getClass().getClassLoader();
		
		Teacher newProxyInstance = (Teacher)Proxy.newProxyInstance(load , interfaces , handle);
		
		newProxyInstance.queryInfo(12);
	}

}
