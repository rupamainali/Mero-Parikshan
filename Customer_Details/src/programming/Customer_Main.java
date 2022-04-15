package programming;

public class Customer_Main {

	public static void main(String[] args) {
		Customer cust = new Customer();

		cust.setCustomerId(101);
		cust.setCustomerName("Jack");
		cust.setCustomerType("Privileged");
		
		int id = cust.getCustomerId();
		String name = cust.getCustomerName();
		
		System.out.println("Customer Id:"+id);
		System.out.println("Customer Name:"+name);
		
		boolean customerType = cust.verifyCustomerType();
		
		System.out.println("Customer Type Privileged:"+customerType);
		
		int rewardPoint = cust.getRewardPoint();
		
		System.out.println("Reward Point:"+rewardPoint);
		
	}

}
