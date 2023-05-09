package com.leetcode.algorithm.linkedlist;

public class DoublyLinkedList {

	public Node head;
	public Node tail;
	
	class Node {
		
		Object data;
		Node previous;
		Node next;
		
		public Node(Object data) {
			this.data = data;
		}
	}
	
	public void insert(Object data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			
			head = tail = newNode;
			head.previous = tail.next = null;
		}
		else {
			
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		}
	}
	
	public void display() {
		display(false);
	}
	
	public void display(boolean fromTail) {
		
		if(head == null) {
			
			System.out.print("List is empty");
			return;
		}
		
		Node current = (fromTail) ? tail : head;
		
		while(current != null) {
			
			System.out.print(current.data + " ");
			current = (fromTail) ? current.previous : current.next;
		}
	}
	
}
