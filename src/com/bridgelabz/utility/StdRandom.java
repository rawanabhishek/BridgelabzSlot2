package com.bridgelabz.utility;

import java.util.Random;

public class StdRandom {
    /********************************************************************************************************

	   Purpose: Function to 
	   
	   */
     private static Random random;    // pseudo-random number generator
     private static long seed;        // pseudo-random number generator seed

     static {
         // this is how the seed was set in Java 1.4
         seed = System.currentTimeMillis();
         random = new Random(seed);
     }
     
     public void setSeed(long s) {
         seed   = s;
         random = new Random(seed);
     }

     
     public static long getSeed() {
         return seed;
     }
     
  
     /********************************************************************************************************

	   Purpose: Function to print random number 
	   
	   */
     
     
     public static int uniform(int n) {
         if (n <= 0) throw new IllegalArgumentException("argument must be positive: " + n);
         
		return random.nextInt(n);
     }
     

     /********************************************************************************************************

	   Purpose: Function to return uniform number 
	   
	   */
     public static double uniform() {
         return random.nextDouble();
     }

     /********************************************************************************************************

	   Purpose: Function for return uniform value between a range 
	   
	   */
     
     public static double uniform(double a, double b) {
         if (!(a < b)) {
             throw new IllegalArgumentException("invalid range: [" + a + ", " + b + ")");
         }
         return a + uniform() * (b-a);
     }

     
     /********************************************************************************************************

	   Purpose: Function for gaussian
	   
	   */
     public static double gaussian() {
       
         double r, x, y;
         do {
             x = uniform(-1.0, 1.0);
             y = uniform(-1.0, 1.0);
             r = x*x + y*y;
         } while (r >= 1 || r == 0);
         return x * Math.sqrt(-2 * Math.log(r) / r);
    
     }
     
     /********************************************************************************************************

	   Purpose: Function  to return gaussian value 
	   
	   */
     public double gaussian(double mu, double sigma) {
         return mu + sigma * gaussian();
     }
     
     /********************************************************************************************************

	   Purpose: Function for to return bernoulli value 
	   
	   */
     
     public boolean bernoulli(double p) {
         if (!(p >= 0.0 && p <= 1.0))
             throw new IllegalArgumentException("probability p must be between 0.0 and 1.0: " + p);
         return uniform() < p;
     }
     
     /********************************************************************************************************

	   Purpose: Function for to return discrete value 
	   
	   */
     public int discrete(double[] probabilities) {
         if (probabilities == null) throw new IllegalArgumentException("argument array is null");
         double EPSILON = 1.0E-14;
         double sum = 0.0;
         for (int i = 0; i < probabilities.length; i++) {
             if (!(probabilities[i] >= 0.0))
                 throw new IllegalArgumentException("array entry " + i + " must be nonnegative: " + probabilities[i]);
             sum += probabilities[i];
         }
         if (sum > 1.0 + EPSILON || sum < 1.0 - EPSILON)
             throw new IllegalArgumentException("sum of array entries does not approximately equal 1.0: " + sum);

         // the for loop may not return a value when both r is (nearly) 1.0 and when the
         // cumulative sum is less than 1.0 (as a result of floating-point roundoff error)
         while (true) {
             double r = uniform();
             sum = 0.0;
             for (int i = 0; i < probabilities.length; i++) {
                 sum = sum + probabilities[i];
                 if (sum > r) return i;
             }
         }
     }
     
     /********************************************************************************************************

	   Purpose: Function for shuffle an array 
	   
	   */
     
     public static void shuffle(Object[] a) {
         int n = a.length;
         for (int i = 0; i < n; i++) {
             int r = i + uniform(n-i);     // between i and n-1
             Object temp = a[i];
             a[i] = a[r];
             a[r] = temp;
         }
     }


}
