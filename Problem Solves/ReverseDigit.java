import java.util.Scanner;

public class ReverseDigit {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		int temp;
		int r, sum = 0;
		System.out.print("Enter the digits: ");
		temp = input.nextInt();

		while (temp != 0) {
			r = temp % 10;
			System.out.print(r);
			temp /= 10;
		}
	}
}
