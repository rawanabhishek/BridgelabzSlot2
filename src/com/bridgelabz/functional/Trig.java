/******************************************************************************
 
 *  Purpose: to give the print various trignometric functions
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Trig {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utility utility = new Utility();
        System.out.println("Enter The Angle  :");
        Double angle =scanner.nextDouble();
        
        System.out.println(utility.Trigonmetric(angle));
        
        scanner.close();
	}

}