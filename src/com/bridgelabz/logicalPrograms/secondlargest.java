/******************************************************************************
 
 *  Purpose: To Print the 2nd largest and 2nd smallest number from a unsorted array
 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.logicalPrograms;

import com.bridgelabz.utility.Utility;

public class secondlargest {

	public static void main(String[] args) {
        Utility utility = new Utility();
		int arr[]= { 1,4,6,5,8,9,2};
		
		System.out.println("The Second Largest Number is : "+utility.secondlarge(arr));
		System.out.println();
		
		System.out.println("The Second Smallest Number is : "+utility.secondsmallest(arr));
		
	}

}
