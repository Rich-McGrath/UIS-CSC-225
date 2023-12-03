
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1 ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x2 and y2 ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x_calc = (Math.pow((x2 - x1), 2));
		double y_calc = (Math.pow((y2 - y1), 2));
		double total = (Math.pow((x_calc + y_calc), 0.5));
		System.out.print("The Distance between two points is " + total );
	}

}
