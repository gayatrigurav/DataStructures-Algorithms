package com.ds;

public class StackLinkedListDemo {

	public static void main(String[] args) {
		StackLikedList<String> st = new StackLikedList<String>();
		 
		st.pop();
		st.push("Tom");
		st.push("Don");
		
		System.out.println(st.pop());
	}


}


