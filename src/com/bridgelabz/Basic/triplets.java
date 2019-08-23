package com.bridgelabz.Basic;

class triplets{ 
	// Prints all triplets in arr[] with 0 sum 
	static void findTriplets(int[] arr, int n) 
	{ 
	    int found = 0; 
	    for (int i=0; i<n-2; i++) 
	    { 
	        for (int j=i+1; j<n-1; j++) 
	        { 
	            for (int k=j+1; k<n; k++) 
	            { 
	                if (arr[i]+arr[j]+arr[k] == 0) 
	                { 
	                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]); 
	              
	                    found++; 
	                } 
	            } 
	        } 
	    } 
	  
	    // If no triplet with 0 sum found in array 
	    if (found == 0) 
	        System.out.println(" not exist "); 
	  
	} 
	  
	// Driver code 
	public static void main(String[] args) 
	{ 
	    int arr[] = {0, -1, 2, -3, 1}; 
	    int n =arr.length; 
	    findTriplets(arr, n); 
	  
	} 
	} 