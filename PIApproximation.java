import java.util.Scanner; 

public class PIApproximation {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the PI Approximation! Using the Gregory–Leibniz series, this program approximates the value of PI!");
        loop:
        while (true) {
            System.out.println("Please enter your n value:");
            int maxIterations = keyboard.nextInt();
            double equation = 0;
            double finalOutputSum = 0;
    
            for (int i = 0; i < maxIterations; i ++) {
                equation = Math.pow(-1, i)/(i * 2 + 1);
                finalOutputSum += equation;
            }
            System.out.println("The output based on your n-value is " + finalOutputSum * 4);
            System.out.println("Would you like to guess again? (Press 1 for yes or any other number for no): ");
            if (keyboard.nextInt() != 1) {
                System.out.println("Thank you for using the program. Have a good day!");
                break loop;
            }
        }
        keyboard.close();
    }
}