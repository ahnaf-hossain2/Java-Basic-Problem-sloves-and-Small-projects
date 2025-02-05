import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n, sum = 0;
        System.out.print("Enter the value of m: ");
        m = input.nextInt();
        System.out.print("Enter the value of n: ");
        n = input.nextInt();

        for (int i = m; i <= n; ++i) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(" Sum of odd numbers from m to n is: " + sum);
        input.close();
    }
}
