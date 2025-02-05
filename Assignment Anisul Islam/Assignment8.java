import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch1, ch2;
        System.out.print("Have you completed you masters? (Y/N): ");
        ch1 = input.next().charAt(0);
        System.out.print("Are you fluent in English? (Y/N): ");
        ch2 = input.next().charAt(0);

        if ((ch1 == 'Y' || ch1 == 'y') && (ch2 == 'Y' || ch2 == 'y')) {
            System.out.println("You are eligible for the job");
        } else {
            System.out.println("You are not eligible for the job");
        }

        input.close();
    }
}
