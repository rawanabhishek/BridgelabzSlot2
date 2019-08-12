/******************************************************************************
 
 *  Purpose: To Check Weather the Given year is a Leap year or Not According to Gregorian Calander
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		
		int year;
		Utility utility = new Utility();
		
		System.out.println("Enter a Year  To Check "
				+ "It is Leap Year or Not");
		Scanner scanner = new Scanner(System.in);
		
		year = scanner.nextInt();
		
		while(year<=1582) {
			System.out.println("enter the year greater than 1582 ");
			year=scanner.nextInt();
		}
		
		
		
		System.out.println(utility.Leapyear(year));
		
		scanner.close();
		
		
		
		
		
	}

}
