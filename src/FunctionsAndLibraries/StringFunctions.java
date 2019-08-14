package FunctionsAndLibraries;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringFunctions {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
	       Utility utility = new Utility();
	       
	      
	      		   
	       
	       System.out.println("Enter String 1 : ");
	       String one =scanner.nextLine();
	       
	       System.out.println("Enter String 2 : ");
	       String two =scanner.nextLine();
	       
	     
	       
	       if(utility.Anagram(one, two)) {
				System.out.println("the given strings are anagram ");
			}
			else {
				System.out.println("the given strings are not anagram ");
			}
	       
	        System.out.println();
	 
	       System.out.println("Enter String  to check pallindrom  : ");
	       String pallindrome =scanner.nextLine();
	       scanner.close();
	       
	       
	         System.out.println(utility.pallindrom(pallindrome));
	      
	       
	       
	       
	}

}
