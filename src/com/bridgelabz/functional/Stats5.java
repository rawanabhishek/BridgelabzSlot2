package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Stats5 {

	public static void main(String[] args) {
		
		     Utility utility= new Utility();
             
             double value1=Math.random();
             double value2=Math.random();
             double value3=Math.random();
             double value4=Math.random();
             double value5=Math.random();
             
             System.out.println("Random Value  1 is "+value1);
             System.out.println("Random Value  2 is "+value2);
             System.out.println("Random Value  3 is "+value3);
             System.out.println("Random Value  4 is "+value4);
             System.out.println("Random Value  5 is "+value5);
             
             System.out.println();
             System.out.println(utility.Random(value1, value2, value3, value4, value5));
             
             
	}

}
