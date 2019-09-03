package com.bridgelabz.utility;
public class TicTacUtility {

	public static void initializingBoard(String[][] board) {
		// initializing board
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = " - ";
			}
		}
		/*
		 * board --- --- ---
		 */
	}

	// generating random number for taking decision to choose corner or center

	/**
	 * Purpose: printing board
	 * 
	 * @param board
	 */
	public static void printBoard(String[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static int random5(int count) {
	
	
			int value=(int)(Math.random()*4);
			return value;
		

	}
	

}