import java.util.Scanner;

public class Assignment13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n, first = 0, second = 1, fibo;
		System.out.print("Which term fibonacci number do you want to see : ");
		n = input.nextInt();
        for (int i = 2; i < n; ++i) {
            fibo = first + second;
            first = second;
            second = fibo;
        } System.out.println("The " + n + "th term fibonacci number is : " + second);
        input.close();
	}
}
