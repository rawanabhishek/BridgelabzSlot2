package com.bridgelabz.functionalAndLibraries;


import com.bridgelabz.utility.StdRandom;





public class BLRandom {

	public static void main(String[] args) {
       
		
		StdRandom utility = new StdRandom();

		
		    int n = Integer.parseInt("1");
	        if (args.length == 2) utility.setSeed(Long.parseLong(args[1]));
	        double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
	        String[] a = "A B C D E F G".split(" ");

	       
	        for (int i = 0; i < n; i++) {
	            System.out.printf("%2d ",   utility.uniform(100));
	            System.out.printf("%8.5f ", utility.uniform(10.0, 99.0));
	            System.out.printf("%5b ",   utility.bernoulli(0.5));
	            System.out.printf("%7.5f ", utility.gaussian(9.0, 0.2));
	            System.out.printf("%1d ",   utility.discrete(probabilities));
	           
	            StdRandom.shuffle(a);
	            for (String s : a) {
	                System.out.print(s);
	             System.out.println();
	        }
	        }
	}

}
