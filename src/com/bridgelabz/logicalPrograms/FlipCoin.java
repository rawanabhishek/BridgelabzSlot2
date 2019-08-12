
package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
       Scanner  scanner = new Scanner(System.in);
       Utility utility = new Utility();
       int flip;
       System.out.println("Enter the Number of times you want to flip Coin : ");
       flip =scanner.nextInt();
       System.out.println(utility.Coin(flip));
       scanner.close();
	}

}