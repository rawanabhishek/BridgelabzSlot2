/******************************************************************************
 
 *  Purpose: To Check Weather the Given Date Lies Between Spring Season Or Not If Yess print true And if not 
 *           print false 

 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SpringSeason {

	public static void main(String[] args) {
      int month , date;
      Scanner scanner = new Scanner(System.in);
      Utility utility = new Utility();
      System.out.println("Enter A Month : ");
      month =scanner.nextInt();
      System.out.println("Enter A Date : ");
      date= scanner.nextInt();
      System.out.println(" ");
      System.out.println(utility.SpringSeason(month, date));
      
      
      scanner.close();

	}

}
