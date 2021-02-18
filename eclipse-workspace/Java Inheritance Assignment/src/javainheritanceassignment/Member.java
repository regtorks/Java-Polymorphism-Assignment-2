package javainheritanceassignment;

 class Member {
	String Name;
	int Age;
	String Phonenumber;
	String Address;
	int Salary;
	 public void printSalary() {
			System.out.println(Salary);
			
	}
}

   class Employee extends Member{
	   String specialization;
	   
   }
   
   class Manager extends Member{
	   String department;
   }
     class Ans{
    	 public static void main(String[] args) {
    		 
    		Employee e = new Employee();
    		e.Name = "Mark";
    		e.Age = 33;
    		e.Phonenumber = "02436597";
    		e.Salary = 4000;
    		e.Address = "No.4 Street, Ghana";
    		e.printSalary();
    		
    		Manager m = new Manager();
    		m.Name ="Twain";
    		m.Age = 44;
    		m.Phonenumber = "0234589";
    		m.Salary = 5000;
    		m.Address = "No.5 Street, Ghana";
    		m.printSalary();
    		
    	}
    }
    	
    
	
		

	


