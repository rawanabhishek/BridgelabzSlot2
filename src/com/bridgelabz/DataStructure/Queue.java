package com.bridgelabz.DataStructure;

public class Queue {
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
		if(isFull()) {
		int length=q.length;
		int count=rear;
		System.out.print("Element : ");
		while(length>0) {
		   
		
			System.out.print(q[count]+" ");
			count++;
			if(count==5) {
				count=0;
			}
			
			length--;
	    }}
		else {
			System.out.print("Element : ");
			for(int i=0;i<size;i++) {
				System.out.print(q[(front+i)%5]+" ");
			}
		}
		
		}

	public static void main(String[] args) {
		Queue que=new Queue();
		
		que.enQueue(1);
		que.enQueue(2);
		que.enQueue(3);
		que.enQueue(5);
		que.enQueue(8);
		que.deQueue();
		que.deQueue();
		que.enQueue(7);
		que.enQueue(7);
		que.show();
		

	}

}
