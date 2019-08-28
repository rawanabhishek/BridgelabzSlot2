/******************************************************************************
 
 *  Purpose: to print the power of two 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   28-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.Arrays;

import com.bridgelabz.utility.ArraysUtility;

public class PowerOf2Arrays {

	public static void main(String[] args) {
		ArraysUtility utility =new ArraysUtility();
		int range=Integer.parseInt("8");
		
		int arr[][]=new int [2][range];
		int count1=0 ;
		int count2=0;
		for(int i=0;i<range;i++) {
		     int value=utility.Power(i);
		     if(value >0 && value<10) {
		    	 arr[0][i]=value;
		    	 count1++;
		     }
		     else if(value > 9 && value !=0) {
		    	 arr[1][i-count1]=value;
		    	 count2++;
		     }
		}
		System.out.println("The Unit Values are : ");
	
		for(int i=0; i<count1;i++) {
		
			System.out.println(arr[0][i]);
		}
		System.out.println();
		System.out.println("The tens Values are : ");
		
		for(int i=0; i<count2;i++) {
			
			System.out.println(arr[1][i]);
		}

	}

}
