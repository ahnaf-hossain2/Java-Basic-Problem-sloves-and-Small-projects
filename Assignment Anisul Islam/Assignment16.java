import java.util.Scanner;

public class Assignment16 {
    public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		String username, username1 = "Ahnaf", password, password1 = "31894";

        while (true) {
        System.out.print("Enter the User name: ");
		username = input.nextLine();
		System.out.print("Enter the Password: ");
		password = input.nextLine();
			if ( password.equals(password1) && username.equals(username1) ) { // using .equals() method to compare two strings
				System.out.println("Welcome to the System.");
                break;
			} else {
				System.out.println("Incorrect user or password. Please try again!");
			}
		}

        input.close();
    }
}
