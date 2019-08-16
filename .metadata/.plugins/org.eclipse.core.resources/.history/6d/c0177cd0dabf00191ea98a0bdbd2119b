/******************************************************************************
 
 *  Purpose: to print on which day the particular date falls according to gorgein calander
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalAndLibraries;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
         Utility utility = new Utility();
         
         System.out.println("Enter a date : ");
         int date =scanner.nextInt();
         
         System.out.println("Enter a month : ");
         int month =scanner.nextInt();
         
         System.out.println("Enter a year : ");
         int year=scanner.nextInt();
         
         boolean leapyear =utility.LeapyearChecker(year);
         boolean ValidateDate =utility.DaysWeekstatic(date, month, leapyear);
         
         
         if(ValidateDate) {
       	  int d1=utility.DayValidate(date, month, year);
       	  
       	  switch(d1) {
       	       case 0:
       	    	   System.out.println(" Day is Sunday ");
       	    	   break;
       	    	   
       	       case 1:
       	    	   System.out.println("Day is Monday ");
       	    	   
       	       case 2:
       	    	   System.out.println("Day is Tuesday ");
       	    	   break;
       	       case 3:
       	    	   System.out.println("Day is Wednesday ");
       	    	   break;
       	       case 4:
       	    	   System.out.println("Day is thursday ");
       	    	   break;
       	       case 5:
       	    	   System.out.println(" Day is Friday ");
       	    	   break;
       	       case 6:
       	    	   System.out.println("Day is Saturday ");
       	    	   break;
       		  
       	  }
       	  
       	  
         }
         else {
       	  System.out.println("invalid date");
         }
         scanner.close();
         
	  }
	}


