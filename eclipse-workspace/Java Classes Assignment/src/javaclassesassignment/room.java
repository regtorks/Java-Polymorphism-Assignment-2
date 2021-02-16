package javaclassesassignment;
/*
 * Write a program to create a room class, the attributes of this class is roomno, roomtype,
roomarea and ACmachine. In this class the member functions are setdata and
displaydata.
 */

public class room {
	int roomno;
	String roomtype;
	int roomarea;
	String Acmachine;
	
	public room() {
		
	}
    public void setNumber(int num) {
    	roomno = num;
    }
    public void setArea(int a) {
    	roomarea = a;
    }
    public void setType(String t) {
    		roomtype = t;
    	}		
    public void setAc(String Ac) {
    	  Acmachine = Ac;
    }
     public void displayData() {
    	 
    }
	}


