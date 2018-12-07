package tictactoe;
import java.util.Scanner;
public class TicTacToe {
   
    public static String playerName ="";
    public static String Winner = null;
    public static String [] moveTracker = new String[9];
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        String[][] grid = new String[3][3];
        String Continue = " ";
       
       
            splashScreen(input);
     do {
//            Winner = null;
            loadGrid(grid);
            displayGrid(input, grid);
            gamePlay(input,grid);
           
            System.out.println("Press Yy to play again");
           
            Continue = input.nextLine();
           
        }while(Continue.equalsIgnoreCase("y"));
       
 
    }//end of main method

    public static void gamePlay(Scanner input, String[][] grid) {
       
       
        while(Winner == null)
        {
               playerHuman(input, grid);
        }
    } //end of gamePlay method
 
    public static void loadGrid(String[][] grid) {
         int startingNumber = 0;
          for(int i = 0; i < 3; i++) //outer for loop to load row numbers
            {  
                for(int j = 0; j < 3; j++, startingNumber++)  
                {
                   
                    grid[i][j] = String.valueOf(startingNumber); //inner for loop to load column numbers
                   
                }//end of inner for loop
            }
    }
 
    public static void displayGrid(Scanner input, String[][] grid) {
       
   
        System.out.println("TIC-TAC TOE");
        System.out.println();
        System.out.println("|-----|");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("|"+grid[i][j]);
            }
            System.out.println("|");
        }
       
        System.out.println("|-----|");
 
        }
 
    public static void playerComputer(Scanner input, String[][] grid) {
       
         String computerMove = validateMove(grid, input);
         
         
         
         switch (computerMove)
         {
            case "0":
               
                grid[0][0] = "O";
                moveTracker[0] = "O";
                break;
           
            case "1":
               
                grid[0][1] = "O";
                break;
               
            case "2":
               
                grid[0][2] = "O";
                break;
               
            case "3":
               
                grid[1][0] = "O";
                break;
               
            case "4":
 
                grid[1][1] = "O";
                break;
               
            case "5":
               
                grid[1][2] = "O";
                break;
               
            case "6":
               
                grid[2][0] = "O";
                break;
               
            case "7":
               
                grid[2][1] = "O";
                break;
               
            case "8":
               
                grid[2][2] = "O";
                break;
         } //end of switch statement
         
         moveTracker[Integer.parseInt(computerMove)] = "O";
         displayGrid(input, grid);
       
 
    } //end of computer move method
   
    public static void checkWinner(String grid[][]) {
       
     
       
        if(grid[0][0] == "O" && grid[0][1] == "O" && grid[0][2] == "O")
        {
            System.out.println("Computer Wins!");
            Winner = "computer";
        }
        if(grid[0][0] == "X" && grid[0][1] == "X" && grid[0][2] == "X")
        {
            System.out.println(playerName + "Wins!");
            Winner = playerName;
        }
        if(grid[1][0] == "O" && grid[1][1] == "O" && grid[1][2] == "O")
        {
            System.out.println("Computer Wins!");
            Winner = "computer";
        }
        if(grid[1][0] == "X" && grid[1][1] == "X" && grid[1][2] == "X")
        {
            System.out.println(playerName + "Wins!");
            Winner = playerName;
        }
        if(grid[2][0] == "O" && grid[2][1] == "O" && grid[2][2] == "O")
        {
            System.out.println("Computer Wins!");
            Winner = "computer";
        }
        if(grid[2][0] == "X" && grid[2][1] == "X" && grid[2][2] == "X")
        {
            System.out.println(playerName + "Wins!");
            Winner = playerName;
        }
        if(grid[0][0] == "O" && grid[1][0] == "O" && grid[2][0] == "O")
        {
            System.out.println("Computer Wins!");
            Winner = "computer";
        }
        if(grid[0][0] == "X" && grid[1][0] == "X" && grid[2][0] == "X")
        {
            System.out.println(playerName + "Wins!");
            Winner = playerName;
        }
        if(grid[0][1] == "O" && grid[1][1] == "O" && grid[2][1] == "O")
        {
            System.out.println("Computer Wins!");
            Winner = "computer";
        }
        if(grid[0][1] == "X" && grid[1][1] == "X" && grid[2][1] == "X")
        {
            System.out.println(playerName + "Wins!");
            Winner = playerName;
        }
        if(grid[0][2] == "O" && grid[1][2] == "O" && grid[2][2] == "O")
        {
            System.out.println("Computer Wins!");
            Winner = "computer";
        }
        if(grid[0][2] == "X" && grid[1][2] == "X" && grid[2][2] == "X")
        {
            System.out.println(playerName + "Wins!");
            Winner = playerName;
        }
        if(grid[0][0] == "O" && grid[1][1] == "O" && grid[2][2] == "O")
        {
            System.out.println("Computer Wins!");
            Winner = "computer";
        }
        if(grid[0][0] == "X" && grid[1][1] == "X" && grid[2][2] == "X")
        {
            System.out.println(playerName + "Wins!");
            Winner = playerName;
        }
        if(grid[0][2] == "O" && grid[1][1] == "O" && grid[2][0] == "O")
        {
            System.out.println("Computer Wins!");
            Winner = "computer";
        }
        if(grid[0][2] == "X" && grid[1][1] == "X" && grid[2][0] == "X")
        {
            System.out.println(playerName + "Wins!");
            Winner = playerName;
        }
       
       
    }
 
    public static void playerHuman(Scanner input, String[][] grid) {
 
 
           
        System.out.println(playerName + "'s" + " move");
       
        String humanMove = validateMove(grid, input);
       
        moveTracker[Integer.parseInt(humanMove)] = "X";

        switch (humanMove)
        {
            case "0":
                grid[0][0] = "X";
                break;
           
            case "1":
               
                grid[0][1] = "X";
                break;
               
            case "2":
               
                grid[0][2] = "X";
                break;
               
            case "3":
               
                grid[1][0] = "X";
                break;
               
            case "4":
 
                grid[1][1] = "X";
                break;
               
            case "5":
               
                grid[1][2] = "X";
                break;
               
            case "6":
               
                grid[2][0] = "X";
                break;
               
            case "7":
               
                grid[2][1] = "X";
                break;
               
            case "8":
               
                grid[2][2] = "X";
                break;
               
        } //end of switch statement
       
        displayGrid(input, grid);
       
        checkWinner(grid);
       
        if(Winner == null)
        {
           playerComputer(input, grid);
           checkWinner(grid);
        }
     
       
       
    } //end of player human method
   
 
    public static String validateMove(String[][] grid, Scanner input) {
       
        String move = input.nextLine();
        boolean check = true;
       
        while(check)
        {
            if(!move.matches("[0-8]")) {        	
            	System.out.println("matches:");

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
//            else if(move.equals("0") && grid[0][0].matches("[OX]"))
//            {
//                System.out.println("Spot taken make another move");
//                move = input.nextLine();
//                check = true;
//             
//            }
//            else if(move.equals("1") && grid[0][1].matches("[OX]"))
//            {
//                System.out.println("Spot taken make another move");
//                move = input.nextLine();
//                check = true;
//            }
//            else if(move.equals("2") && grid[0][2].matches("[OX]"))
//            {
//                System.out.println("Spot taken make another move");
//                move = input.nextLine();
//                check = true;
//            }
//            else if(move.equals("3") && grid[1][0].matches("[OX]"))
//            {
//                System.out.println("Spot taken make another move");
//                move = input.nextLine();
//                check = true;
//            }
//            else if(move.equals("4") && grid[1][1].matches("[OX]"))
//            {
//                System.out.println("Spot taken make another move");
//                move = input.nextLine();
//                check = true;
//            }
//            else if(move.equals("5") && grid[1][2].matches("[OX]"))
//            {
//                System.out.println("Spot taken make another move");
//                move = input.nextLine();
//                check = true;
//            }
//            else if(move.equals("6") && grid[2][0].matches("[OX]"))
//            {
//                System.out.println("Spot taken make another move");
//                move = input.nextLine();
//                check = true;
//            }
//            else if(move.equals("7") && grid[2][1].matches("[OX]"))
//            {
//                System.out.println("Spot taken make another move");
//                move = input.nextLine();
//                check = true;
//            }
//            else if(move.equals("8") && grid[2][2].matches("[OX]"))
//            {
//                System.out.println("Spot taken make another move");
//                move = input.nextLine();
//                check = true;
//            }
                 
   
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
        System.out.println("****** Willy Yao ******");
        System.out.println("******           ******");
        System.out.println("***********************");
        System.out.println("***********************");
        System.out.println("***********************");    
        System.out.println();
        System.out.println("Enter your name to continue");
       
        playerName = checkName(input);
       
    }
 
 
    public static String checkName(Scanner input) {
        String playerName = input.nextLine();
       
        while(!playerName.matches("[A-Za-z]+"))
            {
            System.out.println("Not a valid name enter another");
            playerName = input.nextLine();
            }
        return playerName;
    } //end of checkname method
}