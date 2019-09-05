package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class CashCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 500000;

		int a[] = { 1, 2, 3, 4, 5 };
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Person No "+(i+1));
			System.out.println("Enter 1 for widrawal\nEnter 2 for deposit ");
			int userinput = scanner.nextInt();
			switch (userinput) {
			case 1:
				
				System.out.println("Enter the amount you want to widraw ");
				int widAmount = scanner.nextInt();
				if (widAmount <= balance) {
					balance = balance - widAmount;
					break;

				} else {
					System.out.println("bank does not have that muc hamount ");
					break;
				}

			case 2:
				
				System.out.println("Enter the amount you want to widraw ");
				int depAmount = scanner.nextInt();
				balance = balance + depAmount;
				break;

			}
			System.out.println("The balance is "+balance);

		}
		
	
	}
}
