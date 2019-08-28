/******************************************************************************
 
 *  Purpose: to print the repated number in a given array 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.Arrays;

import com.bridgelabz.utility.ArraysUtility;

public class RepeatedNumberArray {
	public static void main(String[] args)  
    { 
		  ArraysUtility utility =new ArraysUtility();
        int  arr[] = {1, 2, 3, 4, 5 ,5}; 
        int index[]=new int [ 1];
        index[0] = utility.findRepeatingElement(arr, 0, arr.length-1);
        if (index[0] != -1) 
            System.out.println(index[0]); 
    } 
}
