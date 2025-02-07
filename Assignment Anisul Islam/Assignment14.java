import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp, temp2, count = 0;
        int r, num;
        System.out.print("Enter the Starting Number: ");
        temp = input.nextInt();
        System.out.print("Enter the Ending Number: ");
        temp2 = input.nextInt();

        for (int i = temp; i <= temp2; ++i) {
            int sum = 0;
            num = i;
            while (num != 0) {
                r = num % 10;
                sum = sum * 10 + r;
                num /= 10;
            }

            if (sum == i) {
                ++count;
                System.out.println(i);
            }
        }
        System.out.println("total palindromes: " + count);
        input.close();
    }
}
