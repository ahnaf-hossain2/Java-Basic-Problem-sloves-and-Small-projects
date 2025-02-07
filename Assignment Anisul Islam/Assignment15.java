import java.util.Scanner;

public class Assignment15 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		int temp, temp2, num, r, sum, count = 0;
		System.out.print("Enter the starting number: ");
		temp = input.nextInt();
        System.out.print("Enter the ending number: ");
		temp2 = input.nextInt();

        for (int i = temp; i <= temp2; ++i) {
            sum = 0;
            num = i; // I will be keeping the original number in i and using num for the calculation
            while (num != 0) {
                r = num % 10;
                sum = sum + (int) Math.pow(r, 3);
                num /= 10;
            }
            if (sum == i) {
                ++count;
                System.out.println("Armstrong number: " + i);
            }
        }
        System.out.println("Total Armstrong number: " + count);

		input.close();
	}
}
