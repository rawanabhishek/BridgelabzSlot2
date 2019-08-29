package com.bridgelabz.Arrays;

public class XandO {

	public static void main(String[] args) throws InterruptedException {
       String board[][]=new String [3][3];
       System.out.println("the Board is : ");
       for(int i=0;i<3;i++) {
    	   for(int j=0;j<3;j++) {
    		   board[i][j]=" - ";
    		   System.out.print(board[i][j]);
    	   }
    	   System.out.println();
    	   
       }
       
       System.out.println("Tossing  ");
       Thread.sleep(2000);
       System.out.println();
       if(Math.random()>0.5) {
    	   System.out.println("Human Move First : ");
    	   char move='h';
    	   
       }
       else{
    	   System.out.println("Computer move First :");
    	   char move='c';
       }
       
       
       
	}

}
