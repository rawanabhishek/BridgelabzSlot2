package com.bridgelabz.utility;

import com.bridgelabz.utility.LinkedListUtility.Node;

public class LinkedListUtilityInt {

	public class Node {
		public int data;
		public Node next;
	}

	static Node head;

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

	public static void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);

			node = node.next;

		}
		System.out.println(node.data);

	}

	public static void SaveToFile() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			Write += " " + node.data;
			node = node.next;

		}
		System.out.println(node.data);
		Write += " " + node.data;
	}

	public void deleteAt(int index) {

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

	public void insertAtstart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;

	}
	
	public void insertAt(int index ,int data) {
		Node node =new Node();
		node.data=data;
		node.next=null;
		
		if(index==0) {
			insertAtstart(data);
		}
		else{
			Node n=head;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}

}
