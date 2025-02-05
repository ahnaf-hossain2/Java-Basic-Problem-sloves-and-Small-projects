// 1.5*2.5*3.5*....*n series
import java.util.Scanner;

public class Series7 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double n, multi = 1;
		System.out.print("Enter n: ");
		n = input.nextDouble();

        for (double i = 1.5; i <= n; ++i) {
			System.out.print(i+" ");
            multi = multi * i;
		}
        System.out.println("\n"+multi);
        input.close();
	}
}
