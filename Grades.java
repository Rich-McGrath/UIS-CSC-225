import java.util.Arrays;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] scores;
		
		
		
		System.out.print("Enter the number of Students: ");
		int numberOfStudents = input.nextInt();
		scores = new int[numberOfStudents];
		
		System.out.print("Enter in " + numberOfStudents + " scores:");
		for (int i = 0; i < numberOfStudents; i++) {
		scores[i] = input.nextInt();
		}
		//System.out.println(Arrays.toString(scores));
		
		int best = -1;
		for(int i = 0; i < numberOfStudents; i++)
		{
		    if(scores[i] > best)
		        best = scores[i];
		}
		
		String[] grades = new String[numberOfStudents];
		for(int i = 0; i < numberOfStudents; i++)
		{
		    int score = scores[i];

		    if(score >= best - 10)
		        grades[i] = "A";
		    else if(score >= best - 20)
		        grades[i] = "B";
		    else if(score >= best - 30)
		        grades[i] = "C";
		    else if(score >= best - 40)
		        grades[i] = "D";
		    else
		        grades[i] = "F";

		    scores[i] = score;
		}
		//System.out.println(Arrays.toString(scores));
		//System.out.println(Arrays.toString(grades));
		
		for(int i = 0; i < numberOfStudents; i++)
		{
			System.out.println("Student " + i + " Score is"  + scores[i] + " and grade is " + grades[i] );
			
		}
	}
}