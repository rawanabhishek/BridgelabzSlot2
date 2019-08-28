package com.bridgelabz.Arrays;

import java.util.Scanner;

import com.bridgelabz.utility.ArraysUtility;

public class TwoDimenArrays {
	public static void main(String[] args) {

		int row, col;
		Scanner scanner = new Scanner(System.in);
		ArraysUtility utility = new ArraysUtility();
		// integer operation
		System.out.println("**************Integer operation****************");
		System.out.println("Enter how many row you want");
		row = scanner.nextInt();
		System.out.println("Enter how many row you want");
		col = scanner.nextInt();
		int[][] intArr = new int[row][col];

		utility.enter2DIntArray(intArr, row, col);

		utility.print2DIntArray(intArr);

		System.out.println("**************Integer operation****************");
		System.out.println();
		// double operation
		System.out.println("**************Double operation****************");

		double[][] doubleArr = new double[row][col];

		utility.enter2DDoubleArray(doubleArr, row, col);

		utility.print2DDoubleArray(doubleArr);

		System.out.println("**************Double operation****************");
		System.out.println();
		// boolean operation
		System.out.println("**************Boolean operation****************");

		boolean[][] boolArr = new boolean[row][col];

		utility.enter2DBoolArray(boolArr, row, col);

		utility.print2DBoolArray(boolArr);

		System.out.println("**************Boolean operation****************");
		scanner.close();
	}

}
