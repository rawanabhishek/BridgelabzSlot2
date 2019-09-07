package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class Stack {
	static int top=-1, size, stack[];

	// pushing the element in the stack
	static void push(int data) {
		if (isFull()) {
			System.out.println("Stack is Full");
		} else {
			stack[++top] = data;
		}

	}

	// checking weather the element is full or not
	static boolean isFull() {
		if (top == size - 1) {
			return true;
		} else {
			return false;
		}
	}

	// poping the element from the top position
	static int pop() {
		if (isEmpty()) {
			return 0;
		} else {
			return stack[top--];

		}

	}

	// seeking for the peak element
	static int peek() {
		if (isEmpty()) {
			return 0;
		} else {
			return stack[top];
		}
	}
	
	//showing all the element from the stack
	static void show() {
		if(isEmpty()) {
			System.out.println("Stack is Underflow ");
		}
		else {
			
			for(int i=top;i>=0;i--) {
				
					System.out.println(stack[i]);
					
				}
				
			
		}
	}

	// checking weather the stack is empty or not
	static boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of the Stack : ");
		size = Stack.scanner.nextInt();

		stack = new int[size];

		int item;
		while(true) {
		System.out.println("Enter 1 for pushing the element : ");
		System.out.println("Enter 2 for poping the element : ");
		System.out.println("Enter 3 to see peek element : ");
		System.out.println("Enter 4 to traverse the stack : ");
		int choice = Stack.scanner.nextInt();
      
		switch (choice) {
		case 1:
			System.out.println("Enter the element you want to push ");
			int push = Stack.scanner.nextInt();
			Stack.push(push);
			break;
		case 2:
			item = Stack.pop();
			if (item == 0) {
				System.out.println("Stack is underflow ");
			} else {
				System.out.println("The poped element is :" + item);
			}
			break;

		case 3:
			item = Stack.peek();
			if (item == 0) {
				System.out.println("Stack is underflow ");
			} else {
				System.out.println("The peek  element is :" + item);
			}
			break;

		case 4:
			Stack.show();
			break;

		}
      }

	}

}
