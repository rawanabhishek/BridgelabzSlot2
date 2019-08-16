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
		 	       double result=utility.Square(squareroot, epsilon);
		 	       System.out.println("the square root of : "+squareroot+ " is "+result);
		 	       
		 		}
		 		else {
		 			System.out.println("Enter a positive integer ");
		 		}
	       
	       
	       }
	}

}
