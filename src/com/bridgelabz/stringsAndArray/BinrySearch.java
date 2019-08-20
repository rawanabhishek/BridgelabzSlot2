package com.bridgelabz.stringsAndArray;

public class BinrySearch {

	public static void main(String[] args) {
         int arr[]= {1,2,3,5,6,7,9};
         int len =arr.length;
         int li=0;
         int hi=len-1;
         int  mi=(li+hi)/2;
         int item =7;
         
        while(li<=hi) {
        	if(arr[mi]==item) {
        		System.out.println("the element is at "+mi+" index position ");
        		break;
        	}
        	else if(arr[mi]<item) {
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
