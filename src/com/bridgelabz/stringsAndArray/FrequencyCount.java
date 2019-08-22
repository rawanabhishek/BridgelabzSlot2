/******************************************************************************
 
 *  Purpose: To Print the frquency count of a string
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   22-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.stringsAndArray;

import com.bridgelabz.utility.SortUtility;

public class FrequencyCount {

	public static void main(String[] args) {
		SortUtility utility = new SortUtility();
		String str=( "To Be Or Not To Be ");
		String strArr[]= str.split(" ");
		utility.sort(strArr, 0, strArr.length-1);
		
		System.out.println("The Sorted array is : ");
		for(int i =0; i<strArr.length;i++)  
		{  
		    System.out.print(strArr[i]+" ");  
		}  
		System.out.println();
      utility.frequencyCount(strArr);
	}

}
