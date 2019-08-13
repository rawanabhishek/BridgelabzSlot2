/******************************************************************************
 
 *  Purpose: To Print the prime factor of a given number
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Factor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();

		System.out.println("Enter a Number ");
		int number = scanner.nextInt();

		utility.factorcompute(number);

		scanner.close();

	}

}
