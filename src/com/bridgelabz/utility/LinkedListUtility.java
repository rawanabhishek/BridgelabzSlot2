package com.bridgelabz.utility;



public class LinkedListUtility {
	
      public class Node{
    	  String data;
    	  Node next;
      }

	Node head;
	public void insert(String data) {
	
		
		Node node = new Node();
		node.data = data;
		//node.data = (String) null;

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

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;

		}
		System.out.println(node.data);
		
	}
	
	
	public void  deleteAt(int index ) {
	
		if(index==0) {
			head=head.next;
		}
		else {
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++) {
				n=n.next;
				
			}
			n1=n.next;
			n.next=n1.next;
		}
	}
	public void inserAtstart(String data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
		
	}

}


