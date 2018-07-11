package com.company.aop.self;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FactoryProxy implements InvocationHandler{

	private Object target;
	
	public FactoryProxy(Object target) {
		this.target = target;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("School name:TingHua University");
		method.invoke(target, args);
		System.out.println("Course is Chinese");
		return null;
	}

}
