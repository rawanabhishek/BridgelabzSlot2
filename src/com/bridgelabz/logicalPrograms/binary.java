/******************************************************************************
 
 *  Purpose: To Print the given deciaml number to binary number
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class binary {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
	       Utility utility = new Utility();
	       
	       System.out.println("Enter a number you want to convert into Binary : ");
	       int num = scanner.nextInt();
	       
	       utility.decimaltobinary(num);
	       
	       System.out.println();
	       int z= utility.swapnibble(num);
	       System.out.println("result" +z);
	       scanner.close();
	}

}
