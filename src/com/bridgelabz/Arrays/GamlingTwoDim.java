package com.bridgelabz.Arrays;

import java.util.Scanner;

import com.bridgelabz.utility.ArraysUtility;

public class GamlingTwoDim {
	public static void main(String[] args) {
		 Scanner  scanner = new Scanner(System.in);
	       ArraysUtility utility = new ArraysUtility();
	       
	       System.out.println("Enter the stake you have In INR : ");
	       int stake =scanner.nextInt();
	       
	       System.out.println("Enter Your Goal : ");
	       int goal =scanner.nextInt();
	       
	       System.out.println("Enter  trails   ");
	       
	        int day =scanner.nextInt();
	        
	        utility.gamling(stake, goal, day);
	       
	      

   }
	}
