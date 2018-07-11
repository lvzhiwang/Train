package com.company.aop.self;

public class TeacherImpl implements Teacher {

	@Override
	public String queryInfo(int age) {

		System.out.println("Teacher age is "+age);
		return "Chinese";
	}

}
