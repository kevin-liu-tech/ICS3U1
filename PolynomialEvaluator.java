import java.util.Scanner;

public class PolynomialEvaluator {

    public static void main (String[] args) {
        System.out.println("Welcome to the Polynomial Evaluator. Please input your polynomial with the style guidelines that are assumed.");
        Scanner keyboard = new Scanner(System.in);
        String[] results = keyboard.nextLine().split("\\s");
        System.out.println("Please enter your x value: ");
        double x = keyboard.nextDouble();
        double sumTotal = 0;
        loop:
        for (String result : results) { 
            if (result.contains("f") || result.contains("=")) {
                continue loop;
                /*double coefficient = Double.parseDouble(result.substring(result.indexOf("=") + 1, result.indexOf("x^")));
                int exponent = Integer.parseInt(result.substring(result.indexOf("^") + 1));
                sumTotal += Math.pow(x, exponent) * coefficient; */
            }
            if (result.contains("x") && result.contains("^")) {
                double coefficient = Double.parseDouble(result.substring(0, result.indexOf("x")));
                int exponent = Integer.parseInt(result.substring(result.indexOf("^") + 1));
                sumTotal += Math.pow(x, exponent) * coefficient;
            } else if (!result.contains("x") && result.contains("^")){
                sumTotal += Math.pow(x, Integer.parseInt(result.substring(result.indexOf("^") + 1)));
            } else if (result.contains("x") && !result.contains("^")) {
                sumTotal += x * Double.parseDouble(result.substring(0, result.indexOf("x")));
            } else {
                sumTotal += Integer.parseInt(result);
            }
        } 
        System.out.println("f(" + x + ") is " + sumTotal);
        keyboard.close();
    }

}