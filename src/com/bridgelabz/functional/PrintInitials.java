/******************************************************************************
 
 *  Purpose: To Print The Initials using 9 rows of asterisks
 

 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

public class PrintInitials {

	public static void main(String[] args) {
		
		for(int i =0;i<=8;i++) {
			for(int j=0;j<13;j++) {
				if((i==0 || i==8 ) && (j==0 || j==1 || j==10 || j==11 || j==12)){
					System.out.print("*");
				}
				else if((i==1 || i==7)&& (j==0 || j==1 || j==8 || j==9 || j==10)){
					System.out.print("*");
					
				}
				else if((i==2 || i==6)&& (j==0 || j==1 || j==6 || j==7 || j==8)){
					System.out.print("*");
					
				}
				else if((i==3 || i==5)&& (j==0 || j==1 || j==4 || j==5 || j==6)){
					System.out.print("*");
					
				}
				else if((i==4  )&& (j==0 || j==1 || j==2 || j==3 || j==4 || j==5)){
					System.out.print("*");
					
				}
				
				
				
				else {
					System.out.print(" ");
				}
				
			}	
			
			//to print space
			System.out.print("  ");
			
			//to print D 
			
			for(int j=0 ;j<=13 ; j++) {
				if((i==0 || i==8 ) && (j==0 || j==1 || j==2 || j==3 || j==4 || j==5 || j==6 || j==7 || j==8 || j==9)){
					System.out.print("*");
				
			     }
				else if((i==1 || i==7)&& (j==0 || j==1 || j==10 ||  j==11)){
					System.out.print("*");
					
				}
				else if((i==2 || i==6)&& (j==0 || j==1 || j==11 || j==12)){
					System.out.print("*");
					
				}
				else if((i==3 || i==4 || i==5)&& (j==0 || j==1 || j==12 || j==13 )){
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
		
		}
			
			//to print space
			System.out.print("  ");
			
			//to print W 
			
			for(int j=0 ;j<=30 ; j++) {
				if((i==0  ) && (j==0 || j==1 || j==15 || j==29 || j==30 )){
					System.out.print("*");
				
			     }
				
				else if((i==1 )&& (j==1 || j==2 || j==14 || j==15 || j==16 || j==28 || j==29)){
					System.out.print("*");
					
				}
				else if((i==2 )&& (j==2 || j==3 || j==13 || j==14 || j==16 || j==17 || j==28 || j==27 )){
					System.out.print("*");
					
				}
				else if((i==3 )&& (j==3 || j==4 || j==12 || j==13 || j==17 || j==18 ||  j==26 || j==27)){
					System.out.print("*");
					
				}
				else if((i==4 )&& (j==4 || j==5 || j==11 || j==12 || j==18 || j==19 || j==25 || j==26 )){
					System.out.print("*");
					
				}
				else if((i==5 )&& (j==5 || j==6 || j==10 || j==11 || j==19 || j==20 || j==24 || j==25 )){
					System.out.print("*");
					
				}
				else if((i==6 )&& (j==6 || j==7 || j==9 || j==10 || j==20 || j==21 || j==23 || j==24 )){
					System.out.print("*");
					
				}
				else if((i==7 )&& ( j==7 || j==8 || j==9 || j==21 || j==22 || j==23 )){
					System.out.print("*");
					
				}
				else if((i==8 )&& ( j==8 || j==22 )){
					System.out.print("*");
					
				}
				
				else {
					System.out.print(" ");
				}
		
		}
			System.out.println();
			
	}

 }
}
