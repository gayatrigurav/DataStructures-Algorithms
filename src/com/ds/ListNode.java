package com.ds;

public class ListNode {
	Object value;
	ListNode next;

	public ListNode(Object value,ListNode next) {
		this.value = value;
		this.next=next;
	}

	public static void main(String[] args) {
		LinkedListU<String> ls = new LinkedListU<String>();
		ls.add("1");
		ls.add("2");
		ls.add("3");
		ls.add("4");
		ls.add("5");
		ls.add("6");
		ls.display();
		
		deleteKthElement(ls.head,3);
		ls.display();
	}

	static void deleteKthElement(Node root,int k) {
		//init
		Node slowPtr = root;
		Node fastPtr = root;
		
		while(k>0) {
			fastPtr = fastPtr.next;
			k--;
		}
		while(fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}
		
		slowPtr.next = slowPtr.next.next;
	}
}
