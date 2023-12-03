import java.util.Scanner;


public class Phone {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter ");
		String user_input = input.nextLine();
		char ch_from_console = user_input.charAt(0);
		ch_from_console = Character.toUpperCase(ch_from_console);
		
		int number_on_pone = 0;
		if (Character.isLetter(ch_from_console))
		{
			if (ch_from_console <= 'C' )
				number_on_pone = 2;
			else if (ch_from_console <= 'F' )
				number_on_pone = 3;
			else if (ch_from_console <= 'I' )
				number_on_pone = 4;
			else if (ch_from_console <= 'L' )
				number_on_pone = 5;
			else if (ch_from_console <= '0' )
				number_on_pone = 6;
			else if (ch_from_console <= 'S' )
				number_on_pone = 7;
			else if (ch_from_console <= 'V' )
				number_on_pone = 8;
			else if (ch_from_console <= 'Z' )
				number_on_pone = 9;
			System.out.println("The corresponding number is " + number_on_pone);
		}
		else
			System.out.println(ch_from_console + " is an invalid input");
	}
}
	
