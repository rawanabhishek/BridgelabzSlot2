package com.bridgelabz.Basic;

import java.util.Arrays;

public class Birthday {

	public static void main(String[] args) {
		int n=10;
		int month[]=new int [n];
		int year[]=new int[n];
		int date[]=new int[n];
    
    	
    	String individual[]= new String[n];
         for(int i=0 ;i<n;i++) {
        	int  Monthvalue=(int)(Math.random()*12)+1;
        	int YearValue=(int)(Math.random()*2)+91;
        	int DateValue=(int)(Math.random()*31);
        	
        	 month[i]=Monthvalue;
        	 year[i]=YearValue;
        	 date[i]=DateValue;
        	 
        
        	 
        	 individual[i]=Monthvalue+"/ "+ YearValue+" / "+DateValue;
        	
         }
         Arrays.sort(individual);
         int temp=0;
         for(int i=1;i<n;i++) {
        	 int key=i;
        	 int li=0;
        	 int hi=n-1;
        	 int mi=(li+hi)/2;
        	 while(li<hi) {
        	      	if(individual[mi].equals(individual[key])) {
        	      		System.out.println("the month  "+key+"has been repeated");
        	      		break;
        	       	}
        	      	else if(individual[key].compareTo(individual[mi])>0) {
        	     		li=mi+1;
        	      	}
        	     		
        	     	  else {
        	       		hi=mi-1;
        	       	}
        	      	
        	      	mi=(li+hi)/2;
        	      	        }
        	 
        	 
         }
         
//         for(int i=0;i<n;i++) {
//        	 System.out.println( individual[i]);
//         }
//         
//         for(int i=0;i<n;i++) {
//        	 for(int j=i+1;j<n;j++) {
//        		 if(month[i]==month[j]) {
//        			 System.out.println(month[i]+"/"+date[i]+"/"+year[i]+" and " +month[j]+"/"+date[j]+"/"+year[j]);
//        			// break;
//        		 }
//        	 }
//         }
         
//         
//         for(int i=0;i<n;i++) {
//        	 System.out.println( individual[i]);
//         }
//         
//        // Repeated(individual ,month ,0 , n-1);
      
    
     
        
         
         }
//	   static void Repeated(String individual[] , int month[] ,int li ,int hi) {
//		
//		   int mi=(li+hi)/2;
//		   int ser=mi;
//		   while(li<=hi) {
//			 
//			   if(month[mi+1]=ser) {
////	        	 if(month[mi]!=mi+1) {
////	        	   	  if(mi>0 && month[mi]==month[mi+1]) {
////	        	   		  System.out.println(individual[mi]);
////	        	   		 
////	        	   	  }
////	        	   	  Repeated(individual,month,li,mi-1);
////	        	     }
////	        	     Repeated(individual,month,mi+1,hi);
////	        	     break;
////	        		 }
//		 
//	         
//	   }
	}


