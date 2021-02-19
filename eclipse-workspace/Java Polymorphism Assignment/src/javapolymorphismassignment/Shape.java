package javapolymorphismassignment;

public class Shape {
	private String color;
	
	public Shape (String color){
		this.color = color;
	}
	
	public double getArea() {
		System.out.println();
		return 0;
	}
	
	public String toString() {
		return "Shape of color=\"" + color + "\"";
	}
}
 class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(String color,int length, int width) {
		super (color);
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {	
		return length * width;
	}
	
	public String toString() {
		return "Rectangle of length=" + length + " and width=" + width + 
				"subclass of " + super.toString();
	}
 }
 
 class Triangle extends Shape{
	 private int base;
	 private int height;
	 
	 Triangle(String color, int base, int height){
		 super (color);
		 this.base = base;
		 this. height = height;
		 
	 }
	 public double getArea() {
		 return 1/2 * (base * height);
	 }
	 
	 public String tostring( ) {
		 return "Triangle of base=" + base + " and height=" + height + 
				 "subclass of " + super.toString();
	 }
 }
	
 class TestShape{
	public static void main(String[] args) {
		Shape s1 = new Rectangle ("blue", 6, 8);
		System.out.println(s1);
		System.out.println("Area is " + s1.getArea());
		
		Shape s2 = new Triangle ("green", 5, 7);
		System.out.println(s2);
		System.out.println("Area is " + s2.getArea());

	}

}
