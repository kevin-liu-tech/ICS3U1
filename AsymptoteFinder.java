import java.util.Scanner;

public class AsymptoteFinder {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Asymptote Finder! Here you can enter the m and n values to figuer out Asymptote.");
        System.out.println("Please enter your m value: ");
        int m = keyboard.nextInt();
        System.out.println("Please enter your n value: ");
        int n = keyboard.nextInt();
        keyboard.close();
        if (m == n) {
            System.out.println("The asymptote is horizontal.");
        } else if (n > m) {
            System.out.println("The asymptote is the x-axis.");
        } else {
            switch (m-n) {
                case 1:
                    System.out.println("Asymptote is Linear.");
                    break;
                case 2:
                    System.out.println("Asymptote is Quadratic.");
                    break;
                case 3: 
                    System.out.println("Asymptote is Cubic.");
                    break;
                case 4:
                    System.out.println("Asymptote is Quartic.");
                    break;
                case 5:
                    System.out.println("Asymptote is Quintic.");
                    break;
                case 6: 
                    System.out.println("Asymptote is Sextic.");
                    break;
                case 7:
                    System.out.println("Asymptote is Septic.");
                    break;
                case 8:
                    System.out.println("Asymptote is Octic.");
                    break;
                case 9: 
                    System.out.println("Asymptote is Nonic.");
                    break;
                default: 
                    System.out.println("Asymptote is Decic.");
                    break; // this is a comment to show code
            }
        }
    }
}