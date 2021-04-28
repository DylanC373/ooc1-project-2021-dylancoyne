package ie.gmit.studenttracker;

public abstract class Student {

	// Instance Variables
	private String studentID;
	private short age;
	private boolean feesPaid;
	private int currentYear;

	// Default Constructor
	public Student() {
		this.studentID = null;
		this.age = 0;
		this.feesPaid = false;
		this.currentYear = 0;
	}

	// Parameterised Constructor
	public Student(String studentID, short age) {
		this.studentID = studentID;
		this.age = age;
	}

	// Getters and Setters
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public boolean isFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(boolean feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	// MyMethod
	public int yearsRemaining() {
		int totalYearsInCourse = 4;
		return this.currentYear - totalYearsInCourse;
	}

	// Abstract method (does not have a body)
	public abstract void preferedPronouns();

}
