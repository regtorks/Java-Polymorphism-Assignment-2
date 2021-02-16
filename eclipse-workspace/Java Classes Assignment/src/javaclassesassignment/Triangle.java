package javaclassesassignment;
/*
 * Write a program to print the area and perimeter of 
 * a triangle having sides 3, 4 and 5 units by creating a
 * class named "Triangle" without any parameter in its
 * constructor
 */
public class Triangle {
	// Passing the variables
	int side1;
	int side2;
	int side3;
	
	// Adding constructor
	Triangle(){
		side1 = 3;
		side2 = 4;
		side3 = 5;
		
	}
	// For the area of a triangle
    void display1 () {System.out.println(side1 * side2/2);}
    // For the perimeter of a triangle
    void display2 () {System.out.println(side1 + side2 + side3 );}
     
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.display1();
		t2.display2();

	}

}
