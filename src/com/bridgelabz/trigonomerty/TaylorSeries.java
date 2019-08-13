/******************************************************************************
 
 *  Purpose: To Print the taylor series
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.trigonomerty;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TaylorSeries {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utility utility = new Utility();
        
        System.out.println("Enter a Angle : ");
        double angle= scanner.nextDouble();
        
        utility.sintaylor(angle);
        
        System.out.println();
        utility.costaylor(angle);
        
        
        
        scanner.close();
	}

}
