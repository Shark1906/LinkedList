package com.ds.linkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(70);
		linkedList.insertAtPos(2, 30);
		linkedList.print();
	}

}
