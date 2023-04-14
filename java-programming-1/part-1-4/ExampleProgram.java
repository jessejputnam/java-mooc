import java.util.Scanner;

public class ExampleProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter password");

		String password = scanner.nextLine();
		scanner.close();

		if (password.equals("Caput Draconis"))
			System.out.println("Welcome!");
		else
			System.out.println("Off with you!");
	}
}
