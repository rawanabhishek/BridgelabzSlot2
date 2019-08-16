package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class gamlingSimulatore {

	public static void main(String[] args) {
		 Scanner  scanner = new Scanner(System.in);
	       Utility utility = new Utility();
	       
	       System.out.println("Enter the stake you have In INR : ");
	       int stake =scanner.nextInt();
	       
	       System.out.println("Enter Your Goal : ");
	       int goal =scanner.nextInt();
	       
	       System.out.println("Enter  trails   ");
	       int day =scanner.nextInt();
	       
	       // calling gamling function from the utility class
	       utility.gamling(stake, goal, day);
	       
	       scanner.close();
	       
	    
	       
	}

}
