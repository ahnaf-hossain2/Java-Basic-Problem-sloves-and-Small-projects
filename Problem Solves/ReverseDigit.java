import java.util.Scanner;

public class ReverseDigit {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		int temp, r;
		System.out.print("Enter the digits: ");
        temp = input.nextInt();
        System.out.println("Original number: " + temp);
        System.out.print("Reverse number: ");
        while (temp != 0) {
            r = temp % 10;
            System.out.print(r);
            temp /= 10;
        }
        
        input.close();
	}
}
