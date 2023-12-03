import java.util.Scanner;
import java.lang.Math;

public class Cost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		double weight_1 = input.nextDouble();
		double price_1 = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		double weight_2 = input.nextDouble();
		double price_2 = input.nextDouble();
		
		double p1_price_per_weight = price_1 / weight_1;
		double p2_price_per_weight = price_2 / weight_2;
		
		if (p1_price_per_weight > p2_price_per_weight)
			System.out.print("Package 2 has a better price: ");
		else if (p2_price_per_weight > p1_price_per_weight)
			System.out.print("Package 1 has a better price: ");
		else if (p1_price_per_weight == p2_price_per_weight)
		System.out.print("Two packages have the same price.");
	}

}
