import java.util.Scanner;

public class HeronsFormula {
    
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Heron's Formula solver! Enter a, b, c for area of triangle.");
        System.out.println("Please enter your a value: ");
        double a = keyboard.nextDouble();
        System.out.println("Please enter your b value: ");
        double b = keyboard.nextDouble();
        System.out.println("Please enter your c value: ");
        double c = keyboard.nextDouble();
        System.out.println("The area of your triangle is: " + 0.25 * Math.sqrt(4 * a * a * b * b - Math.pow(a * a + b * b - c * c, 2)) + " square units.");
        keyboard.close();
    }

}