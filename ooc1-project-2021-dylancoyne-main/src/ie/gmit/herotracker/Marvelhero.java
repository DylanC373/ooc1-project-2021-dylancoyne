package ie.gmit.herotracker;

public class Marvelhero extends Hero {

	// Instance Variable
	private String primaryBranch; // Stores main branch (marvel dc etc) 

	// Default Constructor
	public Marvelhero() {
	}

	// Parameterised Constructor (2 Parameters)
	public Marvelhero(String heroID, short age) {
		super(heroID, age);

	}

	// Parameterised Constructor (3 Parameters)
	public Marvelhero(String heroID, short age, String primaryBranch) {
		super(heroID, age);
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
