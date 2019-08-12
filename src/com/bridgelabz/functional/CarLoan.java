/******************************************************************************
 
 *  Purpose:  to calculatet the monthly payment for given principal amount
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CarLoan {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Utility utility = new Utility();
	    System.out.println("Enter the Principal Amount : ");
	    double principal = scanner.nextDouble();
	    
	    System.out.println("Enter the Total No of Years : ");
	    double years=scanner.nextDouble();
	    
	    System.out.println("Enter the Rate Of Interest : ");
	    double rate=scanner.nextDouble();
	    
	    System.out.println("The total payment you have to made per month  is : "+utility.Interest(principal, years, rate));
	    
	    scanner.close();
	    
	    
	    

	}

}