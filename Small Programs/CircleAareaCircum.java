import java.util.Scanner;

public class CircleAareaCircum {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);

	double radius;
	System.out.print("Give the Radius of the Circle: ");
	radius = input.nextDouble();
	System.out.println("Area of Circle: "+( 3.1416*Math.pow(radius, 2) ) );
    System.out.println("Circumference of Circle: " + (2 * 3.1416 * radius));
    input.close();
	}
}
