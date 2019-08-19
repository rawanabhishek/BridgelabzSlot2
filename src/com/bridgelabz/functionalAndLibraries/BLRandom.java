package com.bridgelabz.functionalAndLibraries;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BLRandom {

	public static void main(String[] args) {
       
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();

		System.out.println("Enter seed :");
		long s=scanner.nextLong();
		
		
		//System.out.println("Enter a number  :");
		//int n=scanner.nextInt();
		
		///System.out.println(utility.uniform(n));
		
		//System.out.println("Enter  lowest range  :");
		//double lo=scanner.nextDouble();
		

		//System.out.println("Enter  higest  range  :");
		//double hi=scanner.nextDouble();
		
		///System.out.println(utility.uniform(lo, hi));
		
		
		//System.out.println(" Enter gaussian mean value ");
		//double mu=scanner.nextDouble();
		
		//System.out.println(" Enter gaussian sigma  value ");
		//double sigma =scanner.nextDouble();
		
		//System.out.println(utility.gaussian(20, 20));
		
		//double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
		//System.out.println(utility.discrete(probabilities));
		
		//double [] a = {1.0 ,2.0, 8.0 ,7.0};
		 
		 int n = Integer.parseInt(args[0]);
	        if (args.length == 2) StdRandom.setSeed(Long.parseLong(args[1]));
	        double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
	        int[] frequencies = { 5, 3, 1, 1 };
	        String[] a = "A B C D E F G".split(" ");

	        System.out.println("seed = " + StdRandom.getSeed());
	        for (int i = 0; i < n; i++) {
	            System.out.printf("%2d ",   uniform(100));
	            System.out.printf("%8.5f ", uniform(10.0, 99.0));
	            System.out.printf("%5b ",   bernoulli(0.5));
	            System.out.printf("%7.5f ", gaussian(9.0, 0.2));
	            System.out.printf("%1d ",   discrete(probabilities));
	            System.out.printf("%1d ",   discrete(frequencies));
	            System.out.printf("%11d ",  uniform(100000000000L));
	            StdRandom.shuffle(a);
	            for (String s : a)
	                System.out.print(s);
	            System.out.println();
		
		
	}

}
