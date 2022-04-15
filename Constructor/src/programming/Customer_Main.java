package programming;

public class Customer_Main {

	public static void main(String[] args) {
	Customer cust = new Customer(); //will create the object.
	Customer Jack = new Customer(102,"Jack","Jack@gmail.com"); //Parameterized Constructor.
	
/*	int  id = Jack.getCustId();
	String name = Jack.getCustName();
	String email = Jack.getEmail();
	
	System.out.println("Id:"+id);
	System.out.println("Name:"+name);
	System.out.println("Email:"+email);*/
	
	Jack.displayEmployeeDetails();
	
	
	Jack.setCustName("Mark");
	System.out.println("Updated Name:"+Jack.getCustName());
	
	

	}

}
