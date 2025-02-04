import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        System.out.print("Enter your age:  ");
        age = input.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for vote");
        }
        else if (age < 18 && age > 0) {
            System.out.println("Not eligible for vote");
        }
        else {
            System.out.println("Invalid age");
        }
        input.close();
    }
}
