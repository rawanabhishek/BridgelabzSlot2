package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		
             Scanner scanner = new Scanner(System.in);
             Utility utility = new Utility();
             Double a , b, c;
             
             System.out.println("Enter the value of a : ");
             a=scanner.nextDouble();
             
             System.out.println("Enter the value of b : ");
             b=scanner.nextDouble();
             
             System.out.println("Enter the value of c : ");
             c=scanner.nextDouble();
             
             System.out.println(" ");
             System.out.println(utility.Quadratic(a, b, c));
             
             
             scanner.close();
             
             
             
	}

}
