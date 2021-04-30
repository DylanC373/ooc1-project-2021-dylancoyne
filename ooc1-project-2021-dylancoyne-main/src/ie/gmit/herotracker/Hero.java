package ie.gmit.herotracker;

public abstract class Hero {

	// Instance Variables
	private String heroID;
	private short age;
	private boolean dead;
	private int debutYear;

	// Default Constructor
	public Hero() {
		this.heroID = null;
		this.age = 0;
		this.dead = false;
		this.debutYear = 0;
	}

	// Parameterised Constructor
	public Hero(String heroID, short age) {
		this.heroID = heroID;
		this.age = age;
	}

	// Getters and Setters
	public String getheroID() {
		return heroID;
	}

	public void setheroID(String heroID) {
		this.heroID = heroID;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public boolean isdead() {
		return dead;
	}

	public void setdead(boolean dead) {
		this.dead = not dead;
	}

	public int getdebutYear() {
		return debutYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	// MyMethod
	public int yearsOld() {
		int currentYear = 2021;
		return this.currentYear - debutyear;
	}

	// Abstract method (does not have a body)
	public abstract void preferedPronouns();

}
