import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Starting positive number: ");
        int num1 = input.nextInt();

        System.out.print("Enter Ending positive number: ");
        int num2 = input.nextInt();

        int count = 0;
        for (int i = num1; i < num2; ++i) {
            for (int j = 2; j <= i / 2; ++j) { // a number can never be divided by more than half of it's value
                if (i % j == 0) { // not num1 % j but it should be i % j
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime number: " + i);
            } count = 0;
        }
    }
}
