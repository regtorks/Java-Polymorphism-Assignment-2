package javainheritanceassignment;

 class Rectangle2 {
	
		int length;
		int breadth;
		
		public Rectangle2 (int length, int breadth) {
			this.length = length;
			this.breadth = breadth;
		}
		
	     public void printArea() {
	    	 System.out.println(length * breadth);
	     }
	     
	     public void printPerimeter() {
	    	 System.out.println(2*(length + breadth));
	     }
 }
	     class Square2 extends Rectangle2 {
	    	 int side;
	    	 public Square2 (int s) {
	    		 super (s,s);
	    	 }  	 
	     }
	 
	    class Dance{
	    
	     	public static void main(String[] args) {
			Rectangle2 r = new Rectangle2(5, 6);
			r.printArea();
			r.printPerimeter();
             
			Square2 [] a = new Square2[10];
			int k = 6;
			for (int i = 0; i < 10; i++) {
				a[i] = new Square2 (k);
				k++;
			}
			for (int i = 0; i < 10; i++) {
				a[i].printArea();
				a[i].printPerimeter();
			}
		}

	}

   
	
	

	


