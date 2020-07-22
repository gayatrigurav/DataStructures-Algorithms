package com.ds;

public class StackLikedList<T> {
	Node top;
	public StackLikedList() {
		top = null;
	}

	public void push(Object value) {
		Node newNode = new Node(value,null);
		if(top==null)
			top=newNode;
		else {
			Node t = new Node(0,null);
			for(t=top;t.next!=null;t=t.next);
			t.next=newNode;			
		}
	}
	
	public T  pop() {
		if(top==null) {
			System.out.println("stack is empty");
			return null;
		}
		T value = (T)top.value;
		top = top.next;
		return value;
	}
	
}
