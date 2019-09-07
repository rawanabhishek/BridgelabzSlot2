package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class Queue2 {
	static int  rear, size;
	static Scanner scanner = new Scanner(System.in);
	static int Q[];

	// Enqueueing the element in the queue
	static void enQueue(int data) {
		if (rear == size) {
			System.out.println("Queue is Full ");
		} else {
			Q[rear] = data;
			rear++;

		}

	}

	// deQueing the element from the queue
	static void deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");

		} else {
			for (int i = 0; i < rear - 1; i++) {
				Q[i] = Q[i + 1];

			}
			rear--;
		}
	}

	
	//showing all the element from the queue
	static void show() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");

		} else {
			for (int i = 0; i < rear; i++) {

				System.out.println(Q[i]);
			}

		}
	}

	// Seeking weather the Queue is empty or not
	static boolean isEmpty() {
		if (0 == rear) {
			return true;
		} else {
			return false;

		}
	}

	public static void main(String[] args) {
		System.out.println("Please Enter the size of the Queue : ");

		size = Queue2.scanner.nextInt();
		Q = new int[size];

		int choice;
		//repeating the loop to take user input
		while (true) {
			System.out.println("Press 1 for Enqueue");
			System.out.println("Press 2 for Deque");
			System.out.println("Press 3 for traversing");

			choice = Queue2.scanner.nextInt();
            //taking chocie of user to perform operations
			switch (choice) {
			case 1:
				System.out.println("Enter the element you want to enQueue ");
				int en = Stack.scanner.nextInt();
				enQueue(en);

				break;

			case 2:
				deQueue();
				break;

			case 3:
				show();
				break;
			default:
				System.out.println("invalid input ");
			}

		}

	}

}
