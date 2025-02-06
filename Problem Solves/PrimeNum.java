import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int num = input.nextInt();
        int count = 0;
        for (int i = 2; i < num; ++i) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                count++;
                break;
            }
        } if (count == 0) {
            System.out.println("Prime number");
        }
    }
}
