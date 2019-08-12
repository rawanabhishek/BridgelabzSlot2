/******************************************************************************
 
 *  Purpose: To take 3 Names from user and print them in reverse order 
 *            in a friendly greeting
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class PrintThreeNames {

	public static void main(String[] args) {
		String FristName , SecondName , ThirdName;
		System.out.println("Enter the frist Name ");
		Scanner scanner = new Scanner(System.in);
		FristName = scanner.next();
		System.out.println("Enter the Second Name ");
		SecondName = scanner.next();
		
		System.out.println("Enter the third Name  ");
		ThirdName = scanner.next();
		
		
		System.out.println("Hi "+ThirdName+", "+SecondName+" and "+FristName);
		
		scanner.close();
		

	}

}
