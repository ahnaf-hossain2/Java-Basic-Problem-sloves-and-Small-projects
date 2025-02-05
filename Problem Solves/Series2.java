// 1+3+5+....+n series
import java.util.Scanner;

public class Series2 {
    	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, sum = 0;
		System.out.print("Enter n: ");
		n = input.nextInt();

        for (int i = 1; i <= n; i += 2) {
			System.out.print(i+" ");
            sum = sum + i;
		}
        System.out.println("\n"+sum);
        input.close();
	}
}
