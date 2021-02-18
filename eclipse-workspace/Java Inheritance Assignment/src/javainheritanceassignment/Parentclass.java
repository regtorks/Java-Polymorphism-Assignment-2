package javainheritanceassignment;

	/*
	 * Create a class with a method that prints "This is parent class" and its subclass with
	another method that prints "This is child class". Now, create an object for each of the
	class and call
	a. 1 - method of parent class by the object of the parent class
	b. 2 - method of child class by the object of the child class
	c. 3 - method of parent class by the object of the child class
	 */
	  class Parentclass {
		public void pmethod() {
			System.out.println("This is a parent class");
		}
		}
	   class Child extends Parentclass{
		 public void cmethod() {
			  System.out.println("This is a child class");
		  }
	  }
		 class Test1{
	    	  public static void main(String[] args) {
	  			Parentclass P = new Parentclass();
	  			Child C = new Child();
	  			
	  			P.pmethod();
	  			C.cmethod();
	  			C.pmethod();		
	    	  }
	}


