/******************************************************************************
 
 *  Purpose: To print table of power of 2 upto n numbers
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/
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
