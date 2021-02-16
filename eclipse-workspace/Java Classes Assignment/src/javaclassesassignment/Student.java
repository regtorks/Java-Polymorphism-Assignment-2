package javaclassesassignment;

public class Student {
	// Passing the variables
	String name;
	int roll_no;
	
	// Parameterized constructor
	Student (String n, int r){
		name = n;
		roll_no = r;
	}
	void display() {System.out.println(name + " " + roll_no);
	}

	public static void main(String[] args) {
		Student s1 = new Student("John", 2);
		s1.display();

	}

}
