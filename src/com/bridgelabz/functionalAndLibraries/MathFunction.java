/******************************************************************************
 
 *  Purpose: to perform various MathFunction
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   16-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalAndLibraries;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MathFunction {

	public static void main(String[] args) {
		 Scanner  scanner = new Scanner(System.in);
	       Utility utility = new Utility();
	       System.out.println("Enter your Choice ");
	       int choice = scanner.nextInt();
	       
	       System.out.println();
	       
	       switch(choice) {
	       
	       case 1:
	    	   System.out.println("Enter a number ");
		       int n = scanner.nextInt();
	    	   utility.Harmonic(n);
	    	   
	       case 2:
	    	   System.out.println("Enter an angle");
	    	   double anglesin=scanner.nextDouble();
	    	   System.out.println( utility.Sin(anglesin));
	    	   
	    	   
	       case 3:
	    	   System.out.println("Enter an angle");
	    	   double anglecosine=scanner.nextDouble();
	    	   System.out.println( utility.cosine(anglecosine));
	    	   
	       case 4:
	    	   System.out.println("Enter a number to convert into binary ");
		       int num = scanner.nextInt();
		       utility.decimaltobinary(num);
		       
	       case 5:
	    	   double epsilon =1e-15;
	    	   System.out.println("Enter a number to check its square root ");
		        double squareroot = scanner.nextDouble();
		        if(squareroot>0) {
		 	     System.out.println("the square root is "+utility.Square(squareroot, epsilon));
		        }
		        else {
		 			System.out.println("Enter a positive integer ");
		 		}
		 	     
		 	 case 6:
		 		System.out.println("Enter a number to check it is Prime or Not ");
		        int prime = scanner.nextInt();
		        boolean result =utility.primechecker(prime);
		        if(result) {
		        	System.out.println("The given number is Prime Number ");
		        }
		        else {
		        	System.out.println("The given number is not a Prime Number");
		        }
		 	      
                         case 7:   
		 		System.out.println("Enter a number to print its factorial");
		        int mathfactorial = scanner.nextInt();
		 	     System.out.println("Factorial of "+mathfactorial+"is "+utility.Factorial(mathfactorial));  
		 	     
		 	     
		 	case 8:
	    	         System.out.println("Enter Amount");
		        int amountfuture = scanner.nextInt();
		        System.out.println("Enter Interst rate");
		        int interestfuture= scanner.nextInt();
		        System.out.println("Enter time in years");
		        int periodfuture = scanner.nextInt();
		        System.out.println("The future amount is : "+utility.futurevalue(amountfuture, interestfuture, periodfuture));
		        
		        
		 	case 9:
	    	        System.out.println("Enter Amount");
		        int amountpresent = scanner.nextInt();
		        System.out.println("Enter Interst rate");
		        int interestpresent= scanner.nextInt();
		        System.out.println("Enter time in years");
		        int periodpresent= scanner.nextInt();
		        System.out.println("The present amount is : "+utility.presentvalue(amountpresent, interestpresent, periodpresent));
		 	                   
		 		
	        
		 		}                     
		 		
	       
	       
	       }

}


