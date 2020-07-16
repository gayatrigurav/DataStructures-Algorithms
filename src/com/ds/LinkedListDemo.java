package com.ds;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedListU<String> ls = new LinkedListU<String>();
		ls.add("Tom");
		ls.add("Mon");
		ls.add("John");
		ls.add("Don");
		ls.display();
		ls.delete();
		System.out.println("after delete");
		ls.display();
	}

}


