package intershipExercise4;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Browser browser = new Browser();
		Scanner scanner = new Scanner(System.in);
		String input;
		do {
			System.out.println("Enter a url");
			input = scanner.nextLine();
			
			browser.addUrl(input);
			
			System.out.println("Do you want to continue (y/n) : ");
			input = scanner.nextLine();
		}while(input.equalsIgnoreCase("y"));
		scanner.close();
	}
}
