package javaclassesassignment;

import java.util.Scanner;

/*
 * Write a program to print the area of a rectangle by creating a class named 'Area' taking
the values of its length and breadth as parameters of its constructor and having a
method named 'returnArea' which returns the area of the rectangle. The length and
breadth of the rectangle are entered through the keyboard.
 */
public class Area {
	 int length;
	 int breadth;
	 
	 Area(int l, int b){
		 length = l;
		 breadth = b;
	 }
	 public int returnArea() {
		 return length * breadth;
	 }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l,b;
		System.out.print("Enter length : ");
		l = input.nextInt();
		System .out.print("Enter breadth : ");
		b = input.nextInt();
		
		Area a = new Area(l,b);
		System.out.println("Area : "+ a.returnArea());

	}

}
