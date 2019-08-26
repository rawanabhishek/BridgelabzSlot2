package com.bridgelabz.RegularExpressions;

import java.util.Scanner;

import com.bridgelabz.utility.RegularExpressionsUtility;

public class NameMobile {

	public static void main(String[] args) {
	    RegularExpressionsUtility utility = new RegularExpressionsUtility();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=scanner.next();
		System.out.println("Enter your Full Name : ");
        String fullname=scanner.next();
		
		String str =("Hello <<name>>, We have your full name\n" + 
				"as <<full name>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\n" + 
				"know in case of any clarification Thank you BridgeLabz 01/01/2016. Use Regex to\n" + 
				"replace name, full name, Mobile#, and Date with proper value.");
		
		System.out.println();
		

		utility.paragraph(str, name, fullname);

	}

}
