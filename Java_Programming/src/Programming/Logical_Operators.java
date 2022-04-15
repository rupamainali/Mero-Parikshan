package Programming;

public class Logical_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 5, c = 3;
		
		boolean myResult = a > b && b > c;
		System.out.println("Result of Logical Operator And:"+myResult); //And
		
		
		boolean myFish = a > b && b < c;
		System.out.println("Result of Logical Operator And:"+myFish);
		
		boolean myDish = a < b && b < c;
		System.out.println("Result of Logical Operator And:"+myDish);
		
		
		myResult = true && false;
		System.out.println("Result of Logical Operator And:"+myResult);
		
		
		myResult = a < b || b < c;
		System.out.println("Result of Logical Operator OR:"+myResult); //OR
		
		myResult = a > b || b < c;
		System.out.println("Result of Logical Operator OR:"+myResult);
		
		myResult =  !(a < b);
		System.out.println("Result of Logical Operator Not:"+myResult); //Not
	}
	

}
