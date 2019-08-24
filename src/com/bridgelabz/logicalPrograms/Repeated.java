/******************************************************************************
 
 *  Purpose: To print the repeated number in an array
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.logicalPrograms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class Repeated {

	public static void main(String[] args) {
		Utility utility = new Utility();
		
      int array[] =  {1,2,3,4,5,5,6};
    //  Arrays.sort(array);
      //int result = utility.ReaptedArray(array);
           
      int index=findRepeated(array,0,array.length-1);
      if(index !=-1){
      System.out.println(array[index]);
     
      }
	}
	
	 static int findRepeated(int array[], int low , int high) {
     //int low =0;
    // int high=array.length-1;
     int mid=(low+high)/2;
     
     if(array[mid]!=mid+1) {
   	  if(mid>0 && array[mid]==array[mid+1]) {
   		  return mid;
   	  }
   	  return findRepeated(array,low,mid-1);
     }
     return findRepeated(array,mid+1,high);
     
	 }

}
