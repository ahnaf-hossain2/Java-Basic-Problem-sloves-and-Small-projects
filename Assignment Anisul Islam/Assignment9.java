import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choose;
        System.out.println("Please select a language: ");
        System.out.println("1. Bengali.\n2. Hindi.\n3. Urdu.");
        System.out.print("Choose the number: ");
        choose = input.nextInt();

        switch (choose) {
            case 1: {
                System.out.println("Selected Language is Bengali");
                break; // Must use break statement to avoid code execution of other cases
            }
            case 2: {
                System.out.println("Selected Language is hindi");
                break;
            }
            case 3: {
                System.out.println("Selected Language is urdu");
                break;
            }
            default:
                System.out.println("Selected Language is English");
        }
        input.close();
    }
}
