package com.company.Stack;

import java.util.Stack;

/**
 * 
 * 手工实现一个栈
 * 1、采用数组的方式
 * 2、采用链表的方式
 * @author Dell
 *
 */
public class MyStack {
	
	public static void main(String[] args) {
		//1-学习JDK中的栈,梳理栈中包含的方法
		Stack<Integer> stack = new Stack<>();
		stack.peek();//或者栈顶元素但是不移除
		stack.push(1);//放元素到栈中
		stack.pop();//移除栈顶元素
		stack.isEmpty();//判断是否为空
		stack.size();//栈的大小
	}

}
