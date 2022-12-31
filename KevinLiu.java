import java.util.Scanner;

public class KevinLiu {

    public static void main(String[] args) {
        System.out.println(
                "Welcome to the Tic Tac Toe game! There will need to be two players and to make a move, you simply wait for your turn and enter the place on the board that you want to make a move for.\n");
        System.out.println("Here are some basic instructions:");
        System.out.println(
                "1. When entering your move, first enter the row and then the column values based on the prompts.");
        System.out.println(
                "2. Please only enter numbers from 0 to 2, inclusive. Do not enter characters, types, or numbers greater than 2.");
        System.out.println("3. Have fun!");

        String[][] board = { { "$", "$", "$" }, { "$", "$", "$" }, { "$", "$", "$" } };
        ticTacToeBoard(board);
        playerTurn(board);
        System.out.println("Thank you for playing! The game's over!");
    }

    public static void ticTacToeBoard(String[][] board) {
        System.out.println();
        for (int row = 0; row < board.length; row++) {
            System.out.println("-------------");
            System.out.print("| ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
        System.out.println();
    }

    public static void playerTurn(String[][] board) {
        boolean gameOver = false;
        int turns = 0;
        Scanner keyboard = new Scanner(System.in);

        loop: while (!gameOver) {
            try {
                if (turns % 2 == 0) {

                    System.out.println(
                            "Player X turn. Your options include: 0, or 1, or 2. Please enter your location with the coordinate for row: ");
                    int userRowA = keyboard.nextInt();
                    System.out.println(
                            "Player X turn. Your options include: 0, or 1, or 2. Please enter your location with the coordinate for column: ");
                    int userColumnA = keyboard.nextInt();

                    if (board[userRowA][userColumnA] == "$") {
                        board[userRowA][userColumnA] = "x";
                    } else {
                        System.out.println("C'mon my friend, that spot's already taken! Try again!");
                        ticTacToeBoard(board);
                        continue loop;
                    }
                } else if (turns % 2 != 0) {
                    System.out.println(
                            "Player O turn. Your options include: 0, or 1, or 2. Please enter your location with the coordinate for row: ");
                    int userRowB = keyboard.nextInt();
                    System.out.println(
                            "Player O turn. Your options include: 0, or 1, or 2. Please enter your location with the coordinate for column: ");
                    int userColumnB = keyboard.nextInt();
                    if (board[userRowB][userColumnB] == "$") {
                        board[userRowB][userColumnB] = "o";
                    } else {
                        System.out.println("C'mon my friend, that spot's already taken! Try again!");
                        ticTacToeBoard(board);
                        continue loop;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid input. Because of this, you have lost your turn.");
            }

            ticTacToeBoard(board);
            if (turns >= 4) {
                String finalWinner = turns % 2 == 0 ? "Player X" : "Player O";

                if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != "$") { // top row
                    System.out.println("Congratulations, " + finalWinner + ". You have won the game!\n");
                    gameOver = true;
                } else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != "$") { // middle
                                                                                                             // row
                    System.out.println("Congratulations, " + finalWinner + ". You have won the game!\n");
                    gameOver = true;
                } else if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != "$") { // bottom
                                                                                                             // row
                    System.out.println("Congratulations, " + finalWinner + ". You have won the game!\n");
                    gameOver = true;
                } else if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != "$") { // first
                                                                                                             // column
                    System.out.println("Congratulations, " + finalWinner + ". You have won the game!\n");
                    gameOver = true;
                } else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != "$") { // second
                                                                                                             // column
                    System.out.println("Congratulations, " + finalWinner + ". You have won the game!\n");
                    gameOver = true;
                } else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != "$") { // third
                                                                                                             // column
                    System.out.println("Congratulations, " + finalWinner + ". You have won the game!\n");
                    gameOver = true;
                } else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != "$") { // first
                                                                                                             // diagonal
                    System.out.println("Congratulations, " + finalWinner + ". You have won the game!\n");
                    gameOver = true;
                } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != "$") { // second
                                                                                                             // diagonal
                    System.out.println("Congratulations, " + finalWinner + ". You have won the game!\n");
                    gameOver = true;
                } else if (turns == 9) { // tie game
                    System.out.println("Tie Game! Congratulations to you both!\n");
                    gameOver = true;
                } else {
                    gameOver = false;
                }
            }
            turns++;
        }
        keyboard.close();
    }
}