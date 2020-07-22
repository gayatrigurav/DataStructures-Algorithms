package com.ds;

public class QueueCDynamicArrayDemo {

	public static void main(String[] args) {
		
		
			QueueDynamicArray<Integer> q = new QueueDynamicArray<Integer>(2);
			q.Queue(11);
			q.Queue(12);
			System.out.println("Size:"+q.getSize());
			q.Queue(12);
			System.out.println("size"+q.getSize());

		}
}


