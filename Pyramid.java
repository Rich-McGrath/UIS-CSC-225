import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.print("Enter the number of lines: ");
				int numberOfLines = input.nextInt();

				for (int rows = 1; rows <= numberOfLines; rows++) {
					
					// Create space
					for (int space = numberOfLines - rows; space >= 1; space--) {
						System.out.print("  ");
					}

					//Decending row
					for (int lines = rows; lines >= 2; lines--) {
						System.out.print(lines + " ");
					}
					// Ascending row
					 for (int r = 1; r <= rows; r++) {
						System.out.print(r + " ");
					 }
					
					System.out.println();
				}

	}

}
