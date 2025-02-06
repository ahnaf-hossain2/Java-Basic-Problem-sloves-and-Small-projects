import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any positive number: ");
        int num = input.nextInt();
        int count = 0;
        if (num == 0 || num == 1) {
            System.out.println("Not a prime number");
        } else {
            for (int i = 2; i < num / 2; ++i) { // a number can never be divided by more than half of it's value
                if (num % i == 0) {
                    System.out.println("Not a prime number");
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime number");
            }
        }
    }
}
