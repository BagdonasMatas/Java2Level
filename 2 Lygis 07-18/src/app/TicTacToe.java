package app;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		TicTacToe ticTacToe = new TicTacToe();
		Integer turns = 0;
		String[][] board = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		Scanner sc = new Scanner(System.in);
		Integer location = 0;
		Random rand = new Random();
		
		
		while (!ticTacToe.winnerCheck(board)) {
			if (turns % 2 == 0) {
				ticTacToe.printBoard(board);
				System.out.println("Turn of player X; Enter the number where you wish to place your symbol.");
				location = sc.nextInt();
				sc.nextLine();
			} else {
				ticTacToe.printBoard(board);
				System.out.println("Turn of player O; Enter the number where you wish to place your symbol.");
				location = rand.nextInt(10)-1;
			}
			
			switch (location) {
			case 1:
				if (board[0][0].equals("1")) {
					if (turns % 2 == 0)
						board[0][0] = "X";
					else
						board[0][0] = "O";
					turns++;
				} else
					System.out.println("Location already filled. Choose another location.");
				break;
			case 2:
				if (board[0][1].equals("2")) {
					if (turns % 2 == 0)
						board[0][1] = "X";
					else
						board[0][1] = "O";
					turns++;
				} else
					System.out.println("Location already filled. Choose another location.");
				break;
			case 3:
				if (board[0][2].equals("3")) {
					if (turns % 2 == 0)
						board[0][2] = "X";
					else
						board[0][2] = "O";
					turns++;
				} else
					System.out.println("Location already filled. Choose another location.");
				break;
			case 4:
				if (board[1][0].equals("4")) {
					if (turns % 2 == 0)
						board[1][0] = "X";
					else
						board[1][0] = "O";
					turns++;
				} else
					System.out.println("Location already filled. Choose another location.");
				break;
			case 5:
				if (board[1][1].equals("5")) {
					if (turns % 2 == 0)
						board[1][1] = "X";
					else
						board[1][1] = "O";
					turns++;
				} else
					System.out.println("Location already filled. Choose another location.");
				break;
			case 6:
				if (board[1][2].equals("6")) {
					if (turns % 2 == 0)
						board[1][2] = "X";
					else
						board[1][2] = "O";
					turns++;
				} else
					System.out.println("Location already filled. Choose another location.");
				break;
			case 7:
				if (board[2][0].equals("7")) {
					if (turns % 2 == 0)
						board[2][0] = "X";
					else
						board[2][0] = "O";
					turns++;
				} else
					System.out.println("Location already filled. Choose another location.");
				break;
			case 8:
				if (board[2][1].equals("8")) {
					if (turns % 2 == 0)
						board[2][1] = "X";
					else
						board[2][1] = "O";
					turns++;
				} else
					System.out.println("Location already filled. Choose another location.");
				break;
			case 9:
				if (board[2][2].equals("9")) {
					if (turns % 2 == 0)
						board[2][2] = "X";
					else
						board[2][2] = "O";
					turns++;
				} else
					System.out.println("Location already filled. Choose another location.");
				break;
			default:
				System.out.println("Such a location isn't on the board.");

			}
			if (turns == 9 && ticTacToe.winnerCheck(board)) {
				break;
			} else if(turns == 9){
				System.out.println("The game is a draw!");
				break;
			}
		}
		sc.close();

	}

	public void printBoard(String[][] board) {

		System.out.println("|---|---|---|");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("| " + board[i][j] + " ");
			}
			System.out.println("|");
			System.out.println("|---|---|---|");
		}
	}

	public boolean winnerCheck(String[][] board) {

		Integer countX = 0;
		Integer countO = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j].equals("X"))
					countX++;
				if (board[i][j].equals("O"))
					countO++;
			}
			if (countX == 3) {
				System.out.println("Winner is X player.");
				return true;
			}
			if (countO == 3) {
				System.out.println("Winner is O player");
				return true;
			}
			countX = 0;
			countO = 0;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[j][i].equals("X"))
					countX++;
				if (board[j][i].equals("O"))
					countO++;
			}
			if (countX == 3) {
				System.out.println("Winner is X player.");
				return true;
			}
			if (countO == 3) {
				System.out.println("Winner is O player");
				return true;
			}
			countX = 0;
			countO = 0;
		}

		for (int i = 0; i < 3; i++) {
			if (board[i][i].equals("X"))
				countX++;
			if (board[i][i].equals("O"))
				countO++;
		}
		if (countX == 3) {
			System.out.println("Winner is X player.");
			return true;
		}
		if (countO == 3) {
			System.out.println("Winner is O player");
			return true;
		}
		countX = 0;
		countO = 0;

		for (int i = 0; i < 3; i++) {
			if (board[i][2 - i].equals("X"))
				countX++;
			if (board[i][2 - i].equals("O"))
				countO++;
		}
		if (countX == 3) {
			System.out.println("Winner is X player.");
			return true;
		}
		if (countO == 3) {
			System.out.println("Winner is O player");
			return true;
		}

		return false;
	}

}
