import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number from which you want to print the time table: ");
        int m = input.nextInt();

        System.out.print("Enter the number to which you want to print the time table: ");
        int n = input.nextInt();

        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
