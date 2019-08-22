package com.bridgelabz.Basic;

public class Pattern1 {
	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j < 8; j++) {
				if((i==0) && (j==1 || j==2 || j==0 || j==3 || j==4 || j==5 || j==6 || j==7  ) ) {
				System.out.print("*");
				}
				else if((i==1 ) && (j==0 || j==1 || j==2 || j==5 || j==6 ||j==7 )) {
					System.out.print("*");
				}
				else if((i==2 ) && (j==0 || j==1  ||  j==6 ||j==7) ) {
					System.out.print("*");
				}
				else if((i==3 ) && (j==0 ||   j==7 )) {
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
