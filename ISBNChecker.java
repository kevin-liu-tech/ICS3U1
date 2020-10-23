import java.util.Scanner;

public class ISBNChecker {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the ISBN Checker! Please enter your 13 digit checker to verify that it's valid.");
        loop:
        while (true) {
            String fullValue = keyboard.nextLine(); 
            int finalCalc = 0;
            int initialCalc = 0;
            if (fullValue.length() != 13){
                System.out.println("This is not a valid ISBN. Please try again.");
            } else {
                for (int i = 0; i < 13; i++) {
                    initialCalc = fullValue.charAt(i);
                    if (i % 2 == 0) {
                        finalCalc += (initialCalc * 1);
                    } else {
                        finalCalc += (initialCalc * 3);
                    }
                }
                if (finalCalc % 10 == 0) {
                    System.out.println("The ISBN Number you have entered is valid.");
                    break loop;
                } else {
                    System.out.println("The ISBN Number you have entered is not valid.");
                    break loop;
                }
            }
        }
        keyboard.close();
    }
}
