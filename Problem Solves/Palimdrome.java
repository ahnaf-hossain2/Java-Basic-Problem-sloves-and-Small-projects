import java.util.Scanner;

public class Palimdrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp;
        int r, sum = 0, num;
        System.out.print("Enter the digits: ");
        temp = input.nextInt();
        num = temp;

        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp /= 10;
        }

        if (sum == num)
            System.out.println(num + " Is a Palindrome");
        else
            System.out.println(num + " Is not a Palindrome");
    }
}
