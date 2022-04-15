package programming;

public class Customer {
	
	private int custId;
	private String custName;
	private String custType;
    private int rewardPoint = 100;
	
	public void setCustomerId(int customerId) {
		custId = customerId;
		
		
		
	}
	
	public void setCustomerName(String customerName) {
		
		custName = customerName;
	}
	
	public int getCustomerId() {
		return custId;
		
	}
	public String getCustomerName() {
	    return custName;
	}
	public  void setCustomerType(String customerType) {
		
		 custType = customerType;
		
	}
	public String getCustomerType() {
		
		return custType;
		
	}
	public int getRewardPoint() {
		
		return rewardPoint;
		
	}
public void setRewardPoint(int reward) {
		
		rewardPoint = reward;
		
	}
	
	public boolean verifyCustomerType() {
		if (getCustomerType().equals("Privileged")) {
			int updatedRewardPoint = getRewardPoint()+50;
			setRewardPoint(updatedRewardPoint);
			return true;
			
		}else {
			int updatedRewardPoint = getRewardPoint()+25;
			setRewardPoint(updatedRewardPoint);
			return false;
			
		}
	
		
	}
}

