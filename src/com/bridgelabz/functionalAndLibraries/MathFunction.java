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
	       System.out.println("Enter your Choice"
	       		+ " \n 1 :for harmonic number"
	       		+ "\n 2 : sin of an angle"
	       		+ "\n 3 : cosine of an angle"
	       		+ "\n 4 :  binary conversion"
	       		+ "\n 5 : squareroot of a number"
	       		+ "\n 6: to check prime number"
	       		+ "\n 7: to print factorial"
	       		+ "\n 8: futureValue"
	       		+ "\n 9: present value"
	       		+ "\n 10: min max of an ineger"
	       		+ "\n 11: min max of a string"
	       		+ "\n 12: collinear "  );
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
		 		                     
		 		
	       
	       case 10:
	    	   System.out.println("Printing min and max from integer array");
				//min max from integer array
				int [] numberArray= {4,6,1,2,5};
	            System.out.println("the min number is : "+utility.MinValue(numberArray));
	            System.out.println();
	            System.out.println("Thwe max value is : "+utility.MaxValue(numberArray));
	            
	           

	       case 11:
	    	   System.out.println("Printing min and max from String  array");
				//min max from String array
	    	   String[] strArr= {"abhishe","rupesh","vishal","Vinay"};
	            System.out.println("the min number is : "+utility.minValue(strArr));
	            System.out.println();
	            System.out.println("Thwe max value is : "+utility.maxValue(strArr));
	            
	       case 12:
				System.out.println("Collinear slope and triangle");
				System.out.println("Enter value of 3 point");
				int x1,y1,x2,y2,x3,y3;
				System.out.println("x1=");
				x1=scanner.nextInt();
				System.out.println("y1=");
				y1=scanner.nextInt();
				System.out.println("x2=");
				x2=scanner.nextInt();
				System.out.println("y2=");
				y2=scanner.nextInt();
				System.out.println("x3=");
				x3=scanner.nextInt();
				System.out.println("y3=");
				y3=scanner.nextInt();
				if(Utility.checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) 
					System.out.println("Points are collinear");
				else 
					System.out.println("Points are non -  collinear");
				if(Utility.checkCollinearUsingArea(x1, y1, x2, y2, x3, y3)) 
					System.out.println("Area of triangle are collinear");
				else 
					System.out.println("Area of triangle are not collinear");  
	            
	       }
	       }

}


