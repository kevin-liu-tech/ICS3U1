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
        boolean gate1 = a&&b;
        boolean gate2 = c&&d;
        boolean gate3 = c&&a;
        boolean gate4 = a&&d;
        boolean gate5 = b&&d;
        boolean gate6 = b&&c;
        boolean gate7 = gate1 || gate2;
        boolean gate8 = gate3 || gate4;
        boolean gate9 = gate5 || gate6;
        boolean gate10 = gate7 || gate8;
        boolean gate11 = gate8 || gate9;
        boolean gate12 = gate10 || gate11;
        System.out.println("The output value based on the truth table is: " + gate12);
        keyboard.close();
    }

}