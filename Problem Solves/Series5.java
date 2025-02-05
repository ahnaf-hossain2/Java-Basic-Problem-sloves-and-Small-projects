// 1*2*3*....*n series
import java.util.Scanner;

public class Series5 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, multi = 1;
		System.out.print("Enter n: ");
		n = input.nextInt();

        for (int i = 1; i <= n; ++i) {
			System.out.print(i+" ");
            multi = multi * i;
		}
        System.out.println("\n"+multi);
        input.close();
	}
}
