package com.ds.linkedList;

public class LinkedList {
	private Node head;
	
	private class Node{
		int key;
		Node next;
		
		public Node(int key) {
			this.key = key;
		}
	}
	
	public boolean add(int data) {
		boolean isAdded = false;
		
		Node node = new Node(data);
		if(head == null) {
			head = node;
			isAdded = true;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			isAdded = true;
		}
		return isAdded;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public boolean append(int data) {
		boolean isAdded = false;
		
		Node node = new Node(data);
		if(head == null) {
			head = node;
			isAdded = true;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			isAdded = true;
		}
		return isAdded;
	}
	
	public void insertAtPos(int pos, int data) {
		if(pos < 1) {
			System.out.println("Invalid pos");
			return;
		}
		
		if(pos == 1) {
			push(data);
		}
		else {
			Node node = new Node(data);
			Node temp = head;
			int count = 2;
			while(count < pos) {
				temp = temp.next;
				count++;
			}
			Node curr = temp.next;
			temp.next = node;
			node.next = curr;
		}
	}
	
	public int pop() {
		if(head == null) {
			System.out.println("List is Empty");
			return 0;
		}
		Node temp = head;
		head = temp.next;
		return temp.key;
	}
	
	public int popLast() {
		if(head == null) {
			System.out.println("List is Empty");
			return 0;
		}
		if(head.next == null) {
		Node temp = head;
		head = null;
		return temp.key;
		}
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		int data = temp.next.key;
		temp.next = null;
		return data;
	}
	
	public boolean search(int elememt) {
		
		if(head == null) {
			System.out.println("List is empty");
			return false;
		}
		Node temp = head;
		boolean isFound = false;
		while(temp != null) {
			
			if(temp.key == elememt) {
				isFound = true;
				break;
			}
			temp = temp.next;
		}
		if(isFound = true) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
		
		return isFound;
	}
	
	public void insertNextToElement(int elememt, int data) {
		
		Node node = new Node(data);
		if(head == null) {
			System.out.println("List is empty");
		}
		Node temp = head;
		while(temp != null) {
			
			if(temp.key == elememt) {
				Node newNode = temp.next;
				temp.next = node;
				node.next = newNode;
				break;
			}
			temp = temp.next;
		}
	}
	
	public boolean remove(int element) {
		//70 -> 56 -> 30 -> 90
		if(!search(element)) {
			System.out.println("Data not present");
			return false;
		}
		Node temp = head;
		Node prev = null;
		if(temp != null && temp.key == element) {
			head = temp.next;
			//size--;
			return true;
		}
			
		while(temp != null) {
			if(temp.key == element ) {
				//size--;
				prev.next = temp.next;
				return true;
			}
			prev = temp;
			temp = temp.next;
		}
		
		return false;
		
	}
		
	public void print() {
		Node temp = head;
		System.out.println("Linked List :");
		
		while(temp != null) {
			System.out.print(temp.key + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
}
