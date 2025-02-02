/**
 * Create a Java program that calculates the monthly installment amount based on the number of installments entered by the user. The program should:
 * Display the prompt "Number of installments? "
 * Accept the number of installments from the user
 * Calculate the monthly installment amount (phone price divided by number of installments)
 * Display the monthly installment amount in euros
 */
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monthlyInstallment;
        int numberOfInstallments, phonePrice;

        System.out.print("Enter phone price: ");
        phonePrice = input.nextInt();
        System.out.print("Number of installments? ");
        numberOfInstallments = input.nextInt();

        monthlyInstallment = (double)phonePrice / numberOfInstallments; // Type casting to double for floating point division.

        System.out.println("Phone price: " + phonePrice + " taka");
        System.out.println("Number of installments: " + numberOfInstallments);
        System.out.println("Monthly installment: " + monthlyInstallment + " taka");
        input.close();
    }
}
