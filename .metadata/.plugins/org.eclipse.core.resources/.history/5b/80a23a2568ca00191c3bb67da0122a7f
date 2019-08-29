package com.bridgelabz.Arrays;

public class DeterminantOfMatrix {

	public static void main(String[] args) {
		
      int [][] M= {{1,2,3},{0,1,4},{5,6,0}};
      int [][] N=new int[2][2];
      
      N[0][0]=M[1][1];
      N[0][1]=M[1][2];
      N[1][0]=M[2][1];
      N[1][1]=M[2][2];
      
     int  determinant1=N[0][0]*N[1][1]-N[1][0]*N[0][1];
     
     N[0][0]=M[1][0];
     N[0][1]=M[1][2];
     N[1][0]=M[2][0];
     N[1][1]=M[2][2];
     
    int  determinant2=N[0][0]*N[1][1]-N[1][0]*N[0][1];
     
   
    
    N[0][0]=M[1][0];
    N[0][1]=M[1][1];
    N[1][0]=M[2][0];
    N[1][1]=M[2][1];
    
   int  determinant3=N[0][0]*N[1][1]-N[1][0]*N[0][1];
    
     int matrix =M[0][0]*determinant1-M[0][1]*determinant2+M[0][2]*determinant3;
     System.out.println(matrix);
	}

}
