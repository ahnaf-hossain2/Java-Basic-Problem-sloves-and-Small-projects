import java.util.Scanner;

public class DigitSum {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		int temp;
		int r, sum = 0;
		System.out.print("Enter the digits: ");
		temp = input.nextInt();

		while (temp != 0) {
			r = temp % 10;
			sum = sum + r;
			temp /= 10;
		}
		System.out.println("The SUM of digits: "+sum);
	}
}
