import java.util.Scanner;

public class HelperMethods {
    
    public static void quadraticFormula(double a, double b, double c) {
        double rootOne = (-b + Math.sqrt(b * b - 4*a*c)) / (2*a);
        double rootTwo = (-b - Math.sqrt(b * b - 4*a*c)) / (2*a);
        System.out.println("Root 1 is " + rootOne + " and Root 2 is " + rootTwo);
    }

    public static double piApproximation(int n) {
        double equation = 0; 
        double finalOutputSum = 0;
        
        if (n < 0) {
            System.out.println("Error, please enter a valid positive integer.");
        } else {
            for (int i = 0; i < n; i ++) {
                equation = Math.pow(-1, i)/(i * 2 + 1);
                finalOutputSum += equation;
            }
            System.out.println("The output based on your n-value is " + finalOutputSum * 4);
        }
        return (finalOutputSum * 4);
    }

    public static void asymptoteFinder(int m, int n) {
        if (m == n) {
            System.out.println("The asymptote is horizontal.");
        } else if (n > m) {
            System.out.println("The asymptote is the x-axis.");
        } else {
            switch (m-n) {
                case 1:
                    System.out.println("Asymptote is Linear.");
                    break;
                case 2:
                    System.out.println("Asymptote is Quadratic.");
                    break;
                case 3: 
                    System.out.println("Asymptote is Cubic.");
                    break;
                case 4:
                    System.out.println("Asymptote is Quartic.");
                    break;
                case 5:
                    System.out.println("Asymptote is Quintic.");
                    break;
                case 6: 
                    System.out.println("Asymptote is Sextic.");
                    break;
                case 7:
                    System.out.println("Asymptote is Septic.");
                    break;
                case 8:
                    System.out.println("Asymptote is Octic.");
                    break;
                case 9: 
                    System.out.println("Asymptote is Nonic.");
                    break;
                case 10: 
                    System.out.println("Asymptote is Decic.");
                    break;
                default:
                    System.out.println("Sorry, we don't understand. Please enter valid m and n values.");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("Welcome to the Helper Methods program. Please enter 1 for Quadratic Formula, 2 for PiApproximation, and 3 for Asymptote Finder");
            int selectOption = keyboard.nextInt();
    
            if (selectOption == 1) {
                System.out.println("Welcome to the Quadratic Formula solver! Here you can enter your values along the lines of a, b, c and expect the output to provide you with the roots for the equation.");
                System.out.println("Please enter your a value: ");
                double a = keyboard.nextDouble();
                System.out.println("Please enter your b value: ");
                double b = keyboard.nextDouble();
                System.out.println("Please enter your c value: ");
                double c = keyboard.nextDouble();
                quadraticFormula(a, b, c);
            } else if (selectOption == 2) { 
                System.out.println("Welcome to the PI Approximation! Using the Gregory–Leibniz series, this program approximates the value of PI!");
                System.out.println("Please enter your n value:");
                int n = keyboard.nextInt();    
                piApproximation(n);
            } else {
                System.out.println("Welcome to the Asymptote Finder! Here you can enter the m and n values to figuer out Asymptote.");
                System.out.println("Please enter your m value: ");
                int m = keyboard.nextInt();
                System.out.println("Please enter your n value: ");
                int n = keyboard.nextInt();
                asymptoteFinder(m, n);
            }
            System.out.println("Would you like to try again? Enter 1 for yes. Enter 2 for no.");
            if (keyboard.nextInt() != 1) {
                System.out.println("Thank you for using the program. Have a good day!");
                break loop;
            }
        }
        keyboard.close();
    }
}