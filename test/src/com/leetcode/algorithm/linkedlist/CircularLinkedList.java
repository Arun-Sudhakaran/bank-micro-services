package com.leetcode.algorithm.linkedlist;

public class CircularLinkedList {

	public Node head, tail;
	
	class Node {
		
		Object data;
		Node next;
		
		public Node(Object data) {
			super();
			this.data = data;
		}
	}
	
	public void insert(Object data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			
			head = tail = newNode;
			newNode.next = tail;
		}
		else {
			
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	public void display() {
		
		if(head == null) {
			
			System.out.print("List is empty");
			return;
		}
		
		Node current = head;
		
		do {
			
			System.out.print(current.data + " ");
			current = current.next;
		}
		while(current != head);
	}
}
