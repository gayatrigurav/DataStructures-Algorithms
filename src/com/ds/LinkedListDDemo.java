package com.ds;

public class LinkedListDDemo {

	public static void main(String[] args) {
		LinkedListD<String>ls = new LinkedListD<String>();
		ls.add("John");
		ls.add("Tom");
		ls.add("Shon");
		ls.add("Mon");
		ls.add("Don");
		ls.add("Tim");
		ls.display();
		ls.delete();
		ls.display();

	}


}


