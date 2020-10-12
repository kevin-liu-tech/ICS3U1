import java.util.Scanner;

public class BooleanTest {
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean a = false;
        boolean b = false; 
        boolean c = false;
        boolean d = false; 
        System.out.println("Please enter your a value: ");
        a = keyboard.nextBoolean();
        System.out.println("Please enter your b value: ");
        b = keyboard.nextBoolean();
        System.out.println("Please enter your c value: ");
        c = keyboard.nextBoolean();
        System.out.println("Please enter your d value: ");
        d = keyboard.nextBoolean();
        System.out.println("The output value based on the truth table is: ");
    }

}