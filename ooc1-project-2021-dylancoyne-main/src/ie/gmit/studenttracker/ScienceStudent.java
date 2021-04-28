package ie.gmit.studenttracker;

public class ScienceStudent extends Student {

	// Instance Variable
	private String primaryBranch; // Stores main science subject of study

	// Default Constructor
	public ScienceStudent() {
	}

	// Parameterised Constructor (2 Parameters)
	public ScienceStudent(String studentID, short age) {
		super(studentID, age);
//		this.primaryBranch = null;
	}

	// Parameterised Constructor (3 Parameters)
	public ScienceStudent(String studentID, short age, String primaryBranch) {
		super(studentID, age);
		this.primaryBranch = primaryBranch;
	}

	// Getters and Setters
	public String getPrimaryBranch() {
		return primaryBranch;
	}

	public void setPrimaryBranch(String primaryBranch) {
		this.primaryBranch = primaryBranch;
	}

	// Implementing inherited abstract method
	public void preferedPronouns() {
		System.out.println("My prefered pronouns are Ze/Hir/Hirs");
	}

}
