package javainheritanceassignment;
/*
 * Create a class named 'Rectangle' with two data members 'length' and 'breadth'
and two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the
length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle'
class with its constructor having a parameter for its side (suppose s) calling the
constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a
rectangle and a square.

 */
public class Rectangle {
	int length;
	int breadth;
	
	public Rectangle (int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
     public void printArea() {
    	 System.out.println(length * breadth);
     }
     
     public void printPerimeter() {
    	 System.out.println(2*(length + breadth));
     }
     
   public  class Square extends Rectangle {
    	 int side;
    	 public Square (int s) {
    		 super (s,s);
    	 }  	 
     }
 }
    class Read{
    
     	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 6);
		r.printArea();
		r.printPerimeter();

	}

}
