/******************************************************************************
 
 *  Purpose: To print the repeated number in an array
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.logicalPrograms;

import com.bridgelabz.utility.Utility;

public class Repeated {

	public static void main(String[] args) {
		Utility utility = new Utility();
		
      int array[] =  {1,4,2,5,4,2};
      
      int result = utility.ReaptedArray(array);
      System.out.println("the repeated number is : "+ result);
      
      
      
      
      
	}

}
