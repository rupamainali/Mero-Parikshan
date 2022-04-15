package programming;

public class Customer_Type  extends Customer{
	String custType;

	public Customer_Type(int customerId, String customerName, String custType) {
		super(customerId, customerName);
		this.custType = custType;
		
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
