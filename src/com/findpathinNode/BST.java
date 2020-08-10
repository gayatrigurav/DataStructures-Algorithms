package com.findpathinNode;

import java.util.ArrayList;

public class BST {

	Node root;
	public static void main(String[] args) {
		
		BST bst = new BST();
		bst.add(8,bst.root);
		bst.add(5,bst.root);
		bst.add(10,bst.root);
		bst.add(9,bst.root);
		bst.add(11,bst.root);
		bst.add(5,bst.root);
		bst.add(4,bst.root);
		bst.add(6,bst.root);
		
		bst.findPath(4,bst.root);
		bst.findPath(6,bst.root);
		System.out.println("steps:" + bst.steps);
		System.out.println("visited Nodes:" + bst.visitNodes);
		

	}
	
	ArrayList<Integer> visitNodes = new ArrayList<Integer>();
	int steps = 0;
	public void findPath(int searchValue, Node currentNode) {
		
		if(!visitNodes.contains(currentNode.value)) {
			steps++;
			visitNodes.add(currentNode.value);
		}else {
			steps--;
		}
		if(currentNode.value == searchValue) {
			return;
		}
		
		if(searchValue> currentNode.value) {
			findPath(searchValue,currentNode.rightNode);
		}
		
		if(searchValue < currentNode.value) {
			findPath(searchValue,currentNode.leftNode);
		}
	}
	
	public void add(int value, Node rootClone) {
		if(root == null) {
			root = new Node(value,null, null);
			return;
		}
		
		if(value> rootClone.value) {
			if(rootClone.rightNode == null) {
				rootClone.rightNode = new Node(value,null,null);
			}else {
				add(value, rootClone.rightNode);
			}
		}
		
		if(value< rootClone.value) {
			if(rootClone.leftNode == null) {
				rootClone.leftNode = new Node(value,null,null);
			}else {
				add(value, rootClone.leftNode);
			}
		}
	}

}
