package com.bridgelabz.Basic;

public class Birthday {

	public static void main(String[] args) {
		int n=50;
		int month[]=new int [n];
    	int year[]=new int [n];
    	int date[]=new int [n];
    	
    	
         for(int i=0 ;i<50;i++) {
        	int  Monthvalue=(int)(Math.random()*12)+1;
        	int YearValue=(int)(Math.random()*2)+91;
        	int DateValue=(int)(Math.random()*31);
        	
        	 month[i]=Monthvalue;
        	 year[i]=YearValue;
        	 date[i]=DateValue;
        	 
         }
         int i =0;
      
        	 while((month[i]== month[i+1] )&& (i<n)) {
        		 System.out.println(month[i]+" "+year[i]+" "+date[i]);
        		 i++;
        	 }
         }
	}


