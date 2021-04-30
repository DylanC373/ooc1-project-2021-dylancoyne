package ie.gmit.herotracker;

public class Dchero extends Hero {

	// Instance Variable
	private String primaryLanguage; 

	// Default Constructor
	private Dchero() {
	}

	// Parameterised Constructor (2 Parameters)
	private Dchero(String heroID, short age) {
		super(heroID, age);
//			this.primaryLanguage = primaryLanguage;
	}

	// Parameterised Constructor (3 Parameters)
	private Dchero(String heroID, short age, String primaryLanguage) {
		super(heroID, age);
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
	public int yearDebut() {
		int currentyear = 2021;
		return super.getCurrentYear() - yeardebut;
	}

	public void preferedPronouns() {
		System.out.println("My prefered pronouns are They/Them/Theris");
	}

}
