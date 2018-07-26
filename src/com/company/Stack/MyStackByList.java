package com.company.Stack;

/**
 * 链表实现栈
 * @author Dell
 *
 */
class Node<E>{
	
	private Node<E> next;
	
	private E data;
	
	public Node(E data){
		this.data = data;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	public E getData() {
		return data;
	}

	
	
}

public class MyStackByList<E> {
	
	private Node<E> top;
	
	public E pop(){
		E e = this.peek();
		top = top.getNext();
		return e;
	}
	
	public void Push(E data){
		Node<E> newNode = new Node<E>(data);
		newNode.setNext(top);
		top = newNode;
	}

	public E peek(){
		if(this.isEmpty()){
			
			return null;
		}
		return top.getData();
	}
	
	public boolean isEmpty(){
		return top==null;
	}
}
