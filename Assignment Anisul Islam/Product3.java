import java.util.Scanner;

public class Product3 {
	public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in); // I have to create another Scanner object to take integer input

		String id, title, description, category;
		int price;

		System.out.print("Enter the id: ");
		id = input1.nextLine();
		System.out.print("Enter the title: ");
		title = input1.nextLine();
		System.out.print("Enter the price: ");
        price = input2.nextInt();

		System.out.print("Enter the description: ");
		description = input1.nextLine();
		System.out.print("Enter the category: ");
		category = input1.nextLine();

		System.out.println("ID: "+id);
		System.out.println("Title: "+title);
		System.out.println("Price: "+price);
		System.out.println("Description: "+description);
        System.out.println("Category: " + category);
        input1.close();
        input2.close();
	}
}
