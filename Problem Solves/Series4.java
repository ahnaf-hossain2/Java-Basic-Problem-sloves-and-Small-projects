//1^2+2^2+3^2+....+n^2 series
import java.util.Scanner;

public class Series4 {
    	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, sum = 0;
		System.out.print("Enter n: ");
		n = input.nextInt();

        for (int i = 1; i <= n; ++i) {
			System.out.print(i+"^2 ");
            sum = sum + (i * i);
		}
        System.out.println("\n"+sum);
        input.close();
	}
}
