package com.bridgelabz.utility;

import com.bridgelabz.DataStructure.OrderedList;
import com.bridgelabz.utility.LinkedListUtility.Node;

public class LinkedListUtilityInt {

	public class Node {
		public int data;
		public Node next;
	}

	static Node head;

	
	//inserting the element at last 
	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		// node.data = (int) null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;

			while (n.next != null) {
				n = n.next;

			}
			n.next = node;
		}
	}

	public static String Write = " ";

	
	//printing the list 
	public static void show() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data + " ");

			node = node.next;

		}
		System.out.println(node.data);

	}

	
	//saving the list to a file
	public static void SaveToFile() {
		Node node = head;
		while (node.next != null) {

			Write += " " + node.data;
			node = node.next;

		}

		Write += " " + node.data;
	}

	
	//deleting the element at specific position in the list 
	public static void deleteAt(int index) {

		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;

			}
			n1 = n.next;
			n.next = n1.next;
		}
	}

	//inserting the element at start
	public void insertAtstart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;

	}

	
	//inserting the element at a specific position 
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtstart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	//sorting the list 
	public static void Sort() {
		// System.out.println(OrderedList.size);
		Node n = head;
		Node n1 = n.next;
		int temp;

		for (int i = 0; i < OrderedList.size - 1; i++) {
			
			for (int j = 0; j <= (OrderedList.size - 1) - i - 1; j++) {
				if (n.data > n1.data) {
					temp = n.data;
					n.data = n1.data;
					n1.data = temp;
					

				}
				n1 = n1.next;
			}

			n = n.next;
			n1 = n.next;

		}

	}

	
	//searching the value in the list
	public void SearchByKey(int key) {

		Node n = head;
		boolean isFound = false;

		int count = -1;
		while (n.next != null) {
			count++;

			if (n.data == key) {
				isFound = true;
				break;
			}
			n = n.next;

		}

		if (isFound) {
			System.out.println("Num Found And is Being deleted");
			OrderedList.size--;
			deleteAt(count);
		}

		else if (n.data == key) {
			System.out.println("Num Found And is Being deleted");
			OrderedList.size--;
			deleteAt(++count);
		} else {
			System.out.println("Key not found hence inserting the value ");
			OrderedList.size++;
			insertAt(count, key);
		}
	}

}
