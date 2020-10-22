import java.util.Scanner;

public class NewtonsMethod {
    public static double f(double a) {
        return 6 * Math.pow(a, 4) - 13 * Math.pow(a, 3) - 18 * Math.pow(a, 2) + 7 * a + 6;
    }
    public static double d(double a) {
        return 24 * Math.pow(a, 3) - 39 * Math.pow(a, 2) - 36 * a + 7;
    }
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Newton's Method. Please enter your initial root guess!");
        double x0 = keyboard.nextDouble();
        double x1 = x0 - f(x0)/d(x0);
        while ((x1 - x0) > 0.0001) {   
            x0 = x1;
            x1 = x0 - f(x0)/d(x0);
        }
        System.out.println("The root closest to your guess is:" + x1);
        keyboard.close();
    }
}