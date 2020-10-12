import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Quadratic Formula solver! Here you can enter your values along the lines of a, b, c and expect the output to provide you with the roots for the equation.");
        System.out.println("Please enter your a value: ");
        double a = keyboard.nextDouble();
        System.out.println("Please enter your b value: ");
        double b = keyboard.nextDouble();
        System.out.println("Please enter your c value: ");
        double c = keyboard.nextDouble();
        System.out.println("Root 1 is " + (-b + Math.sqrt(b * b - 4*a*c)) / (2*a) + " and Root 2 is " + (-b - Math.sqrt(b * b - 4*a*c)) / (2*a));
        System.out.println("Thank you for using this program! Have a good day!");
        keyboard.close();
    }
}