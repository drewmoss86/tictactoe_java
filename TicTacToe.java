package tictactoe;
import java.util.Scanner;
import java.lang.Math.*;
public class TicTacToe {
   
    public static String player1Name = null;
    public static String player2Name = null;
    public static boolean winner = false;  
    public static String [] moveTracker = new String[9];
    public static String playerNum = null;
	static boolean player1_turn = true;
	public static int movesLeft = 9;
	public static boolean new_player = true;
	public static String Continue = "n";
	public static int row = 3;
	public static int col = 3;

 
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	Scanner input = new Scanner(System.in);
    	String[][] grid = new String[row][col];
    	
    	splashScreen(input);
    	do {
    		loadGrid(grid);
    		displayGrid(grid);
    		gamePlay(input,grid);

    		System.out.println("Press Yy to play again");

    		Continue = input.nextLine();
    		reset();
    		num_of_players(input);

    	}while(Continue.equalsIgnoreCase("y"));


    }//end of main method

    public static void gamePlay(Scanner input, String[][] grid) {
    	if(playerNum.equals("2")) {
    		while(!winner)
    		{
    			if(player1_turn) {
    				player1(input, grid);
    			} else {
    				player2(input, grid);
    			}
    		}
    	} else {
    		while(!winner)
    		{
    			if(player1_turn) {
    				player1(input, grid);
    			} else {
    				playerComputer(grid);
    			}
    		}
    	}


    } //end of gamePlay method
    
    //resets the game tracking variables and array
    public static void reset() {
        winner = false;
        movesLeft = 9;
        player1_turn = true;
        for(int i = 0; i < row*col; i++) {
        	moveTracker[i] = null;
        }
    }
 
    //loads grid with board selection values
    public static void loadGrid(String[][] grid) {
         int startingNumber = 0;

          for(int i = 0; i < row; i++) //outer for loop to load row numbers
            {  
                for(int j = 0; j < col; j++, startingNumber++)  
                {
                   
                    grid[i][j] = String.valueOf(startingNumber); //inner for loop to load column numbers
                   
                }//end of inner for loop
            }
    }
 
    //displays current state of the board
    public static void displayGrid(String[][] grid) {
       
   
        System.out.println("TIC-TAC TOE");
        System.out.println();
//        System.out.println("|-----|");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
            	if(j < 2)
                    System.out.print(" " + grid[i][j] + " |");
            	else
            		System.out.println(" " + grid[i][j]);
            }
            if(i<2)
            	System.out.println("------------");
        }
       
 
        }
 
    public static String startCenterAlgo(String [][] grid) {
//    	int row = Math.abs((int)(Math.random() * 3) + 0);
//    	int col = Math.abs((int)(Math.random() * 3) + 0);
//    	System.out.println("r: " + row);
//    	System.out.println("c: " + col);
		String startMove = "4";
		String computerMove = "";

//		System.out.println(moveTracker[0].equals("X") && moveTracker[1].equals("X"));
		//top horizontal block
		if(moveTracker[0] != null && moveTracker[1] != null && moveTracker[0].equals("X") && moveTracker[1].equals("X"))
			computerMove = Integer.toString(2);
		else if(moveTracker[0] != null && moveTracker[2] != null && moveTracker[0].equals("X") && moveTracker[2].equals("X"))
			computerMove = Integer.toString(1);
		else if(moveTracker[1] != null && moveTracker[2] != null && moveTracker[1].equals("X") && moveTracker[2].equals("X"))
			computerMove = Integer.toString(0);
		//mid horizontal block
		else if(moveTracker[3] != null && moveTracker[4] != null && moveTracker[3].equals("X") && moveTracker[4].equals("X"))
			computerMove = Integer.toString(5);
		else if(moveTracker[3] != null && moveTracker[5] != null && moveTracker[3].equals("X") && moveTracker[5].equals("X"))
			computerMove = Integer.toString(4);
		else if(moveTracker[4] != null && moveTracker[5] != null && moveTracker[4].equals("X") && moveTracker[5].equals("X"))
			computerMove = Integer.toString(3);
		//bottom horizontal block
		else if(moveTracker[6] != null && moveTracker[7] != null && moveTracker[6].equals("X") && moveTracker[7].equals("X"))
			computerMove = Integer.toString(8);
		else if(moveTracker[6] != null && moveTracker[8] != null && moveTracker[6].equals("X") && moveTracker[8].equals("X"))
			computerMove = Integer.toString(7);
		else if(moveTracker[7] != null && moveTracker[8] != null && moveTracker[7].equals("X") && moveTracker[8].equals("X"))
			computerMove = Integer.toString(6);
		
		//left vertical block
		else if(moveTracker[0] != null && moveTracker[3] != null && moveTracker[0].equals("X") && moveTracker[3].equals("X"))
			computerMove = Integer.toString(6);
		else if(moveTracker[0] != null && moveTracker[6] != null && moveTracker[0].equals("X") && moveTracker[6].equals("X"))
			computerMove = Integer.toString(3);
		else if(moveTracker[3] != null && moveTracker[6] != null && moveTracker[3].equals("X") && moveTracker[6].equals("X"))
			computerMove = Integer.toString(0);
		//mid vertical block
		else if(moveTracker[1] != null && moveTracker[4] != null && moveTracker[1].equals("X") && moveTracker[4].equals("X"))
			computerMove = Integer.toString(7);
		else if(moveTracker[1] != null && moveTracker[7] != null && moveTracker[1].equals("X") && moveTracker[7].equals("X"))
			computerMove = Integer.toString(4);
		else if(moveTracker[4] != null && moveTracker[7] != null && moveTracker[4].equals("X") && moveTracker[7].equals("X"))
			computerMove = Integer.toString(1);
		//right vertical block
		else if(moveTracker[2] != null && moveTracker[5] != null && moveTracker[2].equals("X") && moveTracker[5].equals("X"))
			computerMove = Integer.toString(6);
		else if(moveTracker[2] != null && moveTracker[8] != null && moveTracker[2].equals("X") && moveTracker[8].equals("X"))
			computerMove = Integer.toString(3);
		else if(moveTracker[5] != null && moveTracker[8] != null && moveTracker[5].equals("X") && moveTracker[8].equals("X"))
			computerMove = Integer.toString(0);
		//l-r diagonal block
		else if(moveTracker[0] != null && moveTracker[4] != null && moveTracker[0].equals("X") && moveTracker[4].equals("X"))
			computerMove = Integer.toString(8);
		else if(moveTracker[0] != null && moveTracker[8] != null && moveTracker[0].equals("X") && moveTracker[8].equals("X"))
			computerMove = Integer.toString(4);
		else if(moveTracker[4] != null && moveTracker[8] != null && moveTracker[4].equals("X") && moveTracker[8].equals("X"))
			computerMove = Integer.toString(0);
		//r-1 diagonal block
		else if(moveTracker[2] != null && moveTracker[4] != null && moveTracker[2].equals("X") && moveTracker[4].equals("X"))
			computerMove = Integer.toString(6);
		else if(moveTracker[2] != null && moveTracker[6] != null && moveTracker[2].equals("X") && moveTracker[6].equals("X"))
			computerMove = Integer.toString(4);
		else if(moveTracker[4] != null && moveTracker[6] != null && moveTracker[4].equals("X") && moveTracker[6].equals("X"))
			computerMove = Integer.toString(2);
		
		
		if(moveTracker[0] != null && moveTracker[1] != null && moveTracker[0].equals("X") && moveTracker[1].equals("X"))
			computerMove = Integer.toString(2);
		else if(moveTracker[0] != null && moveTracker[2] != null && moveTracker[0].equals("X") && moveTracker[2].equals("X"))
			computerMove = Integer.toString(1);
		else if(moveTracker[1] != null && moveTracker[2] != null && moveTracker[1].equals("X") && moveTracker[2].equals("X"))
			computerMove = Integer.toString(0);
		//mid horizontal finish
		else if(moveTracker[3] != null && moveTracker[4] != null && moveTracker[3].equals("X") && moveTracker[4].equals("X"))
			computerMove = Integer.toString(5);
		else if(moveTracker[3] != null && moveTracker[5] != null && moveTracker[3].equals("X") && moveTracker[5].equals("X"))
			computerMove = Integer.toString(4);
		else if(moveTracker[4] != null && moveTracker[5] != null && moveTracker[4].equals("O") && moveTracker[5].equals("O"))
			computerMove = Integer.toString(3);
		//bottom horizontal finish
		else if(moveTracker[6] != null && moveTracker[7] != null && moveTracker[6].equals("O") && moveTracker[7].equals("O"))
			computerMove = Integer.toString(8);
		else if(moveTracker[6] != null && moveTracker[8] != null && moveTracker[6].equals("O") && moveTracker[8].equals("O"))
			computerMove = Integer.toString(7);
		else if(moveTracker[7] != null && moveTracker[8] != null && moveTracker[7].equals("O") && moveTracker[8].equals("O"))
			computerMove = Integer.toString(6);
		//left vertical finish
		else if(moveTracker[0] != null && moveTracker[3] != null && moveTracker[0].equals("O") && moveTracker[3].equals("O"))
			computerMove = Integer.toString(6);
		else if(moveTracker[0] != null && moveTracker[6] != null && moveTracker[0].equals("O") && moveTracker[6].equals("O"))
			computerMove = Integer.toString(3);
		else if(moveTracker[3] != null && moveTracker[6] != null && moveTracker[3].equals("O") && moveTracker[6].equals("O"))
			computerMove = Integer.toString(0);
		//mid vertical finish
		else if(moveTracker[1] != null && moveTracker[4] != null && moveTracker[1].equals("O") && moveTracker[4].equals("O"))
			computerMove = Integer.toString(7);
		else if(moveTracker[1] != null && moveTracker[7] != null && moveTracker[1].equals("O") && moveTracker[7].equals("O"))
			computerMove = Integer.toString(4);
		else if(moveTracker[4] != null && moveTracker[7] != null && moveTracker[4].equals("O") && moveTracker[7].equals("O"))
			computerMove = Integer.toString(1);
		//right vertical finish
		else if(moveTracker[2] != null && moveTracker[5] != null && moveTracker[2].equals("O") && moveTracker[5].equals("O"))
			computerMove = Integer.toString(6);
		else if(moveTracker[2] != null && moveTracker[8] != null && moveTracker[2].equals("O") && moveTracker[8].equals("O"))
			computerMove = Integer.toString(3);
		else if(moveTracker[5] != null && moveTracker[8] != null && moveTracker[5].equals("O") && moveTracker[8].equals("O"))
			computerMove = Integer.toString(0);

		//l-r diagonal finish
		else if(moveTracker[0] != null && moveTracker[4] != null && moveTracker[0].equals("O") && moveTracker[4].equals("O"))
			computerMove = Integer.toString(8);
		else if(moveTracker[0] != null && moveTracker[8] != null && moveTracker[0].equals("O") && moveTracker[8].equals("O"))
			computerMove = Integer.toString(4);
		else if(moveTracker[4] != null && moveTracker[8] != null && moveTracker[4].equals("O") && moveTracker[8].equals("O"))
			computerMove = Integer.toString(0);
		//r-1 diagonal finish
		else if(moveTracker[2] != null && moveTracker[4] != null && moveTracker[2].equals("O") && moveTracker[4].equals("O"))
			computerMove = Integer.toString(6);
		else if(moveTracker[2] != null && moveTracker[6] != null && moveTracker[2].equals("O") && moveTracker[6].equals("O"))
			computerMove = Integer.toString(4);
		else if(moveTracker[4] != null && moveTracker[6] != null && moveTracker[4].equals("O") && moveTracker[6].equals("O"))
			computerMove = Integer.toString(2);

		else {
			if(moveTracker[4] == null) {
				computerMove = "4";
			} else {
				if(moveTracker[4].equals("O")){
					if(moveTracker[1].equals("X"))  {
						computerMove = "6";
					} else if(moveTracker[3] == null) {
						computerMove = "3";
					} else if(moveTracker[5] == null)
							computerMove = "5";
					}
				else if(moveTracker[4].equals("O") && (moveTracker[6].equals("O") || moveTracker[8].equals("O"))) {
					computerMove = "7";
				}
			}
		}
//    	String computerMove = Integer.toString(Math.abs((int)(Math.random() * 9) + 0));

		


//
//		index = Integer.parseInt(startMove)+1;
//		System.out.println(index);
//		if(moveTracker[3] != null && moveTracker[index] == null) { 
//			computerMove = Integer.toString(index); 
//		}
//			
    	
//		while(moveTracker[Integer.parseInt(computerMove)] != null) {
//	    	computerMove = Integer.toString(Math.abs((int)(Math.random() * 9) + 0));
//		}

    	return computerMove;

    }
    
    public static String playerMove(String move, String[][] grid) {
    	String piece;
    	if(player1_turn) {
    		piece = "X";
    	} else {
    		piece = "O";
    	}
    	System.out.println("move: " + move );
        switch (move)
        {
           case "0":
               grid[0][0] = piece;
               break;
          
           case "1":
               grid[0][1] = piece;
               break;
              
           case "2":
               grid[0][2] = piece;
               break;
              
           case "3":
               grid[1][0] = piece;
               break;
              
           case "4":
               grid[1][1] = piece;
               break;
              
           case "5":
               grid[1][2] = piece;
               break;
              
           case "6":
               grid[2][0] = piece;
               break;
              
           case "7":
               grid[2][1] = piece;
               break;
              
           case "8":
               grid[2][2] = piece;
               break;
        } //end of switch statement
        
        return move;
    }
    
    public static void playerComputer(String[][] grid) {
       
    	System.out.println("Computer's turn");

    	String computerMove = startCenterAlgo(grid);
        System.out.println(playerMove(computerMove, grid));
    	moveTracker[Integer.parseInt(playerMove(computerMove, grid))] = "O";
    	
    	displayGrid(grid);
    	if(!checkWinner(grid))
    	{
    		player1_turn = true;
    		movesLeft--;
    	}
    } //end of computer move method
   
    public static boolean checkWinner(String grid[][]) {
       int row = 0;
       int col = 0;
       
       if(movesLeft == 0) {
    	   System.out.println("Game is a draw!");
    	   winner = false;
       } else {
           //checks for vertical and horizontal wins
           for(int i = 0; i < 3; i++) {
        	   if((grid[i][0] == "O" && grid[i][1] == "O" && grid[i][2] == "O") || //checks vertical win
        		  (grid[0][i] == "O" && grid[1][i] == "O" && grid[2][i] == "O")) { //checks horizontal win
                   if(playerNum.equals("2")) {
            		   System.out.println(player2Name + " Wins!");
                   } else {
            		   System.out.println("Computer Wins!");
                   }
                   winner = true;
        	   } else if ((grid[i][0] == "X" && grid[i][1] == "X" && grid[i][2] == "X") || 
        		  (grid[0][i] == "X" && grid[1][i] == "X" && grid[2][i] == "X")) {
                   System.out.println(player1Name + " Wins!");
                   winner = true;
        	   }
        			   
           }
           
           //checks for diagonal win
           if((grid[row][col+2] == "O" && grid[row+1][col+1] == "O" && grid[row+2][col] == "O") ||
        		   (grid[row][0] == "O" && grid[row+1][1] == "O" && grid[row+2][2] == "O")) 
           {
               if(playerNum.equals("2")) {
        		   System.out.println(player2Name + " Wins!");

               } else {
        		   System.out.println("Computer Wins!");

               }
        	   winner = true;
           } else if((grid[row][col+2] == "X" && grid[row+1][col+1] == "X" && grid[row+2][col] == "X") || 
        		   (grid[row][0] == "X" && grid[row+1][1] == "X" && grid[row+2][2] == "X")) 
           {
        	   System.out.println(player1Name + " Wins!");
        	   winner = true;
           }
                      
       }
             
       return winner;

    }
 
    public static void player1(Scanner input, String[][] grid) {
 
    	if(player1_turn) { System.out.println(player1Name + "'s" + " move"); } 
       
        String player1_move = validateMove(grid, input);
       
        moveTracker[Integer.parseInt(playerMove(player1_move, grid))] = "X";
       
        displayGrid(grid);       
        
        if(!checkWinner(grid))
        {
        	player1_turn = false;
        	movesLeft--;
        }
    } //end of player1 method
    public static void player2(Scanner input, String[][] grid) {
        
    	if(!player1_turn) { System.out.println(player2Name + "'s" + " move"); }
    	
        String player2_move = validateMove(grid, input);

        moveTracker[Integer.parseInt(playerMove(player2_move, grid))] = "O";       
        
        displayGrid(grid);
        
        if(!checkWinner(grid))
        {
        	player1_turn = true;
            movesLeft--;
        }
      
   } //end of player2 move method
 
    public static String validateMove(String[][] grid, Scanner input) {
       
        String move = input.nextLine();
        boolean check = true;
       
        while(check)
        {
            if(!move.matches("[0-8]")) {        	
                System.out.println("Not a valid Move");
                move = input.nextLine();
                check = true;

            } else if(moveTracker[Integer.parseInt(move)] != null) {
                  System.out.println("Spot taken make another move");
                  move = input.nextLine();
                  check = true;
            } else {
                check = false;
            }
        }
                  
        return move;
 
    }//end of validate method
 
   
    public static void splashScreen(Scanner input)
    {
       
        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("******           ******");
        System.out.println("******TIC TAC TOE******");
        System.out.println("******           ******");
        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("***********************");    
        System.out.println();
        
        num_of_players(input);
        saveName(playerNum, input);
        
    }
    
    public static void num_of_players(Scanner input) {
    	String same_players = null;
    	
        System.out.println("Press 1 for 1 Player Game");
        System.out.println("Press 2 for 2 Player Game");
        checkSel(input); 
        
        if(Continue.equals("y")) {
            System.out.println("Same players? Press y/Y to continue with same players or "
            		+ "press any other key to change players");   
            same_players = input.nextLine();
            if(same_players.equalsIgnoreCase("y")) { new_player = false; }
            else { new_player = true; saveName(playerNum, input); }
        }
        
    }
 
    public static void saveName(String pNum, Scanner input) {
    	if(new_player) {
        	if(pNum.equals("2")) {
        		System.out.println("Enter your name Player 1: ");
        		player1Name = checkName(player1Name, input);    		
        		System.out.println("Hello, " + player1Name + " you will be X\n");

        		System.out.println("Enter your name Player 2: ");
        		player2Name = checkName(player2Name, input);
        		System.out.println("Hello, " + player2Name + " you will be O");

        	} else {
        		System.out.println("Enter your name Player 1: ");
        		player1Name = checkName(player1Name, input);
        		System.out.println("Hello, " + player1Name + " you will be X\n");

        	}
    	} 
    }
    public static void checkSel(Scanner input) {
    	playerNum = input.nextLine();

    	while(!playerNum.matches("[12]")) {
    		System.out.println("Invalid selection. Please try again.");
    		playerNum = input.nextLine();    	
    	}

    } //end of checkname method
 
    public static String checkName(String name, Scanner input) {
    	name = input.nextLine();
    	
        while(!name.matches("[A-Za-z]+") || name.isEmpty())
        {
        	System.out.println("Not a valid name enter another");
        	name = input.nextLine();
        }   
        return name;
    } //end of checkname method
}