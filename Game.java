import java.util.Scanner;
import java.lang.Math;

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2)");
		int user_choice = input.nextInt();
		int computer_choice = (int)(Math.random() * 2);
        String user_text = " ";	
		String computer_text = " ";
		
        if (user_choice == 0)
			user_text = "scissor";
		else if (user_choice == 1)
			user_text = "rock";
		else if (user_choice == 2)
		     user_text = "paper";
		
		if (computer_choice == 0)
			computer_text = "scissor";
		else if (computer_choice == 1)
			computer_text = "rock";
		else if(computer_choice == 2)
		    computer_text = "paper";
		
		if (user_choice == 2 && computer_choice == 1)
			System.out.println("The computer is Rock. You are Paper. You win.");
		else if (computer_choice == 2 && user_choice == 1)
			System.out.println("The computer is Paper. You are Rock. You lose");
		else if (user_choice > computer_choice)
			System.out.println("The computer is " + computer_text + " 0"
					+ "You are " + user_text + " You win");
		else if (user_choice < computer_choice)
			System.out.println("The computer is " + computer_text + " You are " + user_text  + " You loose");
		else if (user_choice== computer_choice)
			System.out.println("The computer is " + computer_text + " You are " + user_text + " It's a draw");
		
			
	}
}