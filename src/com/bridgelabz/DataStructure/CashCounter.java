package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class CashCounter {
	public static int q[] = new int[5];
	public static  int size;
	public int front;
	public  int rear;
	
	public boolean isFull() {
		return size==5;
	}
	public boolean isEmpty() {
		return size==0;
		
	}
	public int  enQueue(int data) {
		
		if(!isFull()) {
			q[rear]=data;
			rear=(rear+1)%5;
			size=size+1;
		}
		else {
			System.out.println("Queue is full  ");
		}
		return data;
	}
	
	public int deQueue() {
		int data=q[front];
		if(!isEmpty()) {
			front=(front+1)%5;
			size=size-1;
		}else {
			System.out.println("Queue is Empty ");
		}
		return data;
	}
	
	public void show() {
		System.out.print("Element : ");
		for(int i=0;i<size;i++) {
			System.out.print(q[(front+i)%5]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CashCounter que=new CashCounter();
		int balance = 500000;
		que.enQueue(1);
		que.enQueue(2);
		que.enQueue(3);
		que.enQueue(4);
		que.enQueue(5);
		

		
		que.show();
		System.out.println();
		int i=0;
		while(size!=0) {
			
			System.out.println();
			System.out.println("Hello  "+q[i]);
			System.out.println("Enter 1 for widrawal\nEnter 2 for deposit ");
			int userinput = scanner.nextInt();
			switch (userinput) {
			case 1:
				
				System.out.println("Enter the amount you want to widraw ");
				int widAmount = scanner.nextInt();
				if (widAmount <= balance) {
					balance = balance - widAmount;
					que.deQueue();
					break;

				} else {
					System.out.println("bank does not have that muc hamount ");
					que.deQueue();
					break;
				}

			case 2:
				
				System.out.println("Enter the amount you want to widraw ");
				int depAmount = scanner.nextInt();
				balance = balance + depAmount;
				que.deQueue();
				break;

			}
			System.out.println("The balance is "+balance);
			
			if(size!=0) {
			que.show();
			}
			else {
				System.out.println("Queue is empty ");
			}
			i++;
		}
		
	
	}
}
