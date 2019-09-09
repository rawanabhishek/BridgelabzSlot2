package com.bridgelabz.DataStructure;

import java.util.Scanner;



public class Pallindrom {
	
	public static char Q[];
	static int  front,rear, size;
	public static void enqueue(char arr) {
		
		if (rear == size) {
			System.out.println("Queue is Full ");
		} else {
			Q[rear] = arr;
			rear++;

		}
	}
	
	static void deQueueRear() {
		 while(isEmpty()) {
			for (int i = 0; i < rear - 1; i++) {
				Q[i] = Q[i + 1];

			}
			rear--;
		}
	}
	
	
	static void deQueueFront() {
	while(isEmpty()) {
			for (int i = rear-1; i < front; i--) {
				Q[i] = Q[i + 1];

			}
			front++;
		}
	}
	static boolean isEmpty() {
		if (0 == rear) {
			return true;
		} else {
			return false;

		}
	}
	
	static void showRear() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");

		} else {
			for (int i = 0; i < rear; i++) {

				System.out.println(Q[i]);
			}

		}
	}
	
	static void showFront() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");

		} else {
			for (int i = rear; i <=front; i--) {

				System.out.println(Q[i]);
			}

		}
	}

	
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Pallindrom pall=new Pallindrom();
		
		System.out.println("Enter a String to check it is pallindrom or not ");
		String str=scanner.next();
		size=str.length();
		char[] arr=str.toCharArray();
		
		Q=new char[size];
		for(int i=0;i<arr.length;i++) {
			enqueue(arr[i]);
		}
		pall.deQueueFront();
		Pallindrom.deQueueRear();
		pall.showFront();
		pall.showRear();
		

	}

}
