package tictactoe;

import static org.junit.Assert.*;

import org.junit.*;

public class TicTacToeTest {

	@Test
	public void testCheckWinner() {
		String [][] grid = new String[3][3];
		TicTacToe.playerNum = "2";
		
		//test computer win
		grid[0][0] = "O"; grid[0][1] = "O"; grid[0][2] = "O"; //top horizontal win
		TicTacToe.checkWinner(grid);
		
		grid[1][0] = "O"; grid[1][1] = "O"; grid[2][2] = "O"; //mid horizontal win
		TicTacToe.checkWinner(grid);
		assertTrue(	TicTacToe.checkWinner(grid));
	}
	


}
