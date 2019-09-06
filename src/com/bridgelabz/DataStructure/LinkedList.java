package com.bridgelabz.DataStructure;

public class LinkedList {
	public class Node {
		public int data;
		public Node next;
	}

	Node head;
    //insert an element at the last of the list
	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

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
    //insert an element at  the start of the list
	public void insertAtStart(int data) {
		Node node = new Node();

		node.data = data;
		node.next = head;
		head = node;

	}
    //delete an element at any position of the list
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
   //insert an element at any position of the list
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}

		}
	}
   //to show the linked list
	public void show() {
		Node n1 = head;
		while (n1.next != null) {
			System.out.print(n1.data + " ");
			n1 = n1.next;
		}
		System.out.print(n1.data);
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(2);
		list.insert(4);
		list.insert(5);
		list.insertAtStart(6);
		list.show();
		System.out.println();
		list.deleteAt(2);
		list.show();

	}

}
