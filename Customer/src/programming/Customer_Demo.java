package programming;

public class Customer_Demo {

	public static void main(String[] args) {
		
		Customer_Type type = new Customer_Type(112,"Mark","Privileged");
		System.out.println("Customer Name:"+type.getCustomerName());
		System.out.println("Customer Id:"+type.getCustomerId());
		System.out.println("Customer Type:"+type.getCustType());

	}

}
