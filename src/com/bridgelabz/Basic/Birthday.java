package com.bridgelabz.Basic;

import java.util.Arrays;

public class Birthday {

	public static void main(String[] args) {
		int n=10;
		int month[]=new int [n];
    	//int year[]=new int [n];
    	//int date[]=new int [n];
    	
    	String individual[]= new String[n];
         for(int i=0 ;i<n;i++) {
        	int  Monthvalue=(int)(Math.random()*12)+1;
        	int YearValue=(int)(Math.random()*2)+91;
        	int DateValue=(int)(Math.random()*31);
        	
        	 month[i]=Monthvalue;
        	// year[i]=YearValue;
        	// date[i]=DateValue;
        	 
        	 individual[i]=Monthvalue+"/ "+ YearValue+" / "+DateValue;
        	 
         }
         Arrays.sort(individual);
         Arrays.sort(month);
        // for(int i=0 ; i<n ;i++) {
        //	 System.out.println(individual[i]);
        // }
       //  int i =0;
      
        	// while((month[i]== month[i+1] )&& (i<n)) {
        	//	 System.out.println(month[i]+" "+year[i]+" "+date[i]);
        	//	 i++;
        	// }
     Repeated(individual ,month ,0 , n-1);
        
         
         }
	   static void Repeated(String individual[] , int month[] ,int li ,int hi) {
		   int count=0;
		   int mi=(li+hi)/2;
		   while(li<hi) {
			   //count++;
			   
	        	 if(month[mi]!=mi+1) {
	        	   	  if(mi>0 && month[mi]==month[mi+1]) {
	        	   		  System.out.println(individual[mi]);
	        	   		 break;
	        	   	  }
	        	   	  Repeated(individual,month,li,mi-1);
	        	     }
	        	     Repeated(individual,month,mi+1,hi);
	        	     
	        		 }
	         
	   }
	}


