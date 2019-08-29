package com.bridgelabz.Arrays;

import java.util.Scanner;

public class MatrixTwoDim {

	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter the value of row and columns for 1 st matrix ");
         int r1=scanner.nextInt();
         int c1=scanner.nextInt();
         
         System.out.println("Enter the value of  row and column for second matrix  ");
         int r2=scanner.nextInt();
         int c2=scanner.nextInt();
         
         if(r2==c1) {
        	 int A[][]=new int [r1][c1];
        	 int B[][]=new int [r2][c2];
        	 int result[][]=new int [r1][c2];
        	 
        	 
        	 System.out.println("Enter the value for 1st matrix ");
        	 
        	 for(int i=0 ;i<r1 ;i++) {
        		 for(int j=0;j<c1;j++) {
        			 System.out.println(i+" "+j+"  : ");
        			 A[i][j]=scanner.nextInt();
        		 }
        		 System.out.println();
        	 }
        	 
        	 System.out.println("the first matrix is ");
        	 
        	 for(int i=0 ;i<r1 ;i++) {
        		 for(int j=0;j<c1;j++) {
        			 System.out.print(A[i][j]+" ");
        			 
        		 }
        		 System.out.println();
        	 }

        	 System.out.println("Enter the value for 2nd matrix ");
        	 
        	 for(int i=0 ;i<r2 ;i++) {
        		 for(int j=0;j<c2;j++) {
        			 System.out.println(i+" "+j+"  : ");
        			 B[i][j]=scanner.nextInt();
        		 }
        		 System.out.println();
        	 }
        	 
             System.out.println("the second matrix is ");
        	 
        	 for(int i=0 ;i<r2 ;i++) {
        		 for(int j=0;j<c2;j++) {
        			 System.out.print(B[i][j]+" ");
        			 
        		 }
        		 System.out.println();
        	 }
        	 
        	 System.out.println("the multiplication is ");
        	 
        	 for(int i=0;i<r1;i++){    
        		 for(int j=0;j<c2;j++){    
        		 result[i][j]=0;      
        		 for(int k=0;k<r2;k++)      
        		 {      
        		 result[i][j]+=A[i][k]*B[k][j];      
        		 }//end of k loop  
        		 }}
        	 
        	 System.out.println();
        	 System.out.println("Result of  matrix multiplication is : ");
 			for (int i = 0; i < r1; i++) {
 				for (int j = 0; j < c2; j++) {
 					System.out.print(result[i][j]+" ");
 				}
 				System.out.println();
 			}

        	 
         }
	}

}
