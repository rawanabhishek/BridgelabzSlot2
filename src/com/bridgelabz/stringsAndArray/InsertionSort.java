package com.bridgelabz.stringsAndArray;

public class InsertionSort {

	public static void main(String[] args) {
		 String arr[]= {"abhii", "babu", "akansh" ,"baudi","vinay"};
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
