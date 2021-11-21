package com.ds.linkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();
		//linkedList.popLast();
		linkedList.print();
		linkedList.search(30);
		linkedList.insertNextToElement(30, 40);
		linkedList.print();
	}
}
