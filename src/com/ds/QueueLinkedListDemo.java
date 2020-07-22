package com.ds;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		QueueLinkedList<String> q = new QueueLinkedList<String>();
		q.Queue("Tom");
		q.Queue("Tim");
		q.Queue("John");
		
		System.out.println(q.Dequeue());
	}

}


