import java.util.Scanner;
import java.util.Arrays;

public class Order {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] cities = new String[3];
				
		System.out.print("Enter the first city: ");
		cities[0] = input.nextLine();
		System.out.print("Enter the second city: ");
		cities[1] = input.nextLine();
		System.out.print("Enter the third city: ");
		cities[2] = input.nextLine();
		
		Arrays.sort(cities);
		//The below print line also added the "[" and "]" characters an now in use to match desired output
		// System.out.println("The three cities in order are " + Arrays.toString(cities));
		System.out.printf("The three cities in order are " + cities[0]+ " " + cities[1] + " " + cities[2]);		
	}


}
