package com.bridgelabz.functionalAndLibraries;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Permutation 
{ 
	public static void main(String[] args) {
	Scanner  scanner = new Scanner(System.in);
    Utility utility = new Utility();
    
    System.out.println("Enter a String");
    String s= scanner.nextLine();
    
    System.out.println("Iterative Permutation of String is : ");
    
    // calling  iterative permutation function 
    utility.permutations(s);
    
    System.out.println();
    System.out.println();
    
    
    System.out.println("Recursive Permutation of String is : ");
    
    // calling  recursive permutation function
    utility.printPermutn(s, "");
    
    System.out.println();
    System.out.println();
    
    utility.permutationCompare();
    
    
    
    
    
    scanner.close();
    
    
    
    
    
	}
  
} 
    
    