package emailApp1;

import java.util.Scanner;

public class email1 {
	private  String firstname;
	private  String lastname;
	private String department;
	private String password;
	private int mailboxCapacity = 450;
	private  String altenatemail;
	private int defaultPasswordLength = 10;
	private String email;
	private String companySuffix = "edenbeck.com";
	
	// Generate the name for new worker
	private email1(String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("New worker : "+ firstname + " " + lastname) ;
		
   //Generate a random password
		this.password = ranPassword(defaultPasswordLength);
		System.out.println("Password: "+ this.password);
		
		
	// Assigning Department 
		this.department = setDepartment();
		System.out.println("DEPARTMENT: " + this.department);
	
	// Combining elements to generate email
		email = firstname.toLowerCase()+ "." + lastname.toLowerCase() + "@" + this.department + "." + this.companySuffix;
	}
	// Set the department
	public String setDepartment() {
		System.out.print(" DEPARTMENT : " + "\n1 Sales " + "\n2 Accounting" + "\n3 Development" + "\n4 None" + "\n Enter Department No.: ");
		Scanner input = new Scanner(System.in);
		 int log = input.nextInt();
		if (log == 1) {
			return "Sales";
		}
		else if (log == 2) {
			return "Accounting";
		}
		else if (log == 3) {
			return "Development";
		}
		else if (log == 4) {
			return "None";
		}
		else {
		     return "";
		}
		
	}
	
	// Set a random password
	public String ranPassword(int length) {
		String passwordblock = "ABCDEFGHIJKLMOPQRSTUVWXYZ0123456789!@#$%^&*";
		char [] password = new char[length];
		for(int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordblock.length() );
			password[i] = passwordblock.charAt(random);	
		}
		return new String(password);
	}
	
	// set method to change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// set method to change mailboxCapacity
	public void setmailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// set method for an alternate email
	public void setaltemail(String altmail) {
		this.altenatemail = altmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getaltemail() {
		return altenatemail;
	}
	
	public int getmailboxCapacity() {
		return mailboxCapacity; 
	}
	// get methods to display the name, email and mailbox capacity
	public  String showInfo() {
		return "DISPLAY NAME: " + firstname + " " + lastname +
		       "\nCOMPANY E_MAIL: " + email +
		       "\nMAILBOXCAPACITY: " + mailboxCapacity + "mb";
	}

	public static void main(String[] args) {
		email1 em = new email1("Will", "Turner");
		
		System.out.println(em.showInfo());

	}

}
