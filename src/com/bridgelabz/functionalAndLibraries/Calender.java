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
               String[] months = {
                 "",                               
                 "January", "February", "March",
                 "April", "May", "June",
                 "July", "August", "September",
                 "October", "November", "December"
             };

            
             int[] days = {
                 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
             };

            
             if (month == 2 && leapyear) days[month] = 29;


            
             System.out.println("   " + months[month] + " " + year);
             System.out.println(" Su Mo Tu We Th Fi Sa");

             
             int d2 =utility.DayValidate(1, month, year) ;

             // print the calendar
             for (int i = 0; i < d2; i++)
                 System.out.print("   ");
             for (int i = 1; i <= days[month]; i++) {
            	 if( i<=9) {
            		 System.out.print("  "+i);
            	 }
            	 else {
            		 System.out.print(" "+i);
            	 }
                 //System.out.printf("%2d ", i);
                 if (((i + d2) % 7 == 0) || (i == days[month])) System.out.println();
             }
         scanner.close();
         
	  }
	}


