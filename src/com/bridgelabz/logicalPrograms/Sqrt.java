package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
		Utility utility = new Utility();
		
		System.out.println("Enter a number you want to find the square root  : ");
	      int  c =scanner.nextInt();
		if(c>0) {
	       double result=utility.Square(c);
	       System.out.println("the square root of : "+c+ " is "+result);
	       
		}
		else {
			System.out.println("Enter a positive integer ");
		}
	      
		scanner.close();
		
		}
	
	 

}
