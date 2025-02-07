import java.util.Scanner;

public class Armstrong {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		int temp, num, r, sum = 0;
		System.out.print("Enter the number: ");
		temp = input.nextInt();
		num = temp;

		while (temp != 0) {
			r = temp % 10;
			sum = sum + (int)Math.pow(r, 3); // Type casting to int because Math.pow() returns double
			temp /= 10;
		}

		if (sum == num) {
			System.out.println("This is an Armstrong number!");
		} else {
			System.out.println("Not an Armstrong number!");
		}

		input.close();
	}
}
