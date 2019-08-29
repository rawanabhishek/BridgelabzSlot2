package com.bridgelabz.Arrays;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][] M= {{1,2,3},
				      {0,1,4},
				      {5,6,0}};
		 for(int i=0 ;i<3;i++) {
	    	 for(int j=0;j<3;j++) {
	    		 System.out.print(M[i][j]+" ");
	    	 }
	    	 System.out.println();
	     }
		 System.out.println();
		 System.out.println("The transpose of the above matrix is ");
		 System.out.println();
		 int temp[][]=new int[3][3];
		 for(int i =0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 temp[i][j]=M[j][i];
				 System.out.print(temp[i][j]+" ");
			 }
			 System.out.println();
		 }
	}

}
