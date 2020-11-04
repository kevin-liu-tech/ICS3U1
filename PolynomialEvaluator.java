import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double xValue = 0;
        double finalAnswer = 0;
        double coefficient = 0;
        double exponent = 0;

        System.out.println("Welcome to the Polynomial Evaluator. Please enter your polynomial in the correct form.");
        StringTokenizer st = new StringTokenizer(keyboard.nextLine());
        System.out.println("Please enter your x-value.");
        xValue = keyboard.nextDouble();

        while (st.hasMoreTokens()) {
            String currentTerm = st.nextToken();

            if (currentTerm.contains("f") || currentTerm.contains("=")) { 
                coefficient = Double.parseDouble(currentTerm.substring(currentTerm.indexOf("=") + 1, currentTerm.indexOf("x^")));
                exponent = Integer.parseInt(currentTerm.substring(currentTerm.indexOf("^") + 1));
                finalAnswer += coefficient * Math.pow(xValue, exponent);
            } else if (currentTerm.contains("x") || currentTerm.contains("^")) { 
                coefficient = Double.parseDouble(currentTerm.substring(0, currentTerm.indexOf("x")));
                exponent = Integer.parseInt(currentTerm.substring(currentTerm.indexOf("^") + 1));
                finalAnswer +=  coefficient * Math.pow(xValue, exponent);
            } else if (!currentTerm.contains("x") && currentTerm.contains("^")){ 
                finalAnswer += Math.pow(xValue, Integer.parseInt(currentTerm.substring(currentTerm.indexOf("^") + 1)));
            } else if (currentTerm.contains("x") && !currentTerm.contains("^")) {
                finalAnswer += xValue * Double.parseDouble(currentTerm.substring(0, currentTerm.indexOf("x")));
            } else {
                finalAnswer += Integer.parseInt(currentTerm);
            }
        }
        System.out.println("f(" + xValue + ")=" + finalAnswer);
        keyboard.close();
    }
}