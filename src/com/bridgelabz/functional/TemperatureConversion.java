/******************************************************************************
 
 *  Purpose: To Convert Temperature to Celsius and Fehranheit According to user prefernce
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
       
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		int choice ;
		System.out.println("Enter your choice  \n"
				+ " 1. for Celsius to fahranheit \n"
				+ " 2. For fahranheit ti Celsius ");
		
		choice = scanner.nextInt();
		
		System.out.println("Enter A Temperature ");
		double temperature=scanner.nextDouble();
		
		
		
		System.out.println(utility.tempconversion(temperature, choice));
		
		scanner.close();
	}

}
