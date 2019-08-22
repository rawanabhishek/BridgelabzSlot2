/******************************************************************************
 
 *  Purpose:  to perform insertion sort on the given string
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.stringsAndArray;

public class InsertionSort {

	public static void main(String[] args) {
		 String arr[]= {"five", "one", "six" ,"two","four", "three"};
		    String temp;
		    String sort="";
		    for(int i =0 ; i<arr.length ; i++) {
		    	String key =arr[i];
		    	int j=i-1;
		    	while((j>=0) && (arr[j].compareTo(key)>0)) {
		    		
		    		arr[j+1]=arr[j];
		    		j=j-1;
		    	}
		    	arr[j+1]=key;
		    	}
		    
		    System.out.println("The sorted order is :");
		    for(int j = 0 ;j<arr.length;j++) {
		    	sort=sort+ " "+arr[j];
		    	//System.out.println(sort);
		    }
		    
		    System.out.println(sort);
	}

}
