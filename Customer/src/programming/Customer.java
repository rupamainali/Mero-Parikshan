package programming;

public abstract class Customer {
	
	int customerId;
	String customerName;
	
	public Customer(int customerId,String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
  public abstract void display(); //Abstract Method.
}
