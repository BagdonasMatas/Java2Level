package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeTest {

	TicTacToe ticTacToe;
	String[][] board;
	
	@BeforeEach
	void setUpBeforeClass() throws Exception {
		ticTacToe = new TicTacToe();
		board = new String[][]{ {"X", " ", " "}, {" ", "X", " "}, {" ", " ", "X"}};

	}

	@Test
	void winnerCheckTest() {
		boolean temp;
		
		temp = ticTacToe.winnerCheck(board);
		assertEquals(true, temp);
	}

}
