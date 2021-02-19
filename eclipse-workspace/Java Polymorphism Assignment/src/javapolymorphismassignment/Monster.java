package javapolymorphismassignment;

 public class Monster {
    protected  String name;
      
      Monster (String name){
    	  this.name = name;  
      }
      
      public String attack() {
    	  return "how do I attack ?";
      }}

      class Firemonster extends Monster {
    	  public Firemonster(String name) {
    		  super (name);
      }
       
      public String attack() {
    	  return name + "Attack with Fire";
      }}
      
      class Watermonster extends Monster {
    	  public Watermonster(String name) {
    		  super (name);
    	  }
    	  
    	  public String attack() {
    		  return name + "Attack with water";
    	  }}
    	  
    	  class Stonemonster extends Monster {
    		  public Stonemonster(String name) {
    			  super (name);
    		  }
    		  
    		  public String attack() {
    			  return name + "Attack with stones";
    		  }
    	  }
      
      class Testmonster{
	public static void main(String[] args) {
	 
		Monster m1 = new Firemonster ("Destroyer");
		Monster m2 = new Watermonster ("Water Canon");
		Monster m3 = new Stonemonster ("Stone haulage");
		
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
		

	}

}
