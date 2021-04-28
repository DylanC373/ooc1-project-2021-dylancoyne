package ie.gmit.studenttracker;

//Import the Scanner class to read user input
import java.util.Scanner;

/**
 * This is the Main class. It contains the main method.
 */
public class Main {

	// This is the main method. It contains a print statement.
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
			System.out.println("#      Student Application v0.9  #");
			System.out.println("##################################");
			System.out.println("(1) Add a Student.");
			System.out.println("(2) Delete a Student.");
			System.out.println("(3) Show total Number of Students.");
			System.out.println("(4) Search for a Student by ID.");
			System.out.println("(5) Quit.");
			System.out.println("Select an option from 1 to 5 and press Enter>");

			// Store user Menu option selection
			userSelection = userInput.nextInt();

			// Execute option
			if (userSelection == 1) { // Add Student
				System.out.println("Enter Student ID>");
				String studentID = userInput.next();
				System.out.println("Enter age of Student>");
				short age = userInput.nextShort();

				boolean result = ac.addStudent(studentID, age);

				System.out.println(result);
			} else if (userSelection == 2) { // Delete
				System.out.println("Enter Student ID>");
				String studentID = userInput.next();

				boolean result = ac.deleteStudent(studentID);

				System.out.println(result);

			} else if (userSelection == 3) { // Count
				System.out.println(ac.countStudents());
			} else if (userSelection == 4) { // Search
				System.out.println("Enter Student ID>");
				String studentID = userInput.next();

				Student newStudent = ac.searchByStudentID(studentID);

				if (newStudent == null) {
					System.out.println("Student NOT found");
				} else {
					System.out.println("Student found!");
				}
			} else if (userSelection == 5) { // quit
				break;
			} // End If/Else
		} // End while

	} // End main method
} // End Main Class
