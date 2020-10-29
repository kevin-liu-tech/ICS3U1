import java.util.Scanner;

public class PolynomialFunction {
    
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your coefficients: ");
        String[] coefficients = keyboard.nextLine().split("\\s");
        System.out.println("Now, please enter your exponents: ");
        String[] exponents = keyboard.nextLine().split("\\s");
        System.out.println("Please enter your x-value: ");
        double xValue = keyboard.nextDouble();
        String finalString = new String(); 
        double sumTotal = 0;
        int i = 0;
        for (String coefficient : coefficients) {
            if (!coefficient.contains("-")) {
                String term = "+ " + coefficients[i] + "x^" + exponents[i] + " ";
                finalString += term;
            } else {
                String term = coefficients[i] + "x^" + exponents[i];
                finalString += term;
            }
            sumTotal += Double.parseDouble(coefficients[i]) * Math.pow(xValue, Integer.parseInt(exponents[i]));
            i += 1;
        }
        System.out.println("Your polynomial function is: f(x) = " + finalString.substring(1));
        System.out.println("Your polynomial at: f(" + xValue + ") = " + sumTotal);
        keyboard.close();
    }
}