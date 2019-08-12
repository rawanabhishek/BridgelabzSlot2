/******************************************************************************
 
 *  Purpose: To Calculate the distance between two point
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        Utility utility = new Utility();
        Double x ,y;
        
        System.out.println("Enter the value of x : ");
        x=scanner.nextDouble();
        
        System.out.println("Enter the value of y : ");
        y=scanner.nextDouble();
        
        System.out.println(" ");
        System.out.println("The Distance Between two point is "+utility.Distance(x, y));
        
        scanner.close();
        
        
		
	}

}
