package javapolymorphismassignment2;

 class Firm {

	public static void main(String[] args) {
		Staff personnel = new Staff();
		personnel.payday();	
		}}
		
	 class Staff{
		Staffmember[] stafflist;
		
		public Staff() {
			stafflist = new Staffmember[8];
			stafflist[0] = new Executive ("Mark", "No.4 Lane,Ghana"," 02439687","245-233-25",
					2000.20);
			stafflist[1] = new Employee ("Driscoll","Mulberry street 2, Ghana","0259984",
					"356-569-25", 600.15);
			stafflist[2] = new Employee ("Berry", "Sunset heights 3,Ghana", "02897546",
					"569-589-25", 750.12);
			stafflist[3] = new Hourly ("Mary", "Marigold lane 4, Ghana", "02698756", 
					"253-487-36",8.52);
			stafflist[4] = new Volunteer ("Rock", "Space close 2, Ghana", "0236987");
			stafflist[5] = new Volunteer ("De Souza", "Beach road 6, Ghana", "0245893");
			stafflist[6] = new Commission ("Martin", "No. 8 Drury Lane, Ghana", "0245893",
					"256-698-56",6.25,0.2);
			stafflist[7] = new Commission ("Sparrow", "Carribean lights 5", "0236598", 
					"698-569-99", 9.75,0.15);
			
			((Executive) stafflist[0]).awardBonus(500);
			
			((Hourly)stafflist[3]).addHours (40);
		      ((Hourly)stafflist[3]).addHours (40);
		      ((Commission)stafflist[6]).addHours (40);
		      ((Commission)stafflist[7]).addHours (35);
		      ((Commission)stafflist[6]).addSales (400);
		      ((Commission)stafflist[7]).addSales (950);
		}
		public void payday() {
			double amount;

		      for (int count=0; count < stafflist.length; count++)
		      {
		         System.out.println (stafflist[count]);

		         amount = stafflist[count].pay();  // polymorphic

		         if (amount == 0.0)
		            System.out.println ("Thanks!");
		         else
		            System.out.println ("Paid: " + amount);

		         System.out.println ("-----------------------------------");
		}
	}

	 class Staffmember{
		protected String name;
		protected String address;
		protected String phone;
		
		public Staffmember (String name, String address, String phone){
			this.name = name;
			this.address = address;
			this.phone = phone;
		
	}
		public String toString() {
	    	   String result = "Name: "+ name + "\n";
	    	   result += "Address: "+ address + "\n";
	    	   result += "Phone: " + phone;
	    	   return result;
	       }
       public double pay() {
    	   return 0;
    	   
       }
      
	 }
	
	class Volunteer extends Staffmember{
		public Volunteer (String name, String address, String phone ){
			super(name, address, phone);
		}
		public double pay() {
			return 0.0;
		}
		
	}
	class Employee extends Staffmember{
		
	    protected String ssn;
	     protected double payrate;
		
	     public Employee (String name, String address, String phone, String ssn, double payrate){
			super (name, address, phone);
			this.ssn = ssn;
			this.payrate = payrate;
			
		}
	     public String toString() {
	    	 String result = super.toString();
	    	 result += "\n ssn : " + ssn;
	    	 return result;
	     }
	     public double pay() {
	     return payrate;
	     }
	}
	
	class Executive extends Employee{
		private double bonus;
		
		public Executive (String name, String address, String phone, String ssn, double payrate) {
			super (name, address, phone, ssn, payrate);
			bonus = 0; // yet to be awarded
		}
		public void  awardBonus( double execBonus) {
			bonus = execBonus;
		}
		public double pay() {
			double payment = super.pay() + bonus;
			bonus = 0;
			return payment;
		}
	}
	
	class Hourly extends Employee{
		private int houseWorked;
		public Hourly(String name, String address, String phone, String ssn, double payrate){
			super (name, address, phone, ssn, payrate);
			houseWorked = 0;
		}
		public void addHours(int morehours) {
			houseWorked += morehours;
		}
		public double pay() {
			double payment =payrate * houseWorked;
			houseWorked = 0;
			return payment;
		}
		public String toString() {
			String result = super.toString();
			result += "\n Current hours : " + houseWorked;
			return result;
	}
}  

    class Commission extends Hourly{
    	double totalSales2;
    	double commissionRate;
    	double payment;
    	public Commission (String name, String address, String phone, String ssn, double payrate,
    			double commissionRate2) {
    		super (name, address, phone, ssn, payrate);
    		commissionRate = commissionRate2;
    		
    	}
    	public void addSales (double totalSales) {
    		totalSales2 = totalSales;
    	}
    	public double pay() {
    		double payment = super.pay();
    		payment += (totalSales2* commissionRate);
    		return payment;
    	}
    	public String toString() {
    		String result = super.toString();
    		result += "\nTotal Sales: " + totalSales2;
   		 result += "\nCommision: " + commissionRate;  
   		 result += "\nTest: " + payment ; 
   		 
   	    return result;
   	
    	}
    }}