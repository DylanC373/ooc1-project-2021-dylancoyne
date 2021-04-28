package ie.gmit.studenttracker;

public class ArrayController {

	// Fields
	private Student[] studentArray;

	// Constructors
	public ArrayController() {
	}

	public ArrayController(Student[] studentArray) {
		this.studentArray = studentArray;
	}

	public ArrayController(int arrayLength) {
		this.studentArray = new Student[arrayLength];
	}

	// Getters and Setters
	public Student[] getStudentArray() {
		return studentArray;
	}

	public void setStudentArray(Student[] studentArray) {
		this.studentArray = studentArray;
	}

	// Add Student method
	public boolean addStudent(String studentID, short age) {
		// Student is an abstract class therefore we can not use it to create an object.
		// Instead we will use the ScienceStudent Constructor to create a Student as it
		// calls the Student constructor.
		Student newStudent = new ScienceStudent(studentID, age, null); // Leave primary branch science subject null
		// Loop over the students array
		for (int i = 0; i < studentArray.length; i++) {
			// If element in array is null add student object
			if (studentArray[i] == null) {
				studentArray[i] = newStudent;
				// return true to indicate student was added successfully
				return true;
			}
		}
		// Return false if can not find null (i.e we have a full array)
		return false;
	}

	// Delete method
	public boolean deleteStudent(String studentID) {
		// Loop over array
		for (int i = 0; i < studentArray.length; i++) {
			// if array element is not null check if it equals studentID
			if (studentArray[i] != null && studentArray[i].getStudentID().equals(studentID)) {
				// If Student ID is found then delete it i.e. set element it null
				studentArray[i] = null;
				// Return true to indicate student deletion was successful
				return true;
			}
		}
		// Return false to indicate that student Id was not found
		return false;
	}

	// Count method
	public int countStudents() {
		int counter = 0;
		for (int i = 0; i < studentArray.length; i++) {
			// if array element is not null add one to counter
			if (studentArray[i] != null) {
				counter++;
			}
		}
		return counter;
	}

	// Search by ID method
	public Student searchByStudentID(String studentID) {
		// Loop over array
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null && studentArray[i].getStudentID().equals(studentID)) {
				return studentArray[i];
			}
		}
		// Return null if studentID was not found
		return null;
	}

}
