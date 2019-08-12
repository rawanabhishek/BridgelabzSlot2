package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeRange {

	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
	       Utility utility = new Utility();
	       
	       System.out.println("Enter the range  : ");
	       int range = scanner.nextInt();
	       
	       utility.Prime(range);
	       
	       scanner.close();
		
	}

}
