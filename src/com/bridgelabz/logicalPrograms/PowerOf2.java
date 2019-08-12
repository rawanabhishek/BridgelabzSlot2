package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
	
		   Scanner  scanner = new Scanner(System.in);
	       Utility utility = new Utility();
	       int number;
	       System.out.println("Enter a Number Upto Which you want to Print the Table Of Power of 2 : ");
	        number=scanner.nextInt();
	        
	        
	        
	     utility.Power(number);
	       
	        
	        scanner.close();
	}

}
