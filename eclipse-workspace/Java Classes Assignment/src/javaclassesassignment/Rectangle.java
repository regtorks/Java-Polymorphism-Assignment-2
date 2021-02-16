package javaclassesassignment;
/*
 * Write a program to print the area of two rectangles having sides (4,5) and (5,8)
respectively by creating a class named 'Rectangle' with a method named 'Area' which
returns the area and length and breadth passed as parameters to its constructor.

 */
public class Rectangle {
   // First rectangle
	int length;
	int breadth;
	
	Rectangle (int l, int b){
		length = l;
		breadth = b;
	
  }
	public int getArea() {
		return length * breadth;
		
	}
	public static void main(String[] args) {
		Rectangle x = new Rectangle(4,5);
		Rectangle y = new Rectangle (5, 8);
		System.out.println("Area : "+ x.getArea());
		System.out.println("Area : "+ y.getArea());
	}
	}

