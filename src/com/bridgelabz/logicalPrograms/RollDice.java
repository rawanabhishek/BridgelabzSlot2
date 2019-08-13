/******************************************************************************
 
 *  Purpose: to print which number falls max time between 1 to 6
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-08-2019
 */
package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RollDice {

	public static void main(String[] args) {
		

		   Scanner  scanner = new Scanner(System.in);
	       Utility utility = new Utility();
	       
	       System.out.println("Enter the Number of time You Want to Roll The Dice :");
	       int num =scanner.nextInt();
	       
	       utility.diceroll(num);
	       scanner.close();
         
	}

}
