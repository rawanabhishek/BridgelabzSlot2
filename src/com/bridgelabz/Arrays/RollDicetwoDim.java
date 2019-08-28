package com.bridgelabz.Arrays;

import java.util.Scanner;

import com.bridgelabz.utility.ArraysUtility;

public class RollDicetwoDim {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
        ArraysUtility utility =new ArraysUtility();
        System.out.println("Enter the number of time you want to roll dice :");
        int range= scanner.nextInt();
        
        
        int arr[][]=new int [2][6];
        
        for(int i =0 ; i<6 ; i++) {
       	    arr[0][i]=i+1;
       	    arr[1][i]=0;
      	 
        }
        
        for(int i=0;i<range ;i++){
      	  int roll=utility.DiceRoll(range);
      	  switch(roll) {
      	  case 1:
      		  arr[1][0]=arr[1][0]+1;
      		  break;
      		  
      	  case 2 :
      		  arr[1][1]=arr[1][1]+1;
      		  break;
      		  
      	 case 3 :
     		  arr[1][2]=arr[1][2]+1;
     		  break;
     		  
      	 case 4 :
     		  arr[1][3]=arr[1][3]+1;
     		  break;
     		  
      	 case 5 :
     		  arr[1][4]=arr[1][4]+1;
     		  break;
     		  
      	 case 6 :
     		  arr[1][5]=arr[1][5]+1;
     		  break;
      		  
      	  }
        }
        
        for(int i=0 ;i<6;i++) {
        	System.out.print(arr[0][i]+ " ");
        }
        System.out.println();
        System.out.println("the occurence is ");
        for(int i=0 ;i<6;i++) {
        System.out.print(arr[1][i]+ " ");
        }
        System.out.println();
        
        
        

	}

}
