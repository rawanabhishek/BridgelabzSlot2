/******************************************************************************
 
 *  Purpose: To take 3 values from user and perform set of opertions on them to
 *           understand there presedence
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DoubleOpt {

	public static void main(String[] args) {
		Utility utility = new Utility();
		
		double  a, b ,c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		a =scanner.nextDouble();
		System.out.println("Enter the value of b ");
		b=scanner.nextDouble();
		System.out.println("Enter the value of c ");
		c=scanner.nextDouble();
		
		double Operation1= utility.OperationOneDouble(a, b, c);
		double Operation2= utility.OperationTwoDouble(a, b, c);
		double Operation3= utility.OperationThreeDouble(a, b, c);
		double Operation4= utility.OperationFourDouble(a, b, c);
		
		System.out.println("Performing Set of operations");
		System.out.println("a+b*c : "+Operation1);
		System.out.println("a*b+c : "+Operation2);
		System.out.println("c+a/b : "+Operation3);
		System.out.println("a%b+c : "+Operation4);
		
		scanner.close();
		

	}

}
