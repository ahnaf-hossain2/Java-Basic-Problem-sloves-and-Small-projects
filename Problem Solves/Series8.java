//1^2*2^2*3^2*....*n^2 series
import java.util.Scanner;

public class Series8 {
    	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, multi = 1;
		System.out.print("Enter n: ");
		n = input.nextInt();

        for (int i = 1; i <= n; ++i) {
			System.out.print(i+"^2 ");
            multi = multi * (i * i);
		}
        System.out.println("\n"+multi);
        input.close();
	}
}
