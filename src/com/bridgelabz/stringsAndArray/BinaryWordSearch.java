/******************************************************************************
 
 *  Purpose:  to perform binary search on the given string
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.stringsAndArray;

import java.util.Arrays;

public class BinaryWordSearch {

	public static void main(String[] args) {
		
	    String arr[]= {"abhii", "babu", "akansh" ,"baudi","vinay"};
	    String temp;
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
	    	System.out.println(arr[i]);
	    }
	    
	    System.out.println();
	    
    
	    int len =arr.length;
      int li=0;
       int hi=len-1;
       int  mi=(li+hi)/2;
      String item ="vinay";
      
      while(li<=hi) {
      	if(arr[mi].equals(item)) {
      		System.out.println("the string is at "+mi+" index position ");
      		break;
       	}
      	else if(item.compareTo(arr[mi])>0) {
     		li=mi+1;
      	}
     		
     	  else {
       		hi=mi-1;
       	}
      	
      	mi=(li+hi)/2;
      	        }
      
     if(li>hi) {
     	System.out.println("element not found ");
      }
        
	}

}
