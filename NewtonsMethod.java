import java.util.Scanner;

public class NewtonsMethod {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double guess = 0.0;
        double newGuess = 0.0;

        loop:
        while (true) {
            System.out.println("Welcome to Newton's Method. Please enter your initial root guess!");
            guess = keyboard.nextDouble();
            
            newGuess = guess - (6 * Math.pow(guess, 4) - 13 * Math.pow(guess, 3) - 18 * Math.pow(guess, 2) + 7 * guess + 6)/(24 * Math.pow(guess, 3) - 39 * Math.pow(guess, 2) - 36 * guess + 7);
            
            while (Math.abs(guess - newGuess) > 0.00001) {   
                guess = newGuess;
                newGuess = guess - (6 * Math.pow(guess, 4) - 13 * Math.pow(guess, 3) - 18 * Math.pow(guess, 2) + 7 * guess + 6)/(24 * Math.pow(guess, 3) - 39 * Math.pow(guess, 2) - 36 * guess + 7);
            }
            System.out.println("The root closest to your guess is:" + newGuess);
            
            System.out.println("Would you like to Guess again?: (1 - yes, or 2 - no");
            if (keyboard.nextInt() == 2) {
                System.out.println("Thank you for using this program!");
                break loop;
            }
        }
        keyboard.close();
    }
}