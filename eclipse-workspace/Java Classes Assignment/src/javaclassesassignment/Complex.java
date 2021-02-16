package javaclassesassignment;

import java.util.Scanner;

/*
 * Print the sum, difference, and product of two complex numbers by creating a class
named 'Complex' with separate methods for each operation whose real and imaginary
parts are entered by the user. Please find the implementation of an operation for your
understanding.
public static Complex divide(Complex a, Complex b){
return new Complex((a.real/b.real),(a.imag/b.imag));
}

 */
public class Complex {
         int real;
         int imagin;
       Complex (int r, int i ){
    	   real = r;
    	   imagin = i;
       }
 public static Complex add(Complex r, Complex i) {
	 return new Complex((r.real+i.real), (r.imagin+i.imagin));
	 
 }
 
 public static Complex diff(Complex r, Complex i) {
	 return new Complex((r.real-i.real), (r.imagin-i.imagin));
	 
 }
 public static Complex product(Complex r, Complex i) {
	 return new Complex((r.real*i.real), (r.imagin*i.imagin));
 }
     
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r,i;
		System.out.print("Enter real number: ");
		r = input.nextInt();
		System.out.print("Enter imaginary number: ");
		i = input.nextInt();
		
		Complex a = new Complex(r, i);
		Complex b = new Complex (r, i);
		
		System.out.println("Addition: " +r + " + i" + i );
		System.out.println("Subtraction: " +r + "- i" + i);
		System.out.println("Multiplication: " +r + " *i" + i);
	    
		
		
		
	
		
		
				
	
	   
	    
	   }
		
		
		}
		  
		   
	   
		
	
		
		
	


