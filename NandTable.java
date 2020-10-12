import java.util.Scanner;

public class NandTable {

	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your first boolean value: ");
        boolean a = keyboard.nextBoolean();
        System.out.println("Please enter your second boolean value: ");
        boolean b = keyboard.nextBoolean();
        boolean finalOutput = !(a & b);
		System.out.println("Boolean is: " + finalOutput);
	}
}