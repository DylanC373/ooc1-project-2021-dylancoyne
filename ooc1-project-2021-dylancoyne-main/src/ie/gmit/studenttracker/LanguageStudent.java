package ie.gmit.studenttracker;

public class LanguageStudent extends Student {

	// Instance Variable
	private String primaryLanguage; // Stores primary language of study

	// Default Constructor
	private LanguageStudent() {
	}

	// Parameterised Constructor (2 Parameters)
	private LanguageStudent(String studentID, short age) {
		super(studentID, age);
//			this.primaryLanguage = primaryLanguage;
	}

	// Parameterised Constructor (3 Parameters)
	private LanguageStudent(String studentID, short age, String primaryLanguage) {
		super(studentID, age);
		this.primaryLanguage = primaryLanguage;
	}

	// Getters and Setters
	public String getPrimaryLanguage() {
		return primaryLanguage;
	}

	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	// Polymorphism
	@Override
	public int yearsRemaining() {
		int totalYearsInCourse = 6;
		return super.getCurrentYear() - totalYearsInCourse;
	}

	public void preferedPronouns() {
		System.out.println("My prefered pronouns are They/Them/Theris");
	}

}
