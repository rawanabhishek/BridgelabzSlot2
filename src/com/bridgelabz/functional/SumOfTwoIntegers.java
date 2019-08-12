/******************************************************************************
 
 *  Purpose: Addition of Two Integers Provided By User
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;


public class SumOfTwoIntegers {

	public static void main(String[] args) {
		Utility utility  = new Utility();
		int firstNumber , secondNumber;
		System.out.println("Enter the first Integer : ");
		Scanner scanner = new Scanner(System.in);
		firstNumber =scanner.nextInt();
		
		System.out.println("Enter the second Integer : ");
		secondNumber = scanner.nextInt();
		
		int result =utility.SumOf2Numbers(firstNumber, secondNumber);
		System.out.println("Result : "+result);
		scanner.close();
	}

}
