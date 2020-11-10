import java.util.Scanner;

public class TicTacToe {

    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        String[][] board = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

        System.out.println("Welcome to the Tic Tac Toe game! There will need to be two players and to make a move, you simply wait for your turn and enter the place on the board that you want to make a move for.");
        System.out.println("1. Please follow the prompts and enter the position that you would like to play your move on.");
        System.out.println("2. Ensure that you only enter numbers from 1-9.");
        System.out.println("3. Have fun! Down below will be the reference board for the positions.");
        drawBoard(board);
        playerTurn(board);
        
        String userInputLocation = keyboard.nextLine();
        for userInputLocation
            Double.parseDouble(userInputLocation) % 3;

        // step 1: welcome the user to the program, provide instructions 
        // step 2: get player to choose which player they are
        // step 3: create condition to repeat if the user enters something stupid
        // step 4: draw the player board
        // step 5: prompt user to enter their play
        // step 6: check to see if a single player has won
        // step 7: if they've won end the game, and if no one has then keep playing until it's full, and then say it's a tie
    }

    public static void drawBoard(String[][] board) {
        System.out.println("-----------------");
        System.out.println("  " + board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2]);
        System.out.println("-----------------");
        System.out.println("  " + board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2]);
        System.out.println("-----------------");
        System.out.println("  " + board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2]);
        System.out.println("-----------------");
    }


    public static void playerTurn (String[][] board) {
        boolean gameOver = false;
        Scanner keyboard = new Scanner(System.in);
        
        while (!gameOver) {
            System.out.println("Player X turn, please enter your location with the coordinate for row: ");
            int userRowA = keyboard.nextInt();
            System.out.println("Player X turn, please enter your location with the coordinate for column: ");
            int userColumnA = keyboard.nextInt();
            board[userRowA][userColumnA] = "x";
            drawBoard(board);
            if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
                if (board[0][0] == "x") {
                    System.out.println("Congratulations, Player A. You have won the game!");
                    gameOver = true;
                } else {
                    System.out.println("Congratulations Player B. You have won the game!");
                    gameOver = true;
                }
            }
            System.out.println("Player O turn, please enter your location with the coordinate for row: ");
            int userRowB = keyboard.nextInt();
            System.out.println("Player O turn, please enter your location with the coordinate for column: ");
            int userColumnB = keyboard.nextInt();
            board[userRowB][userColumnB] = "o";
            drawBoard(board);
            if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
                if (board[0][0] == "x") {
                    System.out.println("Congratulations, Player A. You have won the game!");
                    gameOver = true;
                } else {
                    System.out.println("Congratulations Player B. You have won the game!");
                    gameOver = true;
                }
            }
        }
    }
}