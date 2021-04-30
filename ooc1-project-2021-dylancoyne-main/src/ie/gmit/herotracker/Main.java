package ie.gmit.herotracker;

//Scanner
import java.util.Scanner;

/**
 * This is the Main method.
 */
public class Main {

	//print statement.
	public static void main(String[] args) {

		// Instantiate Scanner class so we can start reading user input
		Scanner userInput = new Scanner(System.in);
		// Used to store user Menu option selection
		int userSelection = 0;
		// Used to create and manipulate array
		ArrayController ac = new ArrayController(5);

		// Create infinite while loop to display Menu after every command
		while (true) {
			// Display Menu to console
			System.out.println("");
			System.out.println("##################################");
			System.out.println("#      Hero Application v0.9  #");
			System.out.println("##################################");
			System.out.println("(1) Add a Hero.");
			System.out.println("(2) Delete a Hero.");
			System.out.println("(3) Show total Number of Heroes.");
			System.out.println("(4) Search for a Hero by ID.");
			System.out.println("(5) Quit.");
			System.out.println("Select an option from 1 to 5 and press Enter>");

			// Store user Menu option selection
			userSelection = userInput.nextInt();

			// Execute option
			if (userSelection == 1) { // Add Hero
				System.out.println("Enter Hero ID>");
				String heroID = userInput.next();
				System.out.println("Enter age of Hero>");
				short age = userInput.nextShort();

				boolean result = ac.addHero(heroID, age);

				System.out.println(result);
			} else if (userSelection == 2) { // Delete
				System.out.println("Enter Hero ID>");
				String heroID = userInput.next();

				boolean result = ac.deleteHero(heroID);

				System.out.println(result);

			} else if (userSelection == 3) { // Count
				System.out.println(ac.countHeroes());
			} else if (userSelection == 4) { // Search
				System.out.println("Enter Hero ID>");
				String heroID = userInput.next();

				Hero newHero = ac.searchByheroID(heroID);

				if (newHero == null) {
					System.out.println("Hero NOT found");
				} else {
					System.out.println("Hero found!");
				}
			} else if (userSelection == 5) { // quit
				break;
			} // End If/Else
		} // End while

	} // End main method
} // End Main Class
