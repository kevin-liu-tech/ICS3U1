import java.util.Scanner;

public class PowerRule {

    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstDerivative = "";
        String secondDerivative = "";
        double currentCoefficient = 0;
        int currentExponent = 0;
        boolean firstTerm = true;

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

                if (!firstTerm && currentCoefficient >= 0) {
                    firstDerivative += "+";
                    secondDerivative += "+";
                }

                if (currentExponent > 1) {
                    double newCoefficient = currentCoefficient * currentExponent;
                    double newExponent = currentExponent - 1;
                    firstDerivative += newCoefficient + "x^" + newExponent + " ";

                    if (newExponent > 1) {
                        secondDerivative += (newCoefficient * newExponent) + "x^" + (newExponent - 1) + " ";
                    } else {
                        secondDerivative += newCoefficient;
                    }
                } else if (currentExponent == 1) {
                    firstDerivative += currentCoefficient;
                    secondDerivative = secondDerivative.substring(0, secondDerivative.length() - 1);
                }
                firstTerm = false;
            }
        }
        System.out.println("Your first derivative is: f'(x) = " + firstDerivative);
        System.out.println("Your second derivative is: f''(x) = " + secondDerivative);
        keyboard.close();
    }

}