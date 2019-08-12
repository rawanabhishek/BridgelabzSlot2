package com.bridgelabz.logicalPrograms;


import com.bridgelabz.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		 
	       Utility utility = new Utility();
	       
	       System.out.println("Enter a value for command line argument : ");
	       System.out.println(args[0]);
	       int n =Integer.parseInt(args[0]);
	       
	      utility.Harmonic(n);

	}

}
