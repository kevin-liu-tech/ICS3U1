import java.util.Scanner;

public class BooleanTest {
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your a value: ");
        boolean a = keyboard.nextBoolean();
        System.out.println("Please enter your b value: ");
        boolean b = keyboard.nextBoolean();
        System.out.println("Please enter your c value: ");
        boolean c = keyboard.nextBoolean();
        System.out.println("Please enter your d value: ");
        boolean d = keyboard.nextBoolean();
        boolean endgate = ((a && b || c && d) || (c && a || a && d)) || ((c && a || a && d) || (d && b || b && c));
        System.out.println("The output value based on the truth table is: " + endgate);
        keyboard.close();
    }

}