package com.ds;

public class QueueLinkedList<T> {
	NodeD Rear;
	NodeD Front;
	public QueueLinkedList() {
		Rear = null;
		Front= null;
	}
	
	public void Queue(Object value) {
		NodeD newNode = new NodeD(value,null,null);
		if(Rear==null) {
			Rear=newNode;
			Front=newNode;
		}
		else {
			newNode.next =null;
			newNode.previous=Rear;
			Rear.next=newNode;
			Rear=newNode;
		}
	}
	
	public T Dequeue() {
		if(Rear==null || Front==null) {
			System.out.println("queue is empty");
			return null;
		}
		
		T value = (T)Front.value;
		Front = Front.next;
		Front.previous = null;
		return value;
	}

}
