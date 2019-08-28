package com.bridgelabz.Arrays;

import java.util.Scanner;

import com.bridgelabz.utility.ArraysUtility;

public class HarmonictowDim {

	public static void main(String[] args) {
              Scanner scanner =new Scanner(System.in);
              ArraysUtility utility =new ArraysUtility();
              System.out.println("Enter the Range of harmonic number");
              int range= scanner.nextInt();
              
              double[][] arr=new double [1][range];
              
              for(int i =1 ; i<=range ; i++) {
            	 
            	  arr[0][i-1]=utility.harmonic(i);
              }
              
              for(int i=0;i<range ;i++){
            	  System.out.println(arr[0][i] + " ");
              }
	}

}
