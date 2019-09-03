package com.bridgelabz.Arrays;

import java.util.Scanner;

import com.bridgelabz.utility.TicTacUtility;

public class XandO {
	public static boolean end = false;
	public static String win;
	static char move;
	static int count = 1;
	static String board[][] = new String[3][3];

	public static void main(String[] args) throws InterruptedException {

		TicTacUtility utility = new TicTacUtility();

		Scanner scanner = new Scanner(System.in);

		System.out.println("the Board is : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = " - ";
				System.out.print(board[i][j]);
			}
			System.out.println();

		}

		System.out.println();

		System.out.println("Tossing  ");
		Thread.sleep(2000);

		System.out.println();

		if (Math.random() > 0.5) {
			System.out.println("Human Move First : ");
			move = 'h';
			move(move);

		} else {
			System.out.println("Computer move First :");
			move = 'c';
			move(move);

		}

	}

	public static void boardprint() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();

		}
	}

	public static void move(char move) {
		TicTacUtility utility = new TicTacUtility();
		Scanner scanner = new Scanner(System.in);
		if (move == 'h') {
			if (count == 1 || count == 2 || count == 3 || count == 4 || count == 5 || count == 6 || count == 7
					|| count == 8 || count == 9) {
				System.out.println("Enter your move : ");
				int m1 = scanner.nextInt();

				if (m1 == 00 && board[0][0] == " - ") {
					board[0][0] = " O ";

				} else if (m1 == 01 && board[0][1] == " - ") {
					board[0][1] = " O ";
				} else if (m1 == 02 && board[0][2] == " - ") {
					board[0][2] = " O ";
				} else if (m1 == 10 && board[1][0] == " - ") {
					board[1][0] = " O ";
				} else if (m1 == 11 && board[1][1] == " - ") {
					board[1][1] = " O ";
				} else if (m1 == 12 && board[1][2] == " - ") {
					board[1][2] = " O ";
				} else if (m1 == 20 && board[2][0] == " - ") {
					board[2][0] = " O ";
				} else if (m1 == 21 && board[2][1] == " - ") {
					board[2][1] = " O ";
				} else if (m1 == 22 && board[2][2] == " - ") {
					board[2][2] = " O ";

				}

				move = 'c';
				count++;
if(count==5 || count == 6 || count ==7) {
			    if(won())
			    {
			    	if(win==" O ") {
			    		System.out.println("human won ");
			    	}
			    	else if(win==" X "){
			    		System.out.println("Computer won");
			    	}
			    	else {
			    		System.out.println("Its a draw");
			    	}
			    }
			}
				boardprint();
				System.out.println();
				move(move);
			}
		}

		else if (move == 'c') {

			if (count == 1) {
				int value = utility.random5(count);
				if (value == 0 && board[0][0] == " - ") {
					board[0][0] = " X ";

				} else if (value == 1 && board[0][2] == " - ") {
					board[0][2] = " X ";

				} else if (value == 2 && board[2][0] == " - ") {
					board[2][0] = " X ";

				} else if (value == 3 && board[2][2] == " - ") {
					board[2][2] = " X ";

				} else if (value == 4 && board[1][1] == " - ") {
					board[1][1] = " X ";

				}

				count++;
				move = 'h';
				boardprint();
				move(move);

			} else if (count == 2) {
				if (board[0][0] == " O ") {
					board[1][1] = " X ";

				} else if (board[0][1] == " O ") {
					board[0][2] = " X ";
				} else if (board[0][2] == " O ") {
					board[1][1] = " X ";
				} else if (board[1][0] == " O ") {
					board[0][0] = " X ";
				} else if (board[1][1] == " O ") {
					board[0][0] = " X ";
				} else if (board[1][2] == " O ") {
					board[0][2] = " X ";
				} else if (board[2][0] == " O ") {
					board[1][1] = " X ";
				} else if (board[2][1] == " O ") {
					board[2][2] = " X ";
				} else if (board[2][2] == " O ") {
					board[1][1] = " X ";
				} else {
					if (board[0][0] == " - ") {
						board[0][0] = " X ";
					} else if (board[0][2] == " - ") {
						board[0][2] = " X ";
					} else if (board[2][0] == " - ") {
						board[2][0] = " X ";
					} else if (board[2][2] == " - ") {
						board[2][2] = " X ";
					}
				}
				move = 'h';

				count++;
				boardprint();
				move(move);
			} else if (count == 3) {
				if (board[0][0] == " O " && board[0][2] == "-") {
					board[0][2] = " X ";
				} else if (board[0][0] == " O " && board[2][0] == " - ") {
					board[2][0] = " X ";
				} else if (board[0][2] == " O " && board[0][0] == " - ") {
					board[0][0] = " X ";
				} else if (board[0][2] == " O " && board[2][2] == " - ") {
					board[2][2] = " X ";
				} else if (board[0][0] == " O " && board[0][0] == " - ") {
					board[0][0] = " X ";
				} else if (board[2][0] == " O " && board[2][2] == " - ") {
					board[2][2] = " X ";
				} else if (board[2][2] == " O " && board[2][0] == " - ") {
					board[2][0] = " X ";
				} else if (board[2][2] == " O " && board[0][2] == " - ") {
					board[0][2] = " X ";
				}
				move = 'h';

				count++;
				boardprint();
				move(move);
			}

//		

			else if (count == 5 || count == 7 || count == 9) {
				if (board[0][0] == " X " && board[0][1] == " X " && board[0][2] == " - ") {

					board[0][2] = " X ";
				} else if (board[0][0] == " X " && board[1][0] == " X " && board[2][0] == " - ") {
					board[2][0] = " X ";
				} else if (board[0][0] == " X " && board[1][1] == " X " && board[2][2] == " - ") {
					board[2][2] = " X ";
				} else if (board[0][1] == " X " && board[0][2] == " X " && board[0][0] == " - ") {
					board[0][0] = " X ";
				} else if (board[0][1] == " X " && board[1][1] == " X " && board[2][1] == " - ") {
					board[2][1] = " X ";
				} else if (board[0][2] == " X " && board[1][1] == " X " && board[2][0] == " - ") {
					board[2][0] = " X ";
				} else if (board[0][2] == " X " && board[1][2] == " X " && board[2][2] == " - ") {
					board[2][2] = " X ";
				} else if (board[1][0] == " X " && board[1][1] == " X " && board[1][2] == " - ") {
					board[1][2] = " X ";
				} else if (board[1][0] == " X " && board[2][0] == " X " && board[0][0] == " - ") {
					board[0][0] = " X ";
				} else if (board[2][0] == " X " && board[1][1] == " X " && board[0][2] == " - ") {
					board[0][2] = " X ";
				} else if (board[2][1] == " X " && board[1][1] == " X " && board[0][1] == " - ") {
					board[0][1] = " X ";
				} else if (board[2][2] == " X " && board[1][1] == " X " && board[0][0] == " - ") {
					board[0][0] = " X ";
				} else if (board[1][1] == " X " && board[1][2] == " X " && board[1][0] == " - ") {
					board[1][0] = " X ";
				} else if (board[2][2] == " X " && board[1][2] == " X " && board[0][2] == " - ") {
					board[0][2] = " X ";
				} else if (board[2][0] == " X " && board[2][1] == " X " && board[2][2] == " - ") {
					board[2][2] = " X ";
				} else if (board[2][1] == " X " && board[2][2] == " X " && board[2][0] == " - ") {
					board[2][0] = " X ";
				} else if (board[0][0] == " X " && board[0][2] == " X " && board[0][1] == " - ") {
					board[0][1] = " X ";
				} else if (board[0][0] == " X " && board[2][0] == " X " && board[1][0] == " - ") {
					board[1][0] = " X ";
				} else if (board[0][2] == " X " && board[2][2] == " X " && board[1][2] == " - ") {
					board[1][2] = " X ";
				} else if (board[2][0] == " X " && board[2][2] == " X " && board[2][1] == " - ") {
					board[2][1] = " X ";
				} else if (board[0][0] == " X " && board[2][2] == " X " && board[1][1] == " - ") {
					board[1][1] = " X ";
				} else if (board[0][2] == " X " && board[2][0] == " X " && board[1][1] == " - ") {
					board[1][1] = " X ";
				} else if (board[0][1] == " X " && board[2][1] == " X " && board[1][1] == " - ") {
					board[1][1] = " X ";
				} else if (board[1][0] == " X " && board[1][2] == " X " && board[1][1] == " - ") {
					board[1][1] = " X ";
				}
				move = 'h';
				count++;

				boardprint();

				

				move(move);
			}

			else if (count == 4 || count == 6 || count == 8) {
				if (board[0][0] == " O " && board[0][1] == " O " && board[0][2] == " - ") {
					board[0][2] = " X ";
				} else if (board[0][0] == " O " && board[1][0] == " O " && board[2][0] == " - ") {
					board[2][0] = " X ";
				} else if (board[0][0] == " O " && board[1][1] == " O " && board[2][2] == " - ") {
					board[2][2] = " X ";
				} else if (board[0][1] == " O " && board[0][2] == " O " && board[0][0] == " - ") {
					board[0][0] = " X ";
				} else if (board[0][1] == " O " && board[1][1] == " O " && board[2][1] == " - ") {
					board[2][1] = " X ";
				} else if (board[0][2] == " O " && board[1][1] == " O " && board[2][0] == " - ") {
					board[2][0] = " X ";
				} else if (board[0][2] == " O " && board[1][2] == " O " && board[2][2] == " - ") {
					board[2][2] = " X ";

				} else if (board[1][0] == " O " && board[1][1] == " O " && board[1][2] == " - ") {
					board[1][2] = " X ";
				} else if (board[1][0] == " O " && board[2][0] == " O " && board[0][0] == " - ") {
					board[0][0] = " X ";
				} else if (board[2][0] == " O " && board[1][1] == " O " && board[0][2] == " - ") {
					board[0][2] = " X ";
				} else if (board[2][1] == " O " && board[1][1] == " O " && board[0][1] == " - ") {
					board[0][1] = " X ";
				} else if (board[2][2] == " O " && board[1][1] == " O " && board[0][0] == " - ") {
					board[0][0] = " X ";
				} else if (board[1][1] == " O " && board[1][2] == " O " && board[1][0] == " - ") {
					board[1][0] = " X ";
				} else if (board[2][2] == " O " && board[1][2] == " O " && board[0][2] == " - ") {
					board[0][2] = " X ";
				} else if (board[2][0] == " O " && board[2][1] == " O " && board[2][2] == " - ") {
					board[2][2] = " X  ";
				} else if (board[2][1] == " O " && board[2][2] == " O " && board[2][0] == " - ") {
					board[2][0] = " X ";
				} else if (board[0][0] == " O " && board[0][2] == " O " && board[0][1] == " - ") {
					board[0][1] = " X ";
				} else if (board[0][0] == " O " && board[2][0] == " O " && board[1][0] == " - ") {
					board[1][0] = " X ";
				} else if (board[0][2] == " O " && board[2][2] == " O " && board[1][2] == " - ") {
					board[1][2] = " X ";
				} else if (board[2][0] == " O " && board[2][2] == " O " && board[2][1] == " - ") {
					board[2][1] = " X ";
				} else if (board[0][0] == " O " && board[2][2] == " O " && board[1][1] == " - ") {
					board[1][1] = " X ";
				} else if (board[0][2] == " O " && board[2][0] == " O " && board[1][1] == " - ") {
					board[1][1] = " X ";
				} else if (board[0][1] == " O " && board[2][1] == " O " && board[1][1] == " - ") {
					board[1][1] = " X ";
				} else if (board[1][0] == " O " && board[1][2] == " O " && board[1][1] == " - ") {
					board[1][1] = " X ";
				}
				move = 'h';
				count++;
				boardprint();

				move(move);
			}

		}

	}
	public static boolean won() {
		boolean won = false;

		if (board[0][0] ==" O " && board[0][1] ==" O " && board[0][2] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][0] ==" O " && board[1][0] ==" O " && board[2][0] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][0] ==" O " && board[1][1] ==" O " && board[2][2] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][1] ==" O " && board[0][2] ==" O " && board[0][0] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][1] ==" O " && board[1][1] ==" O " && board[2][1] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][2] ==" O " && board[1][1] ==" O " && board[2][0] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][2] ==" O " && board[1][2] ==" O " && board[2][2] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[1][0] ==" O " && board[1][1] ==" O " && board[1][2] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[1][0] ==" O " && board[2][0] ==" O " && board[0][0] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[2][0] ==" O " && board[1][1] ==" O " && board[0][2] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[2][1] ==" O " && board[1][1] ==" O " && board[0][1] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[2][2] ==" O " && board[1][1] ==" O " && board[0][0] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[1][1] ==" O " && board[1][2] ==" O " && board[1][0] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[2][2] ==" O " && board[1][2] ==" O " && board[0][2] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[2][0] ==" O " && board[2][1] ==" O " && board[2][2] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[2][1] ==" O " && board[2][2] ==" O " && board[2][0] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][0] ==" O " && board[0][2] ==" O " && board[0][1] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][0] ==" O " && board[2][0] ==" O " && board[1][0] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][2] ==" O " && board[2][2] ==" O " && board[1][2] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[2][0] ==" O " && board[2][2] ==" O " && board[2][1] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][0] ==" O " && board[2][2] ==" O " && board[1][1] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][2] ==" O " && board[2][0] ==" O " && board[1][1] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[0][1] ==" O " && board[2][1] ==" O " && board[1][1] ==" O ") {
			won = true;
			win =" O ";
		} else if (board[1][0] ==" O " && board[1][2] ==" O " && board[1][1] ==" O ") {
			won = true;
			win =" O ";
		}

		else if (board[0][0] ==" X " && board[0][1] ==" X " && board[0][2] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][0] ==" X " && board[1][0] ==" X " && board[2][0] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][0] ==" X " && board[1][1] ==" X " && board[2][2] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][1] ==" X " && board[0][2] ==" X " && board[0][0] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][1] ==" X " && board[1][1] ==" X " && board[2][1] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][2] ==" X " && board[1][1] ==" X " && board[2][0] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][2] ==" X " && board[1][2] ==" X " && board[2][2] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[1][0] ==" X " && board[1][1] ==" X " && board[1][2] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[1][0] ==" X " && board[2][0] ==" X " && board[0][0] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[2][0] ==" X " && board[1][1] ==" X " && board[0][2] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[2][1] ==" X " && board[1][1] ==" X " && board[0][1] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[2][2] ==" X " && board[1][1] ==" X " && board[0][0] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[1][1] ==" X " && board[1][2] ==" X " && board[1][0] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[2][2] ==" X " && board[1][2] ==" X " && board[0][2] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[2][0] ==" X " && board[2][1] ==" X " && board[2][2] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[2][1] ==" X " && board[2][2] ==" X " && board[2][0] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][0] ==" X " && board[0][2] ==" X " && board[0][1] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][0] ==" X " && board[2][0] ==" X " && board[1][0] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][2] ==" X " && board[2][2] ==" X " && board[1][2] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[2][0] ==" X " && board[2][2] ==" X " && board[2][1] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][0] ==" X " && board[2][2] ==" X " && board[1][1] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][2] ==" X " && board[2][0] ==" X " && board[1][1] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[0][1] ==" X " && board[2][1] ==" X " && board[1][1] ==" X ") {
			won = true;
			win =" X ";
		} else if (board[1][0] ==" X " && board[1][2] ==" X " && board[1][1] ==" X ") {
			won = true;
			win =" X ";
		}
		return won;

	}
}
