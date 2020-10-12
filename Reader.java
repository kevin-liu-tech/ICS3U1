import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //use this line whenever you want to get an integer from your user
        System.out.println("Please enter an integer:");
        int input = keyboard.nextInt();
        System.out.println("The integer that you have entered is: " + input);
        System.out.println("Thank you for your time! Have a good day.");
        keyboard.close();
    }
}
