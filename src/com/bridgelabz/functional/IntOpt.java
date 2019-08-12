/******************************************************************************
 
 *  Purpose: To take 3 values from user and perform set of opertions on them to
 *           understand there presedence
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class IntOpt {
	public static void main(String[] args) {

	Utility utility= new Utility();
	
	int a, b ,c;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the value of a ");
	a =scanner.nextInt();
	System.out.println("Enter the value of b ");
	b=scanner.nextInt();
	System.out.println("Enter the value of c ");
	c=scanner.nextInt();
	
	int Operation1 = utility.OperationOne(a, b, c);
	int Operation2 = utility.OperationTwo(a, b, c);
	int Operation3 = utility.OperationThree(a, b, c);
	int Operation4 = utility.OperationFour(a, b, c);
	
	System.out.println("Performing Set of operations");
	System.out.println("a+b*c : "+Operation1);
	System.out.println("a*b+c : "+Operation2);
	System.out.println("c+a/b : "+Operation3);
	System.out.println("a%b+c : "+Operation4);
    
    scanner.close();
	
	}
}
