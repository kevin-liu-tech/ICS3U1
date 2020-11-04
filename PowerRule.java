import java.util.Scanner;
import java.util.StringTokenizer;

public class PowerRule {
    public static void main (String[] args) {

        System.out.println("Welcome to the Power Rule. Please input your polynomial with the style guidelines that are assumed.");
        Scanner keyboard = new Scanner(System.in);
        String[] results = keyboard.nextLine().split("\\s");
        System.out.println("Please enter your x value: ");
        double x = keyboard.nextDouble();
        double sumTotal = 0;
        loop:
        for (String result : results) { 
            if (result.contains("f") || result.contains("=")) {
                continue loop;
            }
            if (result.contains("x") && result.contains("^")) { //REGULAR TERM
                double coefficient = Double.parseDouble(result.substring(0, result.indexOf("x")));
                int exponent = Integer.parseInt(result.substring(result.indexOf("^") + 1));
                sumTotal += Math.pow(x, exponent) * coefficient;
            } else if (!result.contains("x") && result.contains("^")){ //
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
