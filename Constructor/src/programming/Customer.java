package programming;

public class Customer {
	
	private int custId;
	private String custName;
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer() { //Default Constructor.
		
		System.out.println("Welcome to Java Programming."); 
	}
	
   public Customer(int customerId, String customerName, String emailId) {
	//   System.out.println("Id is:"+custId);
	//   System.out.println("Name is:"+custName);
	   
	   custId = customerId;
	   custName = customerName;
	   email = emailId;
	
  }

public int getCustId() {
	return custId;
}

public void setCustId(int custId) {
	this.custId = custId;
}

public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}
public void displayEmployeeDetails() {
	System.out.println("Customer Name:"+getCustName());
	System.out.println("Customer Id:"+getCustId());
	System.out.println("Customer Email:"+getEmail());
}

   
}
