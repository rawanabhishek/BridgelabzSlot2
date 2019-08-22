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
		    	for(int j=i+1;j<arr.length;j++) {
		    		
		    		if(arr[i].compareTo(arr[j])>0) {
		    			
		    			temp=arr[i];
		    			arr[i]=arr[j];
		    			arr[j]=temp;
		    			
		    		}
		    		
		    	}
		    	
		    }
		    
		    System.out.println("The sorted order is :");
		    for(int i = 0 ;i<arr.length;i++) {
		    	sort=sort+ " "+arr[i];
		    	//System.out.println(sort);
		    }
		    
		    System.out.println(sort);
	}

}
