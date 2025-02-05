import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        System.out.print("Do you love Java ? (Y/N): ");
        ch = input.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            System.out.println("You are a Java lover");
        } else if (ch == 'N' || ch == 'n') {
            System.out.println("You don't love Java");
        } else {
            System.out.println("Invalid character");
        }
    }
}
