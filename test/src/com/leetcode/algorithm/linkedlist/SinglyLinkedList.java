package com.leetcode.algorithm.linkedlist;

public class SinglyLinkedList {
	
	public Node head;
	public Node tail;
	
	class Node {	//	a node in the Linked list
		
		Object data;	//	data the node holds
		Node next;		//	next node
		
		public Node(Object data) {
			this.data = data;
		}
	}
	
	public void insert(Object data) {	//	insert a new node at the tail
		
		Node newNode = new Node(data);
		
		if(head == null) {	//	first node
			head = tail = newNode;
		}
		else {
			
			tail.next = newNode;
			tail = newNode;		//	breaks the connection with the new node
		}
	}
	
	public void insertAtHead(Object data) {		//	insert the new node at the head
		
		Node newNode = new Node(data);
		
		if(head == null) {	//	first node
			head = tail = newNode;
		}
		else {
			
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void insertAt(Object data, int position) {	//	the position starts from 0 and the element in current position will be pushed forward by 1 (n+1) 
		
		Node newNode = new Node(data);
		
		if(head == null) {	//	first node
			head = tail = newNode;
		}
		else {
			
			int count = 0;
			boolean isAdded = false;
			Node previousNode = head, currentNode = head;
			
			while(currentNode != tail) {
				
				if(count++ == position) {
					
					previousNode.next = newNode;
					newNode.next = currentNode;
					isAdded = true;
					break;
				}
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			
			if(!isAdded)
				System.out.println("Invalid position");
		}
	}
	
	public void display() {
		
		if(head == null) {
		
			System.out.print("List is empty");
			return;
		}
		
		Node current = head;
		int count = 0;
		while(current != null) {
			
			System.out.println(count++ + "->" + current.data + " ");
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.insert("A");
		list.insert(1);
		list.insert(3.0);
		
		list.insertAtHead(-1);
		list.insertAtHead(-2);
		list.insertAtHead(-3);
		
		list.insertAt("B", 4);
		
		list.display();
	}
}