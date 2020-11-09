import java.util.Scanner;

public class PowerRule {
    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String firstDerivative = "";
        String secondDerivative = "";
        double currentCoefficient = 0;
        int currentExponent = 0;
        int secondExponent = 0;

        System.out.println("Welcome to the Power Rule. This program will calculate your first and second derivatives based on your input values.");
        System.out.println("Please enter your coefficients of the function and denote each seperate term with a space:");
        String[] coefficients = keyboard.nextLine().split("\\s");
        System.out.println("Please enter your exponents of the function and denote each seperate term with a space:");
        String[] exponents = keyboard.nextLine().split("\\s");

        if (coefficients.length != exponents.length) {
            System.out.println("The number of terms and exponents don't match. Please restart the program.");
        } else {
            for (int i = 0; i < coefficients.length; i++) {
                currentCoefficient = Double.parseDouble(coefficients[i]);
                currentExponent = Integer.parseInt(exponents[i]);

                if (currentCoefficient >= 0) {
                    firstDerivative += "+";
                } else {
                    firstDerivative += "";
                }

                if (currentExponent - 1 == 1 && currentCoefficient == 1) {
                    firstDerivative += "+ x ";
                } else if (currentExponent - 1 == 0) {
                    firstDerivative += currentCoefficient + " ";
                } else if (currentExponent - 1 == 1) {
                    firstDerivative += currentCoefficient * currentExponent + "x ";
                } else if (currentCoefficient == 1 && currentExponent - 1 != 0) {
                    firstDerivative += "x^" + (currentExponent - 1);
                } else {
                    firstDerivative += (currentCoefficient * currentExponent) + "x^" + (currentExponent - 1) + " ";
                }
            }
            loop:
            for (int i = 0; i < coefficients.length; i++) {
                currentCoefficient = Double.parseDouble(coefficients[i]) * Integer.parseInt(exponents[i]);
                currentExponent = Integer.parseInt(exponents[i]) - 1;
                if (currentCoefficient > 0 && i != 0) {
                    secondDerivative += "+";
                } else if (currentCoefficient < 0){
                    secondDerivative += "";
                } else {
                    secondDerivative += "";
                }
                if (currentExponent - 1 == 1 && currentCoefficient == 1) {
                    secondDerivative += "+ x ";
                } else if (currentCoefficient == 0.0 || currentExponent  - 1 < 0) {
                    secondDerivative += "";
                } else if (currentExponent - 1 == 0) {
                    secondDerivative += currentCoefficient + " ";
                } else if (currentExponent - 1 == 1) {
                    secondDerivative += currentCoefficient * currentExponent + "x ";
                } else if (currentCoefficient == 1 && currentExponent - 1 < 0) {
                    secondDerivative += "";
                } else if (currentExponent < 0) {
                    continue loop;
                } else {
                    secondDerivative += (currentCoefficient * currentExponent) + "x^" + (currentExponent - 1) + " ";
                }
            }
        }
        System.out.println("Your first derivative is: f'(x) = " + firstDerivative.substring(1));
        System.out.println("Your second derivative is: f''(x) = " + secondDerivative.substring(0, secondDerivative.length() - 1));
        keyboard.close();
    }

}