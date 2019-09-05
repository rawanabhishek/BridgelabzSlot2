package com.bridgelabz.DataStructure;

public class BalancedStack {
	static char ar[] = new char[20];
	static int top = 0;

	// pushing to the stack
	public static void push(char arr) {
		ar[top] = arr;
		top++;
	}

	public static void pop() {
		
		top--;
		
	
		
	
		
	}

	public static void main(String[] args) {

		String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') {
				push(arr[i]);
			}
		else if (arr[i] == ')') {
			pop();
			}
		}

		
		System.out.println("The expression is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}
		System.out.println();

		if (top == 0) {
			System.out.println("The given expression is balanced ");
		}
		else {
			System.out.println("The given expression is not balanced ");
		}
	}

}
