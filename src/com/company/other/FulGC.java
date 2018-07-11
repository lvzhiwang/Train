package com.company.other;

import java.util.ArrayList;
import java.util.List;

public class FulGC {

	public List<String> query() {
		List<String> list = new ArrayList<>();
		System.out.println(list.getClass().getName());
		list.add("1111111");
		list.add("22222");
		System.out.println(list);
		return list;
	}

	public static void main(String[] args) {

		User user1 = new User();
		User user2 = new User();
		String str1 = new String("11111111");
		String str2 = new String("11111111");
		System.out.println(user1.equals(user2));
		System.out.println(str1.equals(str2));
	}
}

class User {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}