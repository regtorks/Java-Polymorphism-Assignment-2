package javacompositionassignment;

 class Author {
	private String name;
	private String email;
	private char gender;
	
	Author (String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		
		System.out.println("Name : " + name);
		return this.name;
		
	}
    
	public String getEmail() {
		System.out.println("Email : " + email);
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		System.out.println("Gender :" + gender);
		return gender;
	}
	
	public String toString() {
		String info = this.name + "(" + this.gender + ") at " + this.email;
		return info;
	}

	public static String tostring() {
		
		return null;
	}
	}
   
    class Res{
	public static void main(String[] args) {
		
	 Author a = new Author ("Joseph", "Joseph@gmail.com", 'M');
	   a.getName();
	   a.getEmail();
	   a.getGender();
	    return;   
	}

}
    