package javacompositionassignment;


	class Bookclass{
    	String name;
    	String author;
    	double price;
    	int qty;
    	
    	Bookclass(String name, String author, double price, int qty){
    	this.name = name;
    	this.author = author;
    	this.price = price;
    	this.qty =qty;
    }
    public String getName() {
    	System.out.println("Bookname :" + name);
	    return this.name;
	    
    }
    public String getAuthor() {
    	System.out.println("Author name :" + author);
    	return this.author;
    	
    }
    public double getPrice() {
    	System.out.println("Price  :" + price);
    	return this.price;
    	
    }
    public void setPrice() {
    	this.price = price;
    }
    public int getQty() {
    	System.out.println("Qty :" + qty);
    	return this.qty = qty;
    }
    public void setQty() {
    	this.qty = qty;
    }
    public String toString() {
    	String thebook = this.name + "by" + author.toString();
    	return thebook;
    }
       public static String tostring() {
		
		return null;	
    }
	}
    class Testbook{
    	public static void main(String[] args) {
    		
    		Bookclass b = new Bookclass("Middle-earth","Joseph",2000, 20);
    		b.getName();
    		b.getAuthor();
    		b.getPrice();
    		b.getQty();
    		return;
    	}
    }



