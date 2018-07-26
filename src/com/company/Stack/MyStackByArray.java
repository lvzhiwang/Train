package com.company.Stack;

import java.util.Arrays;

/**
 * 1、采用数组的方式
 * @author Dell
 *
 */
public class MyStackByArray<E> {
	
	private Object[] stack;
	private int size;

	public MyStackByArray() {
		
		stack = new Object[10];//初始化长度
		
	}

	public  E pop(){
		E e = peek();
		stack[size--] = null;
		size--;
		return e;
	}
	
	public E push(E item){
		ensureCapacity(size+1);
		stack[size] = item;
		return item;
	}
	
	public boolean isEmpty(){
		return size==0;
		
	}
	
	@SuppressWarnings("unchecked")
	public E peek(){
		if(isEmpty()){
			return null;
		}
		return (E) stack[size--];
	}
	
	public int size(){
		return size;
	}
	
	public void ensureCapacity(int size){
		int len = stack.length;
		if(size>len){//判断数组是否已满
			int newLength = 10;
			Arrays.copyOf(stack, newLength );
		}
	}
}
